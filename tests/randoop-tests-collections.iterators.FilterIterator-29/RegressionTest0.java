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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        defaultedMap1.clear();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap4.put((java.lang.Object) set22, (java.lang.Object) '#');
        java.util.Set set25 = defaultedMap4.keySet();
        int i26 = defaultedMap4.size();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b22 = defaultedMap20.equals((java.lang.Object) 0.0f);
        java.util.Set set23 = defaultedMap20.entrySet();
        boolean b24 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        boolean b28 = defaultedMap20.containsValue((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate26);
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate9);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        filterIterator10.setPredicate(predicate23);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) defaultedMap19);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b12 = defaultedMap10.equals((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) 'a');
        int i15 = defaultedMap10.size();
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) 1);
        boolean b19 = defaultedMap10.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b27 = defaultedMap25.equals((java.lang.Object) 0.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap21, (java.lang.Object) set28);
        boolean b30 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) filterIterator35);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        java.util.Iterator iterator46 = filterIterator42.getIterator();
        collections.Predicate predicate47 = filterIterator42.getPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate40, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate47);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.Predicate predicate55 = filterIterator52.getPredicate();
        java.util.Iterator iterator56 = filterIterator52.getIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        java.util.Set set48 = defaultedMap45.entrySet();
        boolean b49 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        boolean b56 = defaultedMap51.containsValue((java.lang.Object) filterIterator55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) filterIterator55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator55);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b4 = defaultedMap2.equals((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap2.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        boolean b12 = defaultedMap2.equals((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        boolean b17 = defaultedMap2.containsValue((java.lang.Object) filterIterator13);
        filterIterator0.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        filterIterator23.setPredicate(predicate27);
        filterIterator0.setIterator((java.util.Iterator) filterIterator23);
        java.util.Iterator iterator30 = filterIterator0.getIterator();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        java.lang.String str7 = defaultedMap1.toString();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap32.clear();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) defaultedMap32);
        java.util.Collection collection35 = defaultedMap32.values();
        boolean b36 = defaultedMap23.containsKey((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap54.clear();
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) defaultedMap54);
        java.util.Collection collection57 = defaultedMap54.values();
        boolean b58 = defaultedMap45.containsKey((java.lang.Object) defaultedMap54);
        java.util.Set set59 = defaultedMap54.entrySet();
        java.lang.Object obj61 = defaultedMap41.put((java.lang.Object) set59, (java.lang.Object) '#');
        java.util.Set set62 = defaultedMap41.keySet();
        java.lang.Object obj63 = defaultedMap23.get((java.lang.Object) set62);
        boolean b64 = defaultedMap1.equals((java.lang.Object) set62);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1.0f + "'", obj43.equals(1.0f));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1.0f + "'", obj63.equals(1.0f));
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b4 = defaultedMap2.equals((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap2.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        boolean b12 = defaultedMap2.equals((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        boolean b17 = defaultedMap2.containsValue((java.lang.Object) filterIterator13);
        filterIterator0.setIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator19 = filterIterator13.getIterator();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(iterator19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b12 = defaultedMap10.equals((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        collections.Predicate predicate18 = filterIterator15.getPredicate();
        java.util.Iterator iterator19 = filterIterator15.getIterator();
        boolean b20 = defaultedMap10.equals((java.lang.Object) filterIterator15);
        filterIterator4.setIterator((java.util.Iterator) filterIterator15);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap4.put((java.lang.Object) set22, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) filterIterator29);
        java.util.Set set34 = defaultedMap26.keySet();
        boolean b35 = defaultedMap4.equals((java.lang.Object) set34);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap4.put((java.lang.Object) set22, (java.lang.Object) '#');
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap4.put((java.lang.Object) set22, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) filterIterator29);
        java.util.Set set34 = defaultedMap26.keySet();
        boolean b35 = defaultedMap4.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b41 = defaultedMap39.equals((java.lang.Object) 0.0f);
        java.util.Set set42 = defaultedMap39.entrySet();
        boolean b43 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b51 = defaultedMap49.equals((java.lang.Object) 0.0f);
        boolean b53 = defaultedMap49.equals((java.lang.Object) 'a');
        boolean b54 = defaultedMap39.containsValue((java.lang.Object) defaultedMap49);
        boolean b55 = defaultedMap4.containsKey((java.lang.Object) defaultedMap39);
        java.util.Collection collection56 = defaultedMap4.values();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        boolean b18 = defaultedMap3.containsValue((java.lang.Object) defaultedMap13);
        java.util.Collection collection19 = defaultedMap13.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        boolean b18 = defaultedMap8.equals((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        boolean b23 = defaultedMap8.containsValue((java.lang.Object) filterIterator19);
        filterIterator6.setIterator((java.util.Iterator) filterIterator19);
        boolean b25 = defaultedMap1.equals((java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap27.entrySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = filterIterator31.getPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        filterIterator31.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b44 = defaultedMap42.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator45.setPredicate(predicate46);
        collections.Predicate predicate48 = filterIterator45.getPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) filterIterator45);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate50);
        java.util.Set set53 = defaultedMap27.entrySet();
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1.0f + "'", obj54.equals(1.0f));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        boolean b21 = defaultedMap12.isEmpty();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.Predicate predicate30 = filterIterator27.getPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map26, (java.lang.Object) filterIterator27);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate(map31, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 0.0f);
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        boolean b48 = defaultedMap38.equals((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = filterIterator49.getPredicate();
        boolean b53 = defaultedMap38.containsValue((java.lang.Object) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate68 = filterIterator63.getPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b72 = defaultedMap70.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) filterIterator73);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate34, predicate78);
        boolean b83 = defaultedMap13.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b4 = defaultedMap2.equals((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap2.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        boolean b12 = defaultedMap2.equals((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        boolean b17 = defaultedMap2.containsValue((java.lang.Object) filterIterator13);
        filterIterator0.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate19 = filterIterator13.getPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = filterIterator8.getPredicate();
        java.util.Iterator iterator12 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator8.setPredicate(predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) filterIterator8, (java.lang.Object) b20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) b20);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap1.containsValue(obj26);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b13 = defaultedMap11.equals((java.lang.Object) 0.0f);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 'a');
        int i16 = defaultedMap11.size();
        java.lang.Object obj18 = defaultedMap11.remove((java.lang.Object) 1);
        boolean b20 = defaultedMap11.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        boolean b27 = defaultedMap23.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.util.Iterator iterator32 = filterIterator28.getIterator();
        boolean b33 = defaultedMap23.equals((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        boolean b38 = defaultedMap23.containsValue((java.lang.Object) filterIterator34);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = filterIterator40.getPredicate();
        java.util.Iterator iterator44 = filterIterator40.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator45.setPredicate(predicate46);
        filterIterator40.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate46);
        filterIterator34.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator51 = filterIterator39.getIterator();
        java.lang.Object obj52 = defaultedMap9.put((java.lang.Object) set21, (java.lang.Object) iterator51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap57.clear();
        java.lang.Object obj59 = defaultedMap54.get((java.lang.Object) defaultedMap57);
        java.util.Collection collection60 = defaultedMap57.values();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) collection60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) collection60);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0f + "'", obj59.equals(1.0f));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator9);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate15 = null;
        filterIterator9.setPredicate(predicate15);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b25 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator31);
        java.lang.Object obj34 = defaultedMap3.remove((java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 0.0f);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = filterIterator41.getPredicate();
        java.util.Iterator iterator45 = filterIterator41.getIterator();
        boolean b46 = defaultedMap36.equals((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = filterIterator47.getPredicate();
        boolean b51 = defaultedMap36.containsValue((java.lang.Object) filterIterator47);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b55 = defaultedMap53.equals((java.lang.Object) 0.0f);
        java.util.Set set56 = defaultedMap53.entrySet();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = filterIterator57.getPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate62);
        collections.Predicate predicate64 = filterIterator61.getPredicate();
        filterIterator57.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate66 = filterIterator61.getPredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b70 = defaultedMap68.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        collections.Predicate predicate74 = filterIterator71.getPredicate();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) filterIterator71);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate76);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate76);
        boolean b80 = defaultedMap3.equals((java.lang.Object) filterIterator79);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator16);
        filterIterator6.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.Predicate predicate26 = filterIterator23.getPredicate();
        java.util.Iterator iterator27 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator23.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator23.setIterator((java.util.Iterator) filterIterator35);
        filterIterator22.setIterator((java.util.Iterator) filterIterator35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        boolean b18 = defaultedMap8.equals((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        boolean b23 = defaultedMap8.containsValue((java.lang.Object) filterIterator19);
        filterIterator6.setIterator((java.util.Iterator) filterIterator19);
        boolean b25 = defaultedMap1.equals((java.lang.Object) filterIterator19);
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        java.util.Set set18 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        boolean b25 = defaultedMap20.containsValue((java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap20.entrySet();
        boolean b27 = defaultedMap3.containsKey((java.lang.Object) defaultedMap20);
        java.util.Collection collection28 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 0.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        boolean b43 = defaultedMap38.containsValue((java.lang.Object) filterIterator42);
        int i44 = defaultedMap38.size();
        java.lang.Object obj45 = defaultedMap32.get((java.lang.Object) i44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = filterIterator46.getPredicate();
        java.util.Iterator iterator50 = filterIterator46.getIterator();
        java.lang.Object obj51 = defaultedMap32.remove((java.lang.Object) iterator50);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0f + "'", obj45.equals(1.0f));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        filterIterator30.setIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 0.0f);
        boolean b45 = defaultedMap41.equals((java.lang.Object) 'a');
        int i46 = defaultedMap41.size();
        java.lang.Object obj48 = defaultedMap41.remove((java.lang.Object) 1);
        boolean b50 = defaultedMap41.equals((java.lang.Object) 0.0f);
        java.util.Set set51 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b55 = defaultedMap53.equals((java.lang.Object) 0.0f);
        boolean b57 = defaultedMap53.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.Predicate predicate61 = filterIterator58.getPredicate();
        java.util.Iterator iterator62 = filterIterator58.getIterator();
        boolean b63 = defaultedMap53.equals((java.lang.Object) filterIterator58);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = filterIterator64.getPredicate();
        boolean b68 = defaultedMap53.containsValue((java.lang.Object) filterIterator64);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        collections.Predicate predicate73 = filterIterator70.getPredicate();
        java.util.Iterator iterator74 = filterIterator70.getIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        filterIterator70.setPredicate(predicate76);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate76);
        filterIterator64.setIterator((java.util.Iterator) filterIterator69);
        java.util.Iterator iterator81 = filterIterator69.getIterator();
        java.lang.Object obj82 = defaultedMap39.put((java.lang.Object) set51, (java.lang.Object) iterator81);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) set51, obj83);
        java.lang.String str85 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{[]=null}" + "'", str85.equals("{[]=null}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        boolean b21 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) filterIterator26);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.Predicate predicate36 = filterIterator33.getPredicate();
        java.util.Iterator iterator37 = filterIterator33.getIterator();
        collections.Predicate predicate38 = filterIterator33.getPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate31, predicate38);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate(map39, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b13 = defaultedMap11.equals((java.lang.Object) 0.0f);
        java.util.Set set14 = defaultedMap11.entrySet();
        boolean b15 = defaultedMap9.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b22 = defaultedMap17.containsValue((java.lang.Object) filterIterator21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) filterIterator21);
        java.lang.Object obj24 = defaultedMap4.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap29.clear();
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap33.equals((java.lang.Object) 0.0f);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap42.clear();
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) defaultedMap42);
        java.util.Collection collection45 = defaultedMap42.values();
        boolean b46 = defaultedMap33.containsKey((java.lang.Object) defaultedMap42);
        java.util.Set set47 = defaultedMap42.entrySet();
        java.lang.Object obj49 = defaultedMap29.put((java.lang.Object) set47, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        boolean b56 = defaultedMap51.containsValue((java.lang.Object) filterIterator55);
        java.util.Set set57 = defaultedMap51.entrySet();
        java.lang.Object obj58 = defaultedMap9.put(obj49, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap60.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap63.clear();
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b69 = defaultedMap67.equals((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap67.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap73.clear();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap76.clear();
        java.lang.Object obj78 = defaultedMap73.get((java.lang.Object) defaultedMap76);
        java.util.Collection collection79 = defaultedMap76.values();
        boolean b80 = defaultedMap67.containsKey((java.lang.Object) defaultedMap76);
        java.util.Set set81 = defaultedMap76.entrySet();
        java.lang.Object obj83 = defaultedMap63.put((java.lang.Object) set81, (java.lang.Object) '#');
        defaultedMap51.putAll((java.util.Map) defaultedMap63);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1.0f + "'", obj31.equals(1.0f));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1.0f + "'", obj44.equals(1.0f));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1.0f + "'", obj65.equals(1.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 1.0f + "'", obj78.equals(1.0f));
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.Predicate predicate36 = filterIterator33.getPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) filterIterator33);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate38);
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) collection7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b19 = defaultedMap17.equals((java.lang.Object) 0.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap24.equals((java.lang.Object) 0.0f);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.util.Iterator iterator33 = filterIterator29.getIterator();
        boolean b34 = defaultedMap24.equals((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        boolean b39 = defaultedMap24.containsValue((java.lang.Object) filterIterator35);
        filterIterator22.setIterator((java.util.Iterator) filterIterator35);
        boolean b41 = defaultedMap17.equals((java.lang.Object) filterIterator35);
        filterIterator4.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        java.util.Iterator iterator48 = null;
        filterIterator43.setIterator(iterator48);
        filterIterator4.setIterator((java.util.Iterator) filterIterator43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        defaultedMap1.clear();
        collections.Predicate predicate29 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0.0f);
        boolean b35 = defaultedMap31.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.util.Iterator iterator40 = filterIterator36.getIterator();
        boolean b41 = defaultedMap31.equals((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        boolean b46 = defaultedMap31.containsValue((java.lang.Object) filterIterator42);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        java.util.Set set51 = defaultedMap48.entrySet();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.Predicate predicate55 = filterIterator52.getPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = filterIterator56.getPredicate();
        filterIterator52.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate61 = filterIterator56.getPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b65 = defaultedMap63.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) filterIterator66);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate61, predicate71);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate29, predicate71);
        java.util.Collection collection76 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(collection76);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = filterIterator22.getPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate31 = filterIterator26.getPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap33.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) filterIterator36);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate41);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.util.Iterator iterator57 = filterIterator53.getIterator();
        boolean b58 = defaultedMap48.equals((java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        boolean b63 = defaultedMap48.containsValue((java.lang.Object) filterIterator59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b67 = defaultedMap65.equals((java.lang.Object) 0.0f);
        java.util.Set set68 = defaultedMap65.entrySet();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        filterIterator69.setPredicate(predicate70);
        collections.Predicate predicate72 = filterIterator69.getPredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        filterIterator69.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate78 = filterIterator73.getPredicate();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b82 = defaultedMap80.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        collections.Predicate predicate86 = filterIterator83.getPredicate();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) filterIterator83);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate78, predicate88);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate88);
        java.lang.Object obj92 = defaultedMap46.get((java.lang.Object) predicate88);
        filterIterator12.setPredicate(predicate88);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (-1.0f) + "'", obj92.equals((-1.0f)));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = filterIterator38.getPredicate();
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate43 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator48);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate43, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b61 = defaultedMap59.equals((java.lang.Object) 0.0f);
        boolean b63 = defaultedMap59.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = filterIterator64.getPredicate();
        java.util.Iterator iterator68 = filterIterator64.getIterator();
        boolean b69 = defaultedMap59.equals((java.lang.Object) filterIterator64);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        collections.Predicate predicate73 = filterIterator70.getPredicate();
        boolean b74 = defaultedMap59.containsValue((java.lang.Object) filterIterator70);
        filterIterator57.setIterator((java.util.Iterator) filterIterator70);
        filterIterator24.setIterator((java.util.Iterator) filterIterator57);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Map map5 = null;
        try {
            defaultedMap1.putAll(map5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.util.Set set8 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        java.util.Set set18 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.Predicate predicate30 = filterIterator27.getPredicate();
        java.util.Iterator iterator31 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator27.setPredicate(predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b39 = defaultedMap37.equals((java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap22.put((java.lang.Object) filterIterator27, (java.lang.Object) b39);
        boolean b41 = defaultedMap20.containsValue((java.lang.Object) b39);
        boolean b42 = defaultedMap3.equals((java.lang.Object) b39);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap25.clear();
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b31 = defaultedMap29.equals((java.lang.Object) 0.0f);
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap38.clear();
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) defaultedMap38);
        java.util.Collection collection41 = defaultedMap38.values();
        boolean b42 = defaultedMap29.containsKey((java.lang.Object) defaultedMap38);
        java.util.Set set43 = defaultedMap38.entrySet();
        java.lang.Object obj45 = defaultedMap25.put((java.lang.Object) set43, (java.lang.Object) '#');
        java.util.Set set46 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 'a');
        defaultedMap48.clear();
        boolean b54 = defaultedMap25.containsValue((java.lang.Object) defaultedMap48);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap25.get(obj55);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b61 = defaultedMap59.equals((java.lang.Object) 0.0f);
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap65.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap68.clear();
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) defaultedMap68);
        java.util.Collection collection71 = defaultedMap68.values();
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) defaultedMap68);
        java.util.Set set73 = defaultedMap68.keySet();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        filterIterator74.setPredicate(predicate75);
        collections.Predicate predicate77 = filterIterator74.getPredicate();
        java.lang.Object obj78 = defaultedMap68.remove((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b82 = defaultedMap80.equals((java.lang.Object) 0.0f);
        java.util.Set set83 = defaultedMap80.keySet();
        boolean b84 = defaultedMap68.equals((java.lang.Object) set83);
        boolean b85 = defaultedMap25.equals((java.lang.Object) defaultedMap68);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0f + "'", obj40.equals(1.0f));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 1.0f + "'", obj70.equals(1.0f));
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.String str25 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) ' ');
        java.util.Set set30 = defaultedMap27.keySet();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) set30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1.0f + "'", obj31.equals(1.0f));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        java.lang.String str7 = defaultedMap1.toString();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.util.Collection collection25 = defaultedMap1.values();
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        int i13 = defaultedMap8.size();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 1);
        boolean b17 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.util.Collection collection18 = defaultedMap8.values();
        boolean b19 = defaultedMap1.equals((java.lang.Object) collection18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.util.Iterator iterator7 = filterIterator3.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator3.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate13);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 0.0f);
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        boolean b48 = defaultedMap38.equals((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = filterIterator49.getPredicate();
        boolean b53 = defaultedMap38.containsValue((java.lang.Object) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate68 = filterIterator63.getPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b72 = defaultedMap70.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) filterIterator73);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate34, predicate78);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap84.clear();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap87.clear();
        java.lang.Object obj89 = defaultedMap84.get((java.lang.Object) defaultedMap87);
        java.util.Collection collection90 = defaultedMap87.values();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap87);
        java.util.Set set92 = defaultedMap87.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 1.0f + "'", obj89.equals(1.0f));
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = filterIterator8.getPredicate();
        java.util.Iterator iterator12 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator8.setPredicate(predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) filterIterator8, (java.lang.Object) b20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) b20);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 0.0f);
        java.util.Set set29 = defaultedMap26.entrySet();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        filterIterator30.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate39 = filterIterator34.getPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        collections.Predicate predicate47 = filterIterator44.getPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) filterIterator44);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate39, predicate49);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap26.containsValue(obj52);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj52);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate(map54, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        boolean b21 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.util.Collection collection23 = defaultedMap12.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap4.put((java.lang.Object) set22, (java.lang.Object) '#');
        java.util.Set set25 = defaultedMap4.keySet();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        filterIterator26.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate35 = filterIterator30.getPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        defaultedMap4.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b13 = defaultedMap11.equals((java.lang.Object) 0.0f);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.util.Iterator iterator20 = filterIterator16.getIterator();
        boolean b21 = defaultedMap11.equals((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = filterIterator22.getPredicate();
        boolean b26 = defaultedMap11.containsValue((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.util.Iterator iterator32 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        filterIterator28.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate34);
        filterIterator22.setIterator((java.util.Iterator) filterIterator27);
        boolean b39 = defaultedMap1.equals((java.lang.Object) filterIterator22);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 0.0f);
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        boolean b48 = defaultedMap38.equals((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = filterIterator49.getPredicate();
        boolean b53 = defaultedMap38.containsValue((java.lang.Object) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate68 = filterIterator63.getPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b72 = defaultedMap70.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) filterIterator73);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate34, predicate78);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) map82);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate21 = filterIterator16.getPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) filterIterator26);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate21, predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate(map33, (java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b42 = defaultedMap40.equals((java.lang.Object) 0.0f);
        boolean b44 = defaultedMap40.equals((java.lang.Object) 'a');
        int i45 = defaultedMap40.size();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 1);
        boolean b49 = defaultedMap40.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b53 = defaultedMap51.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        java.lang.Object obj59 = defaultedMap40.put((java.lang.Object) defaultedMap51, (java.lang.Object) set58);
        boolean b60 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b64 = defaultedMap62.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        filterIterator65.setPredicate(predicate66);
        collections.Predicate predicate68 = filterIterator65.getPredicate();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) filterIterator65);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.Predicate predicate75 = filterIterator72.getPredicate();
        java.util.Iterator iterator76 = filterIterator72.getIterator();
        collections.Predicate predicate77 = filterIterator72.getPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate70, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate77);
        filterIterator0.setPredicate(predicate77);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.util.Set set25 = defaultedMap22.keySet();
        boolean b26 = defaultedMap10.equals((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap10.get((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        filterIterator1.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator14.setIterator((java.util.Iterator) filterIterator18);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b11 = defaultedMap9.equals((java.lang.Object) 0.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        filterIterator13.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate22 = filterIterator17.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap24.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.Predicate predicate30 = filterIterator27.getPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) filterIterator27);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate22, predicate32);
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap9.containsValue(obj35);
        boolean b37 = defaultedMap9.isEmpty();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = filterIterator38.getPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        filterIterator38.setIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b51 = defaultedMap49.equals((java.lang.Object) 0.0f);
        boolean b53 = defaultedMap49.equals((java.lang.Object) 'a');
        int i54 = defaultedMap49.size();
        java.lang.Object obj56 = defaultedMap49.remove((java.lang.Object) 1);
        boolean b58 = defaultedMap49.equals((java.lang.Object) 0.0f);
        java.util.Set set59 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b63 = defaultedMap61.equals((java.lang.Object) 0.0f);
        boolean b65 = defaultedMap61.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        java.util.Iterator iterator70 = filterIterator66.getIterator();
        boolean b71 = defaultedMap61.equals((java.lang.Object) filterIterator66);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.Predicate predicate75 = filterIterator72.getPredicate();
        boolean b76 = defaultedMap61.containsValue((java.lang.Object) filterIterator72);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        java.util.Iterator iterator82 = filterIterator78.getIterator();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        filterIterator78.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate84);
        filterIterator72.setIterator((java.util.Iterator) filterIterator77);
        java.util.Iterator iterator89 = filterIterator77.getIterator();
        java.lang.Object obj90 = defaultedMap47.put((java.lang.Object) set59, (java.lang.Object) iterator89);
        java.lang.Object obj91 = null;
        java.lang.Object obj92 = defaultedMap9.put((java.lang.Object) set59, obj91);
        boolean b93 = defaultedMap4.equals((java.lang.Object) set59);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) set59);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(iterator89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        filterIterator6.setPredicate(predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) filterIterator6, (java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        boolean b26 = defaultedMap21.containsValue((java.lang.Object) filterIterator25);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i30 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) filterIterator35);
        java.util.Iterator iterator40 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate45 = filterIterator41.getPredicate();
        filterIterator35.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate47 = filterIterator35.getPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b51 = defaultedMap49.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.Predicate predicate55 = filterIterator52.getPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) filterIterator52);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate57);
        java.lang.Object obj59 = defaultedMap29.put((java.lang.Object) filterIterator35, (java.lang.Object) filterIterator52);
        filterIterator25.setIterator((java.util.Iterator) filterIterator35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        java.util.Collection collection17 = defaultedMap3.values();
        java.util.Map map18 = null;
        try {
            defaultedMap3.putAll(map18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate9);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) defaultedMap12);
        java.util.Collection collection15 = defaultedMap12.values();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap21.clear();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b27 = defaultedMap25.equals((java.lang.Object) 0.0f);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) defaultedMap34);
        java.util.Collection collection37 = defaultedMap34.values();
        boolean b38 = defaultedMap25.containsKey((java.lang.Object) defaultedMap34);
        java.util.Set set39 = defaultedMap34.entrySet();
        java.lang.Object obj41 = defaultedMap21.put((java.lang.Object) set39, (java.lang.Object) '#');
        java.util.Set set42 = defaultedMap21.keySet();
        java.lang.Object obj43 = defaultedMap3.get((java.lang.Object) set42);
        boolean b44 = defaultedMap1.equals((java.lang.Object) set42);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1.0f + "'", obj43.equals(1.0f));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        filterIterator30.setIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 0.0f);
        boolean b45 = defaultedMap41.equals((java.lang.Object) 'a');
        int i46 = defaultedMap41.size();
        java.lang.Object obj48 = defaultedMap41.remove((java.lang.Object) 1);
        boolean b50 = defaultedMap41.equals((java.lang.Object) 0.0f);
        java.util.Set set51 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b55 = defaultedMap53.equals((java.lang.Object) 0.0f);
        boolean b57 = defaultedMap53.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.Predicate predicate61 = filterIterator58.getPredicate();
        java.util.Iterator iterator62 = filterIterator58.getIterator();
        boolean b63 = defaultedMap53.equals((java.lang.Object) filterIterator58);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = filterIterator64.getPredicate();
        boolean b68 = defaultedMap53.containsValue((java.lang.Object) filterIterator64);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        collections.Predicate predicate73 = filterIterator70.getPredicate();
        java.util.Iterator iterator74 = filterIterator70.getIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        filterIterator70.setPredicate(predicate76);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate76);
        filterIterator64.setIterator((java.util.Iterator) filterIterator69);
        java.util.Iterator iterator81 = filterIterator69.getIterator();
        java.lang.Object obj82 = defaultedMap39.put((java.lang.Object) set51, (java.lang.Object) iterator81);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) set51, obj83);
        boolean b85 = defaultedMap1.isEmpty();
        int i86 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        filterIterator89.setPredicate(predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89);
        boolean b93 = defaultedMap88.containsValue((java.lang.Object) filterIterator92);
        java.util.Set set94 = defaultedMap88.keySet();
        boolean b96 = defaultedMap88.containsKey((java.lang.Object) '#');
        java.lang.Object obj97 = defaultedMap1.remove((java.lang.Object) defaultedMap88);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 1);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = filterIterator38.getPredicate();
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate43 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator48);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate43, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate53);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b61 = defaultedMap59.equals((java.lang.Object) 0.0f);
        java.util.Set set62 = defaultedMap59.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b66 = defaultedMap64.equals((java.lang.Object) 0.0f);
        boolean b67 = defaultedMap59.containsKey((java.lang.Object) b66);
        boolean b68 = defaultedMap1.containsValue((java.lang.Object) b66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1.0f + "'", obj57.equals(1.0f));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b6 = defaultedMap4.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) filterIterator7);
        java.util.Iterator iterator12 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator7.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate19 = filterIterator7.getPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) filterIterator24);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate29);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) filterIterator7, (java.lang.Object) filterIterator24);
        int i32 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        boolean b18 = defaultedMap8.equals((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        boolean b23 = defaultedMap8.containsValue((java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap27.entrySet();
        boolean b31 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b42 = defaultedMap40.equals((java.lang.Object) 0.0f);
        boolean b44 = defaultedMap40.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator45.setPredicate(predicate46);
        collections.Predicate predicate48 = filterIterator45.getPredicate();
        java.util.Iterator iterator49 = filterIterator45.getIterator();
        boolean b50 = defaultedMap40.equals((java.lang.Object) filterIterator45);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        collections.Predicate predicate54 = filterIterator51.getPredicate();
        boolean b55 = defaultedMap40.containsValue((java.lang.Object) filterIterator51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b59 = defaultedMap57.equals((java.lang.Object) 0.0f);
        java.util.Set set60 = defaultedMap57.entrySet();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate62);
        collections.Predicate predicate64 = filterIterator61.getPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        filterIterator65.setPredicate(predicate66);
        collections.Predicate predicate68 = filterIterator65.getPredicate();
        filterIterator61.setIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate70 = filterIterator65.getPredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b74 = defaultedMap72.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        collections.Predicate predicate78 = filterIterator75.getPredicate();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) filterIterator75);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate70, predicate80);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate80);
        java.lang.Object obj84 = defaultedMap38.get((java.lang.Object) predicate80);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate80);
        filterIterator5.setPredicate(predicate80);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (-1.0f) + "'", obj84.equals((-1.0f)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        java.util.Collection collection18 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        int i28 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        boolean b18 = defaultedMap8.equals((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        boolean b23 = defaultedMap8.containsValue((java.lang.Object) filterIterator19);
        filterIterator6.setIterator((java.util.Iterator) filterIterator19);
        boolean b25 = defaultedMap1.equals((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.Predicate predicate30 = filterIterator27.getPredicate();
        java.util.Iterator iterator31 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator27.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        filterIterator41.setPredicate(predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate45);
        java.util.Set set48 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap10.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        java.util.Set set29 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b25 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator31);
        java.lang.Object obj34 = defaultedMap3.remove((java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 0.0f);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = filterIterator41.getPredicate();
        java.util.Iterator iterator45 = filterIterator41.getIterator();
        boolean b46 = defaultedMap36.equals((java.lang.Object) filterIterator41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.util.Iterator iterator57 = filterIterator53.getIterator();
        boolean b58 = defaultedMap48.equals((java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        boolean b63 = defaultedMap48.containsValue((java.lang.Object) filterIterator59);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        filterIterator65.setPredicate(predicate66);
        collections.Predicate predicate68 = filterIterator65.getPredicate();
        java.util.Iterator iterator69 = filterIterator65.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        filterIterator65.setPredicate(predicate71);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        filterIterator59.setIterator((java.util.Iterator) filterIterator64);
        boolean b76 = defaultedMap36.containsValue((java.lang.Object) filterIterator64);
        java.lang.Object obj78 = defaultedMap36.remove((java.lang.Object) 0);
        int i79 = defaultedMap36.size();
        boolean b80 = defaultedMap3.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap16.clear();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) defaultedMap16);
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        boolean b27 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        boolean b34 = defaultedMap29.containsValue((java.lang.Object) filterIterator33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) filterIterator33);
        java.lang.Object obj36 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap54.clear();
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) defaultedMap54);
        java.util.Collection collection57 = defaultedMap54.values();
        boolean b58 = defaultedMap45.containsKey((java.lang.Object) defaultedMap54);
        java.util.Set set59 = defaultedMap54.entrySet();
        java.lang.Object obj61 = defaultedMap41.put((java.lang.Object) set59, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        boolean b68 = defaultedMap63.containsValue((java.lang.Object) filterIterator67);
        java.util.Set set69 = defaultedMap63.entrySet();
        java.lang.Object obj70 = defaultedMap21.put(obj61, (java.lang.Object) defaultedMap63);
        boolean b71 = defaultedMap1.equals((java.lang.Object) defaultedMap21);
        java.util.Set set72 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1.0f + "'", obj43.equals(1.0f));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Map map9 = null;
        try {
            defaultedMap1.putAll(map9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = filterIterator4.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap10.equals(obj11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator13.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        filterIterator13.setIterator((java.util.Iterator) filterIterator25);
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) filterIterator13);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        int i44 = defaultedMap1.size();
        boolean b45 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b19 = defaultedMap17.equals((java.lang.Object) 0.0f);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 'a');
        int i22 = defaultedMap17.size();
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 1);
        boolean b26 = defaultedMap17.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 0.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap28, (java.lang.Object) set35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj41 = defaultedMap28.get((java.lang.Object) filterIterator40);
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) filterIterator40);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        int i13 = defaultedMap8.size();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 1);
        boolean b17 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.util.Collection collection18 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b22 = defaultedMap20.equals((java.lang.Object) 0.0f);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        java.util.Iterator iterator29 = filterIterator25.getIterator();
        boolean b30 = defaultedMap20.equals((java.lang.Object) filterIterator25);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = filterIterator31.getPredicate();
        boolean b35 = defaultedMap20.containsValue((java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b39 = defaultedMap37.equals((java.lang.Object) 0.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator45.setPredicate(predicate46);
        collections.Predicate predicate48 = filterIterator45.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate50 = filterIterator45.getPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b54 = defaultedMap52.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        collections.Predicate predicate58 = filterIterator55.getPredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) filterIterator55);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate50, predicate60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate60);
        java.lang.Object obj64 = defaultedMap8.get((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b68 = defaultedMap66.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        filterIterator69.setPredicate(predicate70);
        collections.Predicate predicate72 = filterIterator69.getPredicate();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) filterIterator69);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        collections.Predicate predicate78 = filterIterator75.getPredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        filterIterator79.setPredicate(predicate80);
        collections.Predicate predicate82 = filterIterator79.getPredicate();
        filterIterator75.setIterator((java.util.Iterator) filterIterator79);
        collections.Predicate predicate84 = filterIterator79.getPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate60, predicate84);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1.0f + "'", obj64.equals(1.0f));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 'a');
        int i27 = defaultedMap22.size();
        java.lang.Object obj29 = defaultedMap22.remove((java.lang.Object) 1);
        boolean b31 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap22.values();
        boolean b34 = defaultedMap22.containsKey((java.lang.Object) 10L);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap19.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap25.clear();
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) defaultedMap25);
        java.util.Collection collection28 = defaultedMap25.values();
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set30 = defaultedMap25.entrySet();
        java.lang.Object obj32 = defaultedMap12.put((java.lang.Object) set30, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b36 = defaultedMap34.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = filterIterator37.getPredicate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) filterIterator37);
        java.util.Set set42 = defaultedMap34.keySet();
        boolean b43 = defaultedMap12.equals((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b49 = defaultedMap47.equals((java.lang.Object) 0.0f);
        java.util.Set set50 = defaultedMap47.entrySet();
        boolean b51 = defaultedMap45.equals((java.lang.Object) defaultedMap47);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        boolean b55 = defaultedMap47.containsValue((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b59 = defaultedMap57.equals((java.lang.Object) 0.0f);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 'a');
        boolean b62 = defaultedMap47.containsValue((java.lang.Object) defaultedMap57);
        boolean b63 = defaultedMap12.containsKey((java.lang.Object) defaultedMap47);
        java.lang.Object obj64 = defaultedMap1.put((java.lang.Object) filterIterator3, (java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsValue(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap33.clear();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection36 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b42 = defaultedMap40.equals((java.lang.Object) 0.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        boolean b44 = defaultedMap38.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        boolean b51 = defaultedMap46.containsValue((java.lang.Object) filterIterator50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator50);
        java.lang.Object obj53 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        java.util.Set set54 = defaultedMap33.entrySet();
        boolean b55 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1.0f + "'", obj53.equals(1.0f));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator10);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator20.setPredicate(predicate21);
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        filterIterator16.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate25 = filterIterator20.getPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        filterIterator5.setIterator((java.util.Iterator) filterIterator15);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b45 = defaultedMap43.equals((java.lang.Object) 0.0f);
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) 100.0d);
        java.util.Set set48 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b52 = defaultedMap50.equals((java.lang.Object) 0.0f);
        boolean b54 = defaultedMap50.equals((java.lang.Object) 'a');
        int i55 = defaultedMap50.size();
        java.lang.Object obj57 = defaultedMap50.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        java.lang.Object obj69 = defaultedMap50.put((java.lang.Object) 100, (java.lang.Object) defaultedMap68);
        boolean b70 = defaultedMap50.isEmpty();
        java.lang.Object obj71 = defaultedMap43.get((java.lang.Object) b70);
        boolean b72 = defaultedMap1.equals(obj71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1.0f + "'", obj71.equals(1.0f));
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator0.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator0.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = filterIterator22.getPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate31 = filterIterator26.getPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate31);
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator7, (java.lang.Object) filterIterator32);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.equals((java.lang.Object) 0.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 'a');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) b11);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator9);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        boolean b20 = defaultedMap16.equals((java.lang.Object) 'a');
        int i21 = defaultedMap16.size();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap16.containsKey(obj22);
        java.util.Set set24 = defaultedMap16.keySet();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate29 = filterIterator25.getPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap33.equals((java.lang.Object) 0.0f);
        java.util.Set set36 = defaultedMap33.entrySet();
        boolean b37 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        boolean b41 = defaultedMap33.containsValue((java.lang.Object) predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate29, predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate39);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        int i44 = defaultedMap1.size();
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        boolean b16 = defaultedMap12.equals((java.lang.Object) 'a');
        int i17 = defaultedMap12.size();
        java.lang.Object obj19 = defaultedMap12.remove((java.lang.Object) 1);
        boolean b21 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.Object obj31 = defaultedMap12.put((java.lang.Object) defaultedMap23, (java.lang.Object) set30);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) false);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        java.util.Iterator iterator39 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        filterIterator35.setPredicate(predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap48.clear();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b54 = defaultedMap52.equals((java.lang.Object) 0.0f);
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap58.clear();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap61.clear();
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) defaultedMap61);
        java.util.Collection collection64 = defaultedMap61.values();
        boolean b65 = defaultedMap52.containsKey((java.lang.Object) defaultedMap61);
        java.util.Set set66 = defaultedMap61.entrySet();
        java.lang.Object obj68 = defaultedMap48.put((java.lang.Object) set66, (java.lang.Object) '#');
        java.util.Set set69 = defaultedMap48.keySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b73 = defaultedMap71.equals((java.lang.Object) 0.0f);
        boolean b75 = defaultedMap71.equals((java.lang.Object) 'a');
        defaultedMap71.clear();
        boolean b77 = defaultedMap48.containsValue((java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b81 = defaultedMap79.equals((java.lang.Object) 0.0f);
        java.util.Set set82 = defaultedMap79.entrySet();
        java.util.Set set83 = defaultedMap79.entrySet();
        java.lang.Object obj84 = defaultedMap71.get((java.lang.Object) set83);
        java.util.Collection collection85 = defaultedMap71.values();
        java.lang.Object obj86 = defaultedMap1.put((java.lang.Object) predicate41, (java.lang.Object) defaultedMap71);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1.0f + "'", obj63.equals(1.0f));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 1.0f + "'", obj84.equals(1.0f));
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.entrySet();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.util.Set set27 = defaultedMap1.entrySet();
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap44.clear();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        boolean b59 = defaultedMap55.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = filterIterator60.getPredicate();
        java.util.Iterator iterator64 = filterIterator60.getIterator();
        boolean b65 = defaultedMap55.equals((java.lang.Object) filterIterator60);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        boolean b70 = defaultedMap55.containsValue((java.lang.Object) filterIterator66);
        filterIterator53.setIterator((java.util.Iterator) filterIterator66);
        boolean b72 = defaultedMap48.equals((java.lang.Object) filterIterator66);
        java.lang.Object obj73 = defaultedMap44.put(obj46, (java.lang.Object) filterIterator66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = filterIterator38.getPredicate();
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate43 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator48);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate43, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate53);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) predicate53);
        boolean b58 = defaultedMap1.isEmpty();
        collections.Factory factory59 = null;
        try {
            java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1.0f + "'", obj57.equals(1.0f));
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate6);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = filterIterator17.getPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate22);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        java.util.Set set18 = defaultedMap3.keySet();
        java.lang.String str19 = defaultedMap3.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.isEmpty();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap44.clear();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 0.0f);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.util.Iterator iterator57 = filterIterator53.getIterator();
        boolean b58 = defaultedMap48.equals((java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        boolean b63 = defaultedMap48.containsValue((java.lang.Object) filterIterator59);
        filterIterator46.setIterator((java.util.Iterator) filterIterator59);
        boolean b65 = defaultedMap44.containsValue((java.lang.Object) filterIterator46);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate19 = filterIterator14.getPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        boolean b12 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap26.clear();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) defaultedMap26);
        java.util.Collection collection29 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap33.equals((java.lang.Object) 0.0f);
        java.util.Set set36 = defaultedMap33.entrySet();
        boolean b37 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        boolean b44 = defaultedMap39.containsValue((java.lang.Object) filterIterator43);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) filterIterator43);
        java.lang.Object obj46 = defaultedMap26.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap51.clear();
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap61.clear();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap64.clear();
        java.lang.Object obj66 = defaultedMap61.get((java.lang.Object) defaultedMap64);
        java.util.Collection collection67 = defaultedMap64.values();
        boolean b68 = defaultedMap55.containsKey((java.lang.Object) defaultedMap64);
        java.util.Set set69 = defaultedMap64.entrySet();
        java.lang.Object obj71 = defaultedMap51.put((java.lang.Object) set69, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        boolean b78 = defaultedMap73.containsValue((java.lang.Object) filterIterator77);
        java.util.Set set79 = defaultedMap73.entrySet();
        java.lang.Object obj80 = defaultedMap31.put(obj71, (java.lang.Object) defaultedMap73);
        java.util.Map map81 = collections.map.DefaultedMap.decorate(map21, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1.0f + "'", obj46.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1.0f + "'", obj53.equals(1.0f));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 1.0f + "'", obj66.equals(1.0f));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b11 = defaultedMap9.equals((java.lang.Object) 0.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap18.clear();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) defaultedMap18);
        java.util.Collection collection21 = defaultedMap18.values();
        boolean b22 = defaultedMap9.containsKey((java.lang.Object) defaultedMap18);
        java.util.Set set23 = defaultedMap18.entrySet();
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b25 = defaultedMap18.isEmpty();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) filterIterator34);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b45 = defaultedMap43.equals((java.lang.Object) 0.0f);
        boolean b47 = defaultedMap43.equals((java.lang.Object) 'a');
        int i48 = defaultedMap43.size();
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap43.containsKey(obj49);
        java.util.Set set51 = defaultedMap43.keySet();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate56 = filterIterator52.getPredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b62 = defaultedMap60.equals((java.lang.Object) 0.0f);
        java.util.Set set63 = defaultedMap60.entrySet();
        boolean b64 = defaultedMap58.equals((java.lang.Object) defaultedMap60);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        filterIterator65.setPredicate(predicate66);
        boolean b68 = defaultedMap60.containsValue((java.lang.Object) predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate56, predicate66);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate39, predicate66);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 'a');
        int i13 = defaultedMap8.size();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        java.lang.Object obj27 = defaultedMap8.put((java.lang.Object) 100, (java.lang.Object) defaultedMap26);
        boolean b28 = defaultedMap8.isEmpty();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) b28);
        int i30 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = filterIterator4.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b27 = defaultedMap25.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) filterIterator28);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate33);
        filterIterator22.setIterator((java.util.Iterator) filterIterator28);
        boolean b36 = defaultedMap10.equals((java.lang.Object) filterIterator28);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        filterIterator7.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) filterIterator16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate10);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap21.clear();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) defaultedMap21);
        java.util.Collection collection24 = defaultedMap21.values();
        boolean b25 = defaultedMap12.containsKey((java.lang.Object) defaultedMap21);
        java.util.Set set26 = defaultedMap21.entrySet();
        java.lang.Object obj28 = defaultedMap8.put((java.lang.Object) set26, (java.lang.Object) '#');
        java.util.Set set29 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) defaultedMap34);
        java.util.Collection collection37 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 0.0f);
        java.util.Set set44 = defaultedMap41.entrySet();
        boolean b45 = defaultedMap39.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48);
        boolean b52 = defaultedMap47.containsValue((java.lang.Object) filterIterator51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) filterIterator51);
        java.lang.Object obj54 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj55 = defaultedMap8.get(obj54);
        java.lang.Object obj56 = defaultedMap1.get(obj55);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1.0f + "'", obj54.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1.0f + "'", obj55.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b13 = defaultedMap11.equals((java.lang.Object) 0.0f);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 'a');
        int i16 = defaultedMap11.size();
        java.lang.Object obj18 = defaultedMap11.remove((java.lang.Object) 1);
        boolean b20 = defaultedMap11.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        boolean b27 = defaultedMap23.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.util.Iterator iterator32 = filterIterator28.getIterator();
        boolean b33 = defaultedMap23.equals((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        boolean b38 = defaultedMap23.containsValue((java.lang.Object) filterIterator34);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = filterIterator40.getPredicate();
        java.util.Iterator iterator44 = filterIterator40.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator45.setPredicate(predicate46);
        filterIterator40.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate46);
        filterIterator34.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator51 = filterIterator39.getIterator();
        java.lang.Object obj52 = defaultedMap9.put((java.lang.Object) set21, (java.lang.Object) iterator51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap57.clear();
        java.lang.Object obj59 = defaultedMap54.get((java.lang.Object) defaultedMap57);
        java.util.Collection collection60 = defaultedMap57.values();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) collection60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = filterIterator62.getPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        filterIterator62.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate71 = filterIterator66.getPredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b76 = defaultedMap74.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) filterIterator77);
        java.util.Iterator iterator82 = filterIterator77.getIterator();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        collections.Predicate predicate87 = filterIterator83.getPredicate();
        filterIterator77.setIterator((java.util.Iterator) filterIterator83);
        collections.Predicate predicate89 = filterIterator77.getPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map61, predicate71, predicate89);
        collections.Transformer transformer91 = null;
        try {
            java.util.Map map92 = collections.map.DefaultedMap.decorate(map90, transformer91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0f + "'", obj59.equals(1.0f));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.String str17 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate34 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = filterIterator39.getPredicate();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) filterIterator39);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate34, predicate44);
        java.util.Set set47 = defaultedMap21.entrySet();
        boolean b48 = defaultedMap19.containsKey((java.lang.Object) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 'a');
        int i27 = defaultedMap22.size();
        java.lang.Object obj29 = defaultedMap22.remove((java.lang.Object) 1);
        boolean b31 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap22.values();
        boolean b34 = defaultedMap22.containsKey((java.lang.Object) 10L);
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj37 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.util.Set set38 = defaultedMap19.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        boolean b16 = defaultedMap12.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.util.Iterator iterator21 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator17.setPredicate(predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap12.put((java.lang.Object) filterIterator17, (java.lang.Object) b29);
        boolean b31 = defaultedMap10.containsValue((java.lang.Object) b29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b36 = defaultedMap34.equals((java.lang.Object) 0.0f);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 0.0f);
        boolean b45 = defaultedMap41.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = filterIterator46.getPredicate();
        java.util.Iterator iterator50 = filterIterator46.getIterator();
        boolean b51 = defaultedMap41.equals((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.Predicate predicate55 = filterIterator52.getPredicate();
        boolean b56 = defaultedMap41.containsValue((java.lang.Object) filterIterator52);
        filterIterator39.setIterator((java.util.Iterator) filterIterator52);
        boolean b58 = defaultedMap34.equals((java.lang.Object) filterIterator52);
        boolean b59 = defaultedMap1.containsValue((java.lang.Object) defaultedMap34);
        java.util.Collection collection60 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.entrySet();
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 'a');
        int i23 = defaultedMap18.size();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) 1);
        boolean b27 = defaultedMap18.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b31 = defaultedMap29.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap33.equals((java.lang.Object) 0.0f);
        java.util.Set set36 = defaultedMap33.entrySet();
        java.lang.Object obj37 = defaultedMap18.put((java.lang.Object) defaultedMap29, (java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set40 = defaultedMap39.entrySet();
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) set40);
        java.lang.Object obj42 = defaultedMap10.remove(obj41);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) defaultedMap15);
        java.util.Collection collection18 = defaultedMap15.values();
        boolean b19 = defaultedMap6.containsKey((java.lang.Object) defaultedMap15);
        java.util.Set set20 = defaultedMap15.keySet();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate24);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        filterIterator26.setPredicate(predicate27);
        java.lang.Object obj29 = defaultedMap12.remove((java.lang.Object) filterIterator26);
        boolean b30 = defaultedMap12.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) filterIterator22);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) i24);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        boolean b34 = defaultedMap28.equals((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) filterIterator40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) filterIterator40);
        java.lang.Object obj43 = defaultedMap12.remove((java.lang.Object) filterIterator40);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) filterIterator40);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.util.Iterator iterator21 = filterIterator17.getIterator();
        java.lang.Object obj22 = defaultedMap3.remove((java.lang.Object) iterator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap24.equals((java.lang.Object) 0.0f);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 'a');
        int i29 = defaultedMap24.size();
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 1);
        boolean b33 = defaultedMap24.equals((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 0.0f);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 'a');
        int i41 = defaultedMap36.size();
        java.lang.Object obj43 = defaultedMap36.remove((java.lang.Object) 1);
        boolean b45 = defaultedMap36.equals((java.lang.Object) 0.0f);
        java.util.Collection collection46 = defaultedMap36.values();
        boolean b47 = defaultedMap24.containsKey((java.lang.Object) defaultedMap36);
        java.lang.String str48 = defaultedMap24.toString();
        boolean b49 = defaultedMap3.containsValue((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) i15);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        boolean b25 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator31);
        java.lang.Object obj34 = defaultedMap3.remove((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        filterIterator31.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        filterIterator35.setIterator((java.util.Iterator) filterIterator43);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        int i6 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b48 = defaultedMap46.equals((java.lang.Object) 0.0f);
        boolean b50 = defaultedMap46.equals((java.lang.Object) 'a');
        int i51 = defaultedMap46.size();
        java.lang.Object obj53 = defaultedMap46.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        boolean b57 = defaultedMap44.equals((java.lang.Object) defaultedMap55);
        java.util.Collection collection58 = defaultedMap55.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(collection58);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        java.util.Set set9 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = filterIterator38.getPredicate();
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate43 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator48);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate43, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate53);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) predicate53);
        boolean b58 = defaultedMap1.isEmpty();
        java.util.Collection collection59 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1.0f + "'", obj57.equals(1.0f));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        filterIterator18.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate24);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0.0f);
        boolean b35 = defaultedMap31.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.util.Iterator iterator40 = filterIterator36.getIterator();
        boolean b41 = defaultedMap31.equals((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        boolean b46 = defaultedMap31.containsValue((java.lang.Object) filterIterator42);
        filterIterator29.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate48 = filterIterator42.getPredicate();
        filterIterator12.setPredicate(predicate48);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.entrySet();
        int i16 = defaultedMap10.size();
        java.util.Collection collection17 = defaultedMap10.values();
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = filterIterator4.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj12);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.util.Set set27 = defaultedMap1.entrySet();
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) filterIterator22);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) i24);
        defaultedMap12.clear();
        java.util.Set set27 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        boolean b34 = defaultedMap29.containsValue((java.lang.Object) filterIterator33);
        java.util.Set set35 = defaultedMap29.entrySet();
        boolean b36 = defaultedMap12.containsKey((java.lang.Object) defaultedMap29);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) filterIterator37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b45 = defaultedMap43.equals((java.lang.Object) 0.0f);
        boolean b47 = defaultedMap43.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.util.Iterator iterator52 = filterIterator48.getIterator();
        boolean b53 = defaultedMap43.equals((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = filterIterator54.getPredicate();
        boolean b58 = defaultedMap43.containsValue((java.lang.Object) filterIterator54);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b62 = defaultedMap60.equals((java.lang.Object) 0.0f);
        java.util.Set set63 = defaultedMap60.entrySet();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = filterIterator64.getPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = filterIterator68.getPredicate();
        filterIterator64.setIterator((java.util.Iterator) filterIterator68);
        collections.Predicate predicate73 = filterIterator68.getPredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b77 = defaultedMap75.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) filterIterator78);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate73, predicate83);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate83);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate83);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate83);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator88, predicate89);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate89);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.util.Iterator iterator22 = filterIterator18.getIterator();
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Iterator iterator34 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator30.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        boolean b41 = defaultedMap1.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        boolean b51 = defaultedMap46.containsValue((java.lang.Object) filterIterator50);
        int i52 = defaultedMap46.size();
        java.util.Set set53 = defaultedMap46.keySet();
        java.lang.Object obj55 = defaultedMap46.remove((java.lang.Object) "hi!");
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b62 = defaultedMap60.equals((java.lang.Object) 0.0f);
        boolean b64 = defaultedMap60.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        filterIterator65.setPredicate(predicate66);
        collections.Predicate predicate68 = filterIterator65.getPredicate();
        java.util.Iterator iterator69 = filterIterator65.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        filterIterator65.setPredicate(predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b77 = defaultedMap75.equals((java.lang.Object) 0.0f);
        java.lang.Object obj78 = defaultedMap60.put((java.lang.Object) filterIterator65, (java.lang.Object) b77);
        boolean b79 = defaultedMap58.containsValue((java.lang.Object) b77);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) b77);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        int i18 = defaultedMap13.size();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 1);
        boolean b22 = defaultedMap13.equals((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap13.values();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 0.0f);
        java.util.Set set31 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        boolean b48 = defaultedMap38.equals((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = filterIterator49.getPredicate();
        boolean b53 = defaultedMap38.containsValue((java.lang.Object) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.equals((java.lang.Object) 0.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate68 = filterIterator63.getPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b72 = defaultedMap70.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) filterIterator73);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate34, predicate78);
        java.lang.Object obj83 = null;
        boolean b84 = defaultedMap13.equals(obj83);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 0.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate34 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = filterIterator39.getPredicate();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) filterIterator39);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate34, predicate44);
        java.util.Set set47 = defaultedMap21.entrySet();
        boolean b48 = defaultedMap19.containsKey((java.lang.Object) defaultedMap21);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate9);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator16);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        filterIterator10.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b27 = defaultedMap25.equals((java.lang.Object) 0.0f);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 0.0f);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = filterIterator37.getPredicate();
        java.util.Iterator iterator41 = filterIterator37.getIterator();
        boolean b42 = defaultedMap32.equals((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        boolean b47 = defaultedMap32.containsValue((java.lang.Object) filterIterator43);
        filterIterator30.setIterator((java.util.Iterator) filterIterator43);
        boolean b49 = defaultedMap25.equals((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        collections.Predicate predicate54 = filterIterator51.getPredicate();
        java.util.Iterator iterator55 = filterIterator51.getIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        filterIterator51.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate57);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        filterIterator65.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate57, predicate69);
        filterIterator10.setPredicate(predicate69);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1.0f) + "'", obj3.equals((-1.0f)));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.equals((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 'a');
        boolean b18 = defaultedMap3.containsValue((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator6.getPredicate();
        java.util.Iterator iterator10 = filterIterator6.getIterator();
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 0.0f);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.Predicate predicate26 = filterIterator23.getPredicate();
        java.util.Iterator iterator27 = filterIterator23.getIterator();
        boolean b28 = defaultedMap18.equals((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        boolean b33 = defaultedMap18.containsValue((java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b37 = defaultedMap35.equals((java.lang.Object) 0.0f);
        java.util.Set set38 = defaultedMap35.entrySet();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = filterIterator43.getPredicate();
        filterIterator39.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate48 = filterIterator43.getPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b52 = defaultedMap50.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) filterIterator53);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate58);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b66 = defaultedMap64.equals((java.lang.Object) 0.0f);
        boolean b68 = defaultedMap64.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        filterIterator69.setPredicate(predicate70);
        collections.Predicate predicate72 = filterIterator69.getPredicate();
        java.util.Iterator iterator73 = filterIterator69.getIterator();
        boolean b74 = defaultedMap64.equals((java.lang.Object) filterIterator69);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        collections.Predicate predicate78 = filterIterator75.getPredicate();
        boolean b79 = defaultedMap64.containsValue((java.lang.Object) filterIterator75);
        filterIterator62.setIterator((java.util.Iterator) filterIterator75);
        filterIterator29.setIterator((java.util.Iterator) filterIterator62);
        filterIterator12.setIterator((java.util.Iterator) filterIterator29);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap1.containsKey(obj9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) predicate16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate14 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator19);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        java.util.Set set27 = defaultedMap1.entrySet();
        java.lang.String str28 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b32 = defaultedMap30.equals((java.lang.Object) 0.0f);
        boolean b34 = defaultedMap30.equals((java.lang.Object) 'a');
        int i35 = defaultedMap30.size();
        java.lang.Object obj37 = defaultedMap30.remove((java.lang.Object) 1);
        boolean b39 = defaultedMap30.equals((java.lang.Object) 0.0f);
        java.util.Collection collection40 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b44 = defaultedMap42.equals((java.lang.Object) 0.0f);
        boolean b46 = defaultedMap42.equals((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = filterIterator47.getPredicate();
        java.util.Iterator iterator51 = filterIterator47.getIterator();
        boolean b52 = defaultedMap42.equals((java.lang.Object) filterIterator47);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        boolean b57 = defaultedMap42.containsValue((java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b61 = defaultedMap59.equals((java.lang.Object) 0.0f);
        java.util.Set set62 = defaultedMap59.entrySet();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        collections.Predicate predicate70 = filterIterator67.getPredicate();
        filterIterator63.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate72 = filterIterator67.getPredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b76 = defaultedMap74.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) filterIterator77);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate72, predicate82);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate82);
        java.lang.Object obj86 = defaultedMap30.get((java.lang.Object) predicate82);
        boolean b87 = defaultedMap30.isEmpty();
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) b87);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 1.0f + "'", obj86.equals(1.0f));
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 1.0f + "'", obj88.equals(1.0f));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) filterIterator30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator30);
        boolean b36 = defaultedMap10.containsValue((java.lang.Object) filterIterator30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 'a');
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set19);
        boolean b21 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) filterIterator26);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.Predicate predicate36 = filterIterator33.getPredicate();
        java.util.Iterator iterator37 = filterIterator33.getIterator();
        collections.Predicate predicate38 = filterIterator33.getPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate31, predicate38);
        java.util.Collection collection40 = defaultedMap12.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
    }
}

