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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map2 = null;
        try {
            defaultedMap1.putAll(map2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            boolean b3 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + ' ' + "'", obj3.equals(' '));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        try {
            boolean b11 = filterIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        try {
            boolean b7 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        try {
            java.lang.Object obj12 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 0L);
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 100);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        filterIterator27.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate33);
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) filterIterator27);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 1 + "'", obj36.equals((short) 1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.get(obj14);
        int i16 = defaultedMap5.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) (short) 1);
        int i21 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        try {
            java.lang.Object obj23 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        java.lang.String str15 = defaultedMap10.toString();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        filterIterator19.setPredicate(predicate21);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap34.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        int i39 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.entrySet();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b48 = defaultedMap43.equals((java.lang.Object) 10);
        int i49 = defaultedMap43.size();
        java.util.Set set50 = defaultedMap43.keySet();
        java.lang.Object obj51 = defaultedMap10.put((java.lang.Object) i39, (java.lang.Object) set50);
        java.lang.Object obj52 = defaultedMap3.get((java.lang.Object) set50);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        collections.Predicate predicate15 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap4.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) set5);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        try {
            java.lang.Object obj16 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        java.util.Collection collection9 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap28.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj33 = defaultedMap22.put((java.lang.Object) defaultedMap26, (java.lang.Object) 10);
        java.util.Set set34 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap26.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj46 = defaultedMap11.remove((java.lang.Object) b45);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator25.setPredicate(predicate27);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        filterIterator32.setPredicate(predicate34);
        filterIterator25.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap42.clear();
        java.lang.String str47 = defaultedMap42.toString();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        filterIterator51.setPredicate(predicate53);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate57);
        filterIterator38.setPredicate(predicate57);
        try {
            filterIterator38.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 100);
        java.lang.String str34 = defaultedMap30.toString();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        filterIterator37.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate43);
        java.lang.Object obj46 = defaultedMap30.get((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate53);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        defaultedMap8.putAll((java.util.Map) defaultedMap20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        try {
            boolean b15 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 100);
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setPredicate(predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator31.setPredicate(predicate33);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        filterIterator38.setPredicate(predicate40);
        filterIterator31.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate40);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) filterIterator44);
        try {
            filterIterator44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 1 + "'", obj27.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        int i9 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 100);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        filterIterator27.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate33);
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        filterIterator40.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        filterIterator47.setPredicate(predicate49);
        filterIterator40.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) 100);
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        filterIterator62.setPredicate(predicate64);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate68);
        java.lang.Object obj71 = defaultedMap55.get((java.lang.Object) filterIterator62);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        filterIterator75.setPredicate(predicate77);
        java.util.Iterator iterator80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator80, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        filterIterator75.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate84);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate84);
        defaultedMap1.clear();
        java.lang.Object obj92 = defaultedMap1.get((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 1 + "'", obj36.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 1 + "'", obj71.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) 1 + "'", obj92.equals((short) 1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap5.clear();
        java.lang.String str10 = defaultedMap5.toString();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        filterIterator14.setPredicate(predicate16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate20);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate20);
        defaultedMap1.putAll(map23);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        boolean b2 = defaultedMap1.isEmpty();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b17 = defaultedMap12.equals((java.lang.Object) 10);
        int i18 = defaultedMap12.size();
        java.util.Set set19 = defaultedMap12.keySet();
        boolean b20 = defaultedMap3.containsValue((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 100);
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setPredicate(predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator31.setPredicate(predicate33);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        filterIterator38.setPredicate(predicate40);
        filterIterator31.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate40);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) filterIterator44);
        try {
            java.lang.Object obj47 = filterIterator44.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 1 + "'", obj27.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 100);
        java.lang.String str34 = defaultedMap30.toString();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        filterIterator37.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate43);
        java.lang.Object obj46 = defaultedMap30.get((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) filterIterator51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b32 = defaultedMap3.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set37 = defaultedMap36.entrySet();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap36.clear();
        java.lang.String str41 = defaultedMap36.toString();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        filterIterator45.setPredicate(predicate47);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        boolean b56 = defaultedMap3.equals((java.lang.Object) defaultedMap36);
        collections.Transformer transformer57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap22.entrySet();
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap3.equals((java.lang.Object) defaultedMap22);
        int i26 = defaultedMap22.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 100);
        java.lang.String str23 = defaultedMap19.toString();
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        filterIterator26.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) filterIterator26);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate37 = filterIterator26.getPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set40 = defaultedMap39.entrySet();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap15.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap39);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) defaultedMap39);
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap19.containsValue((java.lang.Object) 0L);
        boolean b24 = defaultedMap19.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = defaultedMap12.remove((java.lang.Object) b24);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b32 = defaultedMap3.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap34.put((java.lang.Object) defaultedMap38, (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set53 = defaultedMap52.entrySet();
        boolean b54 = defaultedMap52.isEmpty();
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set60 = defaultedMap59.entrySet();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) 100);
        java.lang.String str63 = defaultedMap59.toString();
        java.lang.Object obj64 = defaultedMap38.remove((java.lang.Object) defaultedMap59);
        defaultedMap31.putAll((java.util.Map) defaultedMap38);
        java.util.Set set66 = defaultedMap38.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        filterIterator13.setPredicate(predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        java.lang.Object obj23 = defaultedMap3.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = filterIterator2.getIterator();
        java.util.Iterator iterator12 = filterIterator2.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj37 = defaultedMap26.put((java.lang.Object) defaultedMap30, (java.lang.Object) 10);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) collection43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) collection43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set50 = defaultedMap49.entrySet();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.util.Set set53 = defaultedMap47.entrySet();
        java.util.Set set54 = defaultedMap47.keySet();
        java.lang.Object obj55 = defaultedMap15.get((java.lang.Object) defaultedMap47);
        collections.Transformer transformer56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + ' ' + "'", obj55.equals(' '));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap3.size();
        int i11 = defaultedMap3.size();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        filterIterator14.setPredicate(predicate16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 100);
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator31.setPredicate(predicate33);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate37);
        java.lang.Object obj40 = defaultedMap24.get((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        filterIterator51.setPredicate(predicate53);
        filterIterator44.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate53);
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate20, predicate58);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate17);
        collections.Predicate predicate20 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator2.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.String str11 = defaultedMap7.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        int i25 = defaultedMap1.size();
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        try {
            java.lang.Object obj16 = filterIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        java.lang.String str9 = defaultedMap3.toString();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = filterIterator2.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setPredicate(predicate22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate26);
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate32);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        filterIterator37.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setPredicate(predicate46);
        filterIterator37.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate46);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        filterIterator2.setIterator((java.util.Iterator) filterIterator50);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 1 + "'", obj29.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str8 = defaultedMap3.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate22, predicate23);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        try {
            filterIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj37 = defaultedMap26.put((java.lang.Object) defaultedMap30, (java.lang.Object) 10);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) collection43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) collection43);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        boolean b13 = defaultedMap11.isEmpty();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10);
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b28 = defaultedMap9.equals((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set37 = defaultedMap36.entrySet();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) defaultedMap34, (java.lang.Object) 10);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set46 = defaultedMap45.entrySet();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap34.get((java.lang.Object) collection47);
        boolean b49 = defaultedMap19.containsKey((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set58 = defaultedMap57.entrySet();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj62 = defaultedMap51.put((java.lang.Object) defaultedMap55, (java.lang.Object) 10);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 10.0f);
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) defaultedMap19, (java.lang.Object) 10.0f);
        boolean b66 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + ' ' + "'", obj48.equals(' '));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate24);
        filterIterator2.setIterator((java.util.Iterator) filterIterator22);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        filterIterator28.setPredicate(predicate30);
        filterIterator21.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate30);
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set38 = defaultedMap37.entrySet();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 100);
        java.lang.String str41 = defaultedMap37.toString();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate50);
        java.lang.Object obj53 = defaultedMap37.get((java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        filterIterator57.setPredicate(predicate59);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        filterIterator64.setPredicate(predicate66);
        filterIterator57.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate66);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate66);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 1 + "'", obj53.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate66);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        try {
            filterIterator10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Collection collection13 = defaultedMap5.values();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.remove(obj14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        filterIterator13.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate15);
        try {
            filterIterator18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        java.util.Collection collection21 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) 100);
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        filterIterator30.setPredicate(predicate32);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate36);
        java.lang.Object obj39 = defaultedMap23.get((java.lang.Object) filterIterator30);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        filterIterator47.setPredicate(predicate49);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        filterIterator54.setPredicate(predicate56);
        filterIterator47.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate56);
        boolean b61 = defaultedMap16.containsValue((java.lang.Object) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        filterIterator12.setIterator((java.util.Iterator) filterIterator60);
        try {
            boolean b64 = filterIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 1 + "'", obj39.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        java.util.Set set29 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap19.put((java.lang.Object) defaultedMap23, (java.lang.Object) 10);
        java.util.Collection collection31 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        defaultedMap35.clear();
        java.util.Collection collection40 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set45 = defaultedMap44.entrySet();
        boolean b46 = defaultedMap44.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        defaultedMap44.clear();
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj50 = defaultedMap23.get((java.lang.Object) defaultedMap35);
        defaultedMap12.putAll((java.util.Map) defaultedMap35);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + ' ' + "'", obj50.equals(' '));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap18.entrySet();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) 10);
        java.util.Set set24 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap16.equals((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.entrySet();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj48 = defaultedMap37.put((java.lang.Object) defaultedMap41, (java.lang.Object) 10);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set53 = defaultedMap52.entrySet();
        java.util.Collection collection54 = defaultedMap52.values();
        java.lang.Object obj55 = defaultedMap41.get((java.lang.Object) collection54);
        boolean b56 = defaultedMap26.containsKey((java.lang.Object) collection54);
        java.lang.Object obj57 = defaultedMap3.remove((java.lang.Object) b56);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + ' ' + "'", obj55.equals(' '));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str8 = defaultedMap3.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i32 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set37 = defaultedMap36.entrySet();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b41 = defaultedMap36.equals((java.lang.Object) 10);
        int i42 = defaultedMap36.size();
        java.util.Set set43 = defaultedMap36.keySet();
        java.lang.Object obj44 = defaultedMap3.put((java.lang.Object) i32, (java.lang.Object) set43);
        int i45 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 100);
        java.lang.String str29 = defaultedMap25.toString();
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        filterIterator32.setPredicate(predicate34);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate38);
        java.lang.Object obj41 = defaultedMap25.get((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate44);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        filterIterator49.setPredicate(predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        filterIterator56.setPredicate(predicate58);
        filterIterator49.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate58);
        filterIterator23.setIterator((java.util.Iterator) filterIterator62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 1 + "'", obj41.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        filterIterator28.setPredicate(predicate30);
        filterIterator21.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        filterIterator38.setPredicate(predicate40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap51.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        defaultedMap51.clear();
        java.util.Collection collection56 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set59 = defaultedMap58.entrySet();
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) 100);
        java.lang.String str62 = defaultedMap58.toString();
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        filterIterator65.setPredicate(predicate67);
        java.util.Iterator iterator70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70, predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate71);
        java.lang.Object obj74 = defaultedMap58.get((java.lang.Object) filterIterator65);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate77);
        java.util.Iterator iterator80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator80, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        java.util.Iterator iterator90 = null;
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator(iterator90, predicate91);
        filterIterator89.setPredicate(predicate91);
        filterIterator82.setPredicate(predicate91);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate91);
        boolean b96 = defaultedMap51.containsValue((java.lang.Object) filterIterator95);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator95);
        filterIterator46.setIterator((java.util.Iterator) filterIterator95);
        filterIterator8.setIterator((java.util.Iterator) filterIterator46);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 1 + "'", obj74.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 100);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        filterIterator27.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate33);
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        filterIterator40.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        filterIterator47.setPredicate(predicate49);
        filterIterator40.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) 100);
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        filterIterator62.setPredicate(predicate64);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate68);
        java.lang.Object obj71 = defaultedMap55.get((java.lang.Object) filterIterator62);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        filterIterator75.setPredicate(predicate77);
        java.util.Iterator iterator80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator80, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        filterIterator75.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate84);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate84);
        int i90 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 1 + "'", obj36.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 1 + "'", obj71.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap18.entrySet();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        java.util.Collection collection23 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap27.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap27.remove((java.lang.Object) collection36);
        java.lang.Object obj38 = defaultedMap5.remove((java.lang.Object) defaultedMap27);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        filterIterator41.setPredicate(predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set48 = defaultedMap47.entrySet();
        boolean b50 = defaultedMap47.containsKey((java.lang.Object) 100);
        java.lang.String str51 = defaultedMap47.toString();
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        filterIterator54.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate60);
        java.lang.Object obj63 = defaultedMap47.get((java.lang.Object) filterIterator54);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate66);
        filterIterator41.setIterator((java.util.Iterator) filterIterator54);
        boolean b70 = defaultedMap27.containsKey((java.lang.Object) filterIterator41);
        collections.Factory factory71 = null;
        try {
            java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 1 + "'", obj63.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj37 = defaultedMap26.put((java.lang.Object) defaultedMap30, (java.lang.Object) 10);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) collection43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) collection43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set50 = defaultedMap49.entrySet();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.util.Set set53 = defaultedMap47.entrySet();
        java.util.Set set54 = defaultedMap47.keySet();
        java.lang.Object obj55 = defaultedMap15.get((java.lang.Object) defaultedMap47);
        int i56 = defaultedMap47.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + ' ' + "'", obj55.equals(' '));
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        java.util.Collection collection15 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap19.clear();
        java.lang.String str24 = defaultedMap19.toString();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        filterIterator28.setPredicate(predicate30);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate34);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        boolean b39 = defaultedMap10.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.entrySet();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        defaultedMap43.clear();
        java.lang.String str48 = defaultedMap43.toString();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        filterIterator52.setPredicate(predicate54);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        boolean b63 = defaultedMap10.equals((java.lang.Object) defaultedMap43);
        java.lang.Object obj64 = defaultedMap1.get((java.lang.Object) defaultedMap43);
        int i65 = defaultedMap43.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + ' ' + "'", obj64.equals(' '));
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 100);
        java.lang.String str25 = defaultedMap21.toString();
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        filterIterator28.setPredicate(predicate30);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate34);
        java.lang.Object obj37 = defaultedMap21.get((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        filterIterator41.setPredicate(predicate43);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        filterIterator48.setPredicate(predicate50);
        filterIterator41.setPredicate(predicate50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate50);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate50);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 1 + "'", obj37.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate50);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b8 = defaultedMap3.equals((java.lang.Object) 10);
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        filterIterator13.setPredicate(predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap3.containsValue((java.lang.Object) filterIterator22);
        boolean b24 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator25.setPredicate(predicate27);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        filterIterator32.setPredicate(predicate34);
        filterIterator25.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap42.clear();
        java.lang.String str47 = defaultedMap42.toString();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        filterIterator51.setPredicate(predicate53);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate57);
        filterIterator38.setPredicate(predicate57);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        filterIterator64.setPredicate(predicate66);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate70);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        filterIterator75.setPredicate(predicate77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate77);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate77);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str8 = defaultedMap3.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 10);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b32 = defaultedMap3.containsKey((java.lang.Object) defaultedMap31);
        java.lang.String str33 = defaultedMap31.toString();
        int i34 = defaultedMap31.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 100);
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        java.lang.Object obj24 = defaultedMap8.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate27);
        filterIterator2.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        filterIterator33.setPredicate(predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        filterIterator33.setIterator(iterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate48);
        filterIterator15.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        filterIterator56.setPredicate(predicate58);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate62);
        filterIterator53.setIterator((java.util.Iterator) filterIterator64);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 1 + "'", obj24.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate62);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str8 = defaultedMap3.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate18);
        java.util.Set set22 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) set22);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        filterIterator28.setPredicate(predicate30);
        filterIterator21.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        int i36 = defaultedMap35.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 100);
        java.lang.String str14 = defaultedMap10.toString();
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        filterIterator17.setPredicate(predicate19);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate23);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        filterIterator34.setPredicate(predicate36);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        filterIterator41.setPredicate(predicate43);
        filterIterator34.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate43);
        boolean b48 = defaultedMap3.containsValue((java.lang.Object) filterIterator47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set18 = defaultedMap17.entrySet();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        defaultedMap26.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj32 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj35 = defaultedMap5.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + ' ' + "'", obj32.equals(' '));
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.util.Set set18 = defaultedMap15.keySet();
        boolean b19 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.lang.String str20 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i32 = defaultedMap25.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 100);
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        java.lang.Object obj24 = defaultedMap8.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate27);
        filterIterator2.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator31 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set34 = defaultedMap33.entrySet();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) 100);
        java.lang.String str37 = defaultedMap33.toString();
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        filterIterator40.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate46);
        java.lang.Object obj49 = defaultedMap33.get((java.lang.Object) filterIterator40);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate52);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        filterIterator57.setPredicate(predicate59);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        filterIterator64.setPredicate(predicate66);
        filterIterator57.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set75 = defaultedMap74.entrySet();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        defaultedMap74.clear();
        java.lang.String str79 = defaultedMap74.toString();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator81 = null;
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator81, predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        filterIterator83.setPredicate(predicate85);
        java.util.Iterator iterator88 = null;
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator(iterator88, predicate89);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate89);
        filterIterator70.setPredicate(predicate89);
        filterIterator15.setPredicate(predicate89);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 1 + "'", obj24.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 1 + "'", obj49.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 100);
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setPredicate(predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator31.setPredicate(predicate33);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        filterIterator38.setPredicate(predicate40);
        filterIterator31.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate40);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) filterIterator44);
        boolean b47 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 1 + "'", obj27.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 100);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        filterIterator27.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate33);
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        filterIterator40.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        filterIterator47.setPredicate(predicate49);
        filterIterator40.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) 100);
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        filterIterator62.setPredicate(predicate64);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate68);
        java.lang.Object obj71 = defaultedMap55.get((java.lang.Object) filterIterator62);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        filterIterator75.setPredicate(predicate77);
        java.util.Iterator iterator80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator80, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        filterIterator75.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate84);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate84);
        boolean b90 = defaultedMap1.isEmpty();
        collections.Factory factory91 = null;
        try {
            java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 1 + "'", obj36.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 1 + "'", obj71.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.get(obj14);
        boolean b16 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = filterIterator2.getIterator();
        collections.Predicate predicate12 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        filterIterator13.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 100);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        filterIterator27.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate33);
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        filterIterator40.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        filterIterator47.setPredicate(predicate49);
        filterIterator40.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate49);
        collections.Predicate predicate54 = filterIterator53.getPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set57 = defaultedMap56.entrySet();
        boolean b59 = defaultedMap56.containsKey((java.lang.Object) 100);
        java.lang.String str60 = defaultedMap56.toString();
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        filterIterator63.setPredicate(predicate65);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate69);
        java.lang.Object obj72 = defaultedMap56.get((java.lang.Object) filterIterator63);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        java.util.Iterator iterator74 = null;
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator74, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate75);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate75);
        filterIterator10.setIterator((java.util.Iterator) filterIterator53);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 1 + "'", obj36.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) 1 + "'", obj72.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate75);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        filterIterator9.setPredicate(predicate11);
        filterIterator2.setPredicate(predicate11);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        filterIterator17.setPredicate(predicate19);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        filterIterator2.setIterator((java.util.Iterator) filterIterator25);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap6.entrySet();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        defaultedMap6.clear();
        java.util.Collection collection11 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap15.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.String str20 = defaultedMap15.toString();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        filterIterator24.setPredicate(predicate26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        boolean b35 = defaultedMap6.containsKey((java.lang.Object) defaultedMap34);
        java.lang.String str36 = defaultedMap34.toString();
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) b38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        filterIterator42.setPredicate(predicate44);
        boolean b47 = defaultedMap1.containsKey((java.lang.Object) filterIterator42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator13 = filterIterator2.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator25.setPredicate(predicate27);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        filterIterator32.setPredicate(predicate34);
        filterIterator25.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate34);
        try {
            boolean b39 = filterIterator38.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b8 = defaultedMap3.equals((java.lang.Object) 10);
        int i9 = defaultedMap3.size();
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Collection collection21 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) collection21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj35 = defaultedMap24.put((java.lang.Object) defaultedMap28, (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b47 = defaultedMap28.equals((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set50 = defaultedMap49.entrySet();
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) 100);
        java.lang.String str53 = defaultedMap49.toString();
        java.lang.Object obj54 = defaultedMap28.remove((java.lang.Object) defaultedMap49);
        java.lang.Object obj55 = defaultedMap12.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) 1 + "'", obj55.equals((short) 1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.util.Set set18 = defaultedMap15.keySet();
        boolean b19 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.lang.String str20 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap25.clear();
        java.util.Collection collection30 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap34.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        defaultedMap34.clear();
        java.lang.String str39 = defaultedMap34.toString();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        filterIterator43.setPredicate(predicate45);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap34);
        boolean b54 = defaultedMap25.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set59 = defaultedMap58.entrySet();
        boolean b60 = defaultedMap58.isEmpty();
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        defaultedMap58.clear();
        java.lang.String str63 = defaultedMap58.toString();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        filterIterator67.setPredicate(predicate69);
        java.util.Iterator iterator72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate73);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap58);
        boolean b78 = defaultedMap25.equals((java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set81 = defaultedMap80.entrySet();
        java.util.Set set82 = defaultedMap80.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap80);
        java.util.Collection collection84 = defaultedMap80.values();
        java.lang.Object obj85 = defaultedMap15.remove((java.lang.Object) collection84);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 100);
        java.lang.String str34 = defaultedMap30.toString();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        filterIterator37.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate43);
        java.lang.Object obj46 = defaultedMap30.get((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) filterIterator51);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        filterIterator55.setPredicate(predicate57);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        java.lang.Object obj65 = defaultedMap1.remove((java.lang.Object) filterIterator63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b35 = defaultedMap32.containsKey((java.lang.Object) 100);
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator39.setPredicate(predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate45);
        java.lang.Object obj48 = defaultedMap32.get((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        filterIterator56.setPredicate(predicate58);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        filterIterator63.setPredicate(predicate65);
        filterIterator56.setPredicate(predicate65);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate65);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        filterIterator30.setIterator((java.util.Iterator) filterIterator70);
        java.lang.Object obj72 = defaultedMap8.get((java.lang.Object) filterIterator70);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 1 + "'", obj48.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + ' ' + "'", obj72.equals(' '));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = filterIterator2.getIterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 100);
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        filterIterator16.setPredicate(predicate18);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate22);
        java.lang.Object obj25 = defaultedMap9.get((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        filterIterator2.setIterator((java.util.Iterator) filterIterator26);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 1 + "'", obj25.equals((short) 1));
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        boolean b13 = defaultedMap11.isEmpty();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10);
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b28 = defaultedMap9.equals((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set37 = defaultedMap36.entrySet();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) defaultedMap34, (java.lang.Object) 10);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set46 = defaultedMap45.entrySet();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap34.get((java.lang.Object) collection47);
        boolean b49 = defaultedMap19.containsKey((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set58 = defaultedMap57.entrySet();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj62 = defaultedMap51.put((java.lang.Object) defaultedMap55, (java.lang.Object) 10);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 10.0f);
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) defaultedMap19, (java.lang.Object) 10.0f);
        java.util.Collection collection66 = defaultedMap19.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + ' ' + "'", obj48.equals(' '));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 100);
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        filterIterator19.setPredicate(predicate21);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate25);
        java.lang.Object obj28 = defaultedMap12.get((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        filterIterator32.setPredicate(predicate34);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator39.setPredicate(predicate41);
        filterIterator32.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate41);
        boolean b46 = defaultedMap3.equals((java.lang.Object) filterIterator45);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 1 + "'", obj28.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap18.entrySet();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        java.util.Collection collection23 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap27.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap27.remove((java.lang.Object) collection36);
        java.lang.Object obj38 = defaultedMap5.remove((java.lang.Object) defaultedMap27);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        java.lang.Object obj43 = defaultedMap5.get((java.lang.Object) filterIterator41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + ' ' + "'", obj43.equals(' '));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        filterIterator2.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate17);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str7 = defaultedMap3.toString();
        java.util.Collection collection8 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b32 = defaultedMap3.containsKey((java.lang.Object) defaultedMap31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        filterIterator35.setPredicate(predicate37);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        filterIterator42.setPredicate(predicate44);
        filterIterator35.setPredicate(predicate44);
        boolean b48 = defaultedMap31.equals((java.lang.Object) filterIterator35);
        java.util.Set set49 = defaultedMap31.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set19 = defaultedMap8.keySet();
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        filterIterator22.setPredicate(predicate24);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        boolean b32 = defaultedMap8.containsKey((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNull(predicate19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.lang.String str25 = defaultedMap15.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i18 = defaultedMap11.size();
        java.lang.Object obj20 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap3.keySet();
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        filterIterator24.setPredicate(predicate26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate30);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        filterIterator35.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        boolean b41 = defaultedMap3.equals((java.lang.Object) predicate37);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10L);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) defaultedMap12, (java.lang.Object) 10);
        java.util.Set set20 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b31 = defaultedMap12.equals((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set40 = defaultedMap39.entrySet();
        boolean b41 = defaultedMap39.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = defaultedMap33.put((java.lang.Object) defaultedMap37, (java.lang.Object) 10);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set49 = defaultedMap48.entrySet();
        java.util.Collection collection50 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap37.get((java.lang.Object) collection50);
        boolean b52 = defaultedMap22.containsKey((java.lang.Object) collection50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set57 = defaultedMap56.entrySet();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        java.util.Set set60 = defaultedMap54.entrySet();
        java.util.Set set61 = defaultedMap54.keySet();
        java.lang.Object obj62 = defaultedMap22.get((java.lang.Object) defaultedMap54);
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + ' ' + "'", obj51.equals(' '));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + ' ' + "'", obj62.equals(' '));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 100);
        java.lang.String str23 = defaultedMap19.toString();
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        filterIterator26.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) filterIterator26);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate37 = filterIterator26.getPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set40 = defaultedMap39.entrySet();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap15.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap39);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) defaultedMap39);
        boolean b46 = defaultedMap39.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) defaultedMap8, (java.lang.Object) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set19 = defaultedMap8.keySet();
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        filterIterator22.setPredicate(predicate24);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        filterIterator33.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate35);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate35, predicate40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        filterIterator13.setPredicate(predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setPredicate(predicate22);
        filterIterator13.setPredicate(predicate22);
        filterIterator10.setPredicate(predicate22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set29 = defaultedMap28.entrySet();
        java.util.Collection collection30 = defaultedMap28.values();
        java.util.Set set31 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set36 = defaultedMap35.entrySet();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        defaultedMap35.clear();
        java.lang.String str40 = defaultedMap35.toString();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate50);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate50);
        java.lang.Object obj54 = defaultedMap28.remove((java.lang.Object) predicate41);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate41);
        try {
            filterIterator55.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 100);
        java.lang.String str23 = defaultedMap19.toString();
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        filterIterator26.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) filterIterator26);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) filterIterator26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator21.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b32 = defaultedMap3.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap34.put((java.lang.Object) defaultedMap38, (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set53 = defaultedMap52.entrySet();
        boolean b54 = defaultedMap52.isEmpty();
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set66 = defaultedMap65.entrySet();
        boolean b67 = defaultedMap65.isEmpty();
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj70 = defaultedMap59.put((java.lang.Object) defaultedMap63, (java.lang.Object) 10);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set75 = defaultedMap74.entrySet();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap63.get((java.lang.Object) collection76);
        boolean b78 = defaultedMap48.containsKey((java.lang.Object) collection76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set83 = defaultedMap82.entrySet();
        boolean b84 = defaultedMap82.isEmpty();
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        java.util.Set set86 = defaultedMap80.entrySet();
        java.util.Set set87 = defaultedMap80.keySet();
        java.lang.Object obj88 = defaultedMap48.get((java.lang.Object) defaultedMap80);
        defaultedMap3.putAll((java.util.Map) defaultedMap80);
        defaultedMap80.clear();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + ' ' + "'", obj77.equals(' '));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + ' ' + "'", obj88.equals(' '));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10L);
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate8);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap14.entrySet();
        java.util.Set set21 = defaultedMap14.keySet();
        int i22 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 100);
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator31.setPredicate(predicate33);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate37);
        java.lang.Object obj40 = defaultedMap24.get((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        filterIterator51.setPredicate(predicate53);
        filterIterator44.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate53);
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        boolean b59 = defaultedMap14.containsKey((java.lang.Object) filterIterator57);
        collections.Predicate predicate60 = null;
        filterIterator57.setPredicate(predicate60);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) filterIterator57);
        collections.Transformer transformer63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.lang.String str17 = defaultedMap12.toString();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        boolean b19 = defaultedMap12.isEmpty();
        int i20 = defaultedMap12.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) defaultedMap17, (java.lang.Object) 10);
        int i25 = defaultedMap17.size();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap17.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) 0L);
        boolean b34 = defaultedMap29.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.util.Set set38 = defaultedMap36.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap8.put(obj26, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set47 = defaultedMap46.entrySet();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 100);
        java.lang.String str50 = defaultedMap46.toString();
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        filterIterator53.setPredicate(predicate55);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate59);
        java.lang.Object obj62 = defaultedMap46.get((java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate64 = filterIterator53.getPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set67 = defaultedMap66.entrySet();
        java.util.Collection collection68 = defaultedMap66.values();
        java.lang.Object obj69 = defaultedMap42.put((java.lang.Object) predicate64, (java.lang.Object) defaultedMap66);
        java.util.Set set70 = defaultedMap66.entrySet();
        java.lang.Object obj71 = defaultedMap8.get((java.lang.Object) defaultedMap66);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + ' ' + "'", obj27.equals(' '));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 1 + "'", obj62.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 1 + "'", obj71.equals((short) 1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator12.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Collection collection27 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) 100);
        java.lang.String str34 = defaultedMap30.toString();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        filterIterator37.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate43);
        java.lang.Object obj46 = defaultedMap30.get((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) filterIterator51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) 100);
        java.lang.String str30 = defaultedMap26.toString();
        java.lang.Object obj31 = defaultedMap5.remove((java.lang.Object) defaultedMap26);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        filterIterator34.setPredicate(predicate36);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate40);
        collections.Predicate predicate43 = filterIterator42.getPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) 100);
        java.lang.String str14 = defaultedMap10.toString();
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        filterIterator17.setPredicate(predicate19);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate23);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        filterIterator34.setPredicate(predicate36);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        filterIterator41.setPredicate(predicate43);
        filterIterator34.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate43);
        boolean b48 = defaultedMap3.containsValue((java.lang.Object) filterIterator47);
        boolean b49 = defaultedMap3.isEmpty();
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator8);
        boolean b18 = defaultedMap1.isEmpty();
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 100);
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        java.lang.Object obj24 = defaultedMap8.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate27);
        filterIterator2.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b35 = defaultedMap32.containsKey((java.lang.Object) 100);
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator39.setPredicate(predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate45);
        java.lang.Object obj48 = defaultedMap32.get((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate51);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 1 + "'", obj24.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 1 + "'", obj48.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate51);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10);
        int i13 = defaultedMap5.size();
        boolean b14 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        filterIterator2.setPredicate(predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 100);
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        java.lang.Object obj24 = defaultedMap8.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate27);
        filterIterator2.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        filterIterator33.setPredicate(predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        filterIterator33.setIterator(iterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate48);
        filterIterator15.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        try {
            filterIterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 1 + "'", obj24.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate48);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.String str11 = defaultedMap7.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate21);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        java.util.Set set25 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap29.clear();
        java.lang.String str34 = defaultedMap29.toString();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        filterIterator38.setPredicate(predicate40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate35, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.util.Set set49 = defaultedMap48.entrySet();
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) set49, (java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
    }
}

