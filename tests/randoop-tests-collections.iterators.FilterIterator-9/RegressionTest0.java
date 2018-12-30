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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        try {
            java.lang.Object obj3 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.put((java.lang.Object) '#', obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 100L);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 100L);
        int i25 = defaultedMap22.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate26, (java.lang.Object) (-1));
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        try {
            boolean b8 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        try {
            boolean b8 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap10.entrySet();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            boolean b8 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            java.lang.Object obj7 = filterIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        filterIterator3.setPredicate(predicate19);
        try {
            boolean b23 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        boolean b16 = defaultedMap9.equals((java.lang.Object) (-1));
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b21 = defaultedMap19.equals((java.lang.Object) 1L);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        filterIterator27.setPredicate(predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 100L);
        int i42 = defaultedMap39.size();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) predicate43, (java.lang.Object) (-1));
        filterIterator27.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        filterIterator47.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        filterIterator50.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate43, predicate58);
        defaultedMap9.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate5, (java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        defaultedMap9.clear();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) '#', obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 100L);
        int i33 = defaultedMap30.size();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) predicate34, (java.lang.Object) (-1));
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        java.util.Set set38 = defaultedMap30.entrySet();
        java.lang.Object obj39 = defaultedMap9.remove((java.lang.Object) defaultedMap30);
        java.util.Collection collection40 = defaultedMap30.values();
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) collection40);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.keySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate5, (java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) filterIterator9);
        java.lang.Object obj11 = defaultedMap4.remove((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 100L);
        int i16 = defaultedMap13.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate17, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        filterIterator23.setPredicate(predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 100L);
        int i38 = defaultedMap35.size();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap35.put((java.lang.Object) predicate39, (java.lang.Object) (-1));
        filterIterator23.setPredicate(predicate39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate43);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate17, predicate45);
        filterIterator2.setPredicate(predicate17);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        try {
            filterIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        filterIterator10.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        filterIterator22.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        filterIterator25.setPredicate(predicate33);
        filterIterator0.setPredicate(predicate33);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        filterIterator20.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 100L);
        int i36 = defaultedMap33.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) predicate37, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate37);
        filterIterator7.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        try {
            boolean b8 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1L);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        java.util.Set set9 = defaultedMap4.entrySet();
        boolean b11 = defaultedMap4.equals((java.lang.Object) (-1));
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) (-1));
        defaultedMap14.clear();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) '#', obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator16 = filterIterator9.getIterator();
        java.lang.Object obj17 = defaultedMap7.remove((java.lang.Object) filterIterator9);
        try {
            boolean b18 = filterIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b27 = defaultedMap25.equals((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        filterIterator33.setPredicate(predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 100L);
        int i48 = defaultedMap45.size();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate49, (java.lang.Object) (-1));
        filterIterator33.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        filterIterator56.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate49, predicate64);
        boolean b68 = defaultedMap15.equals((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = defaultedMap71.put((java.lang.Object) '#', obj74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap71.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj80 = defaultedMap77.get((java.lang.Object) 0);
        defaultedMap77.clear();
        java.lang.String str82 = defaultedMap77.toString();
        boolean b83 = defaultedMap15.containsValue((java.lang.Object) str82);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 10 + "'", obj80.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        filterIterator15.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 100L);
        int i31 = defaultedMap28.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) predicate32, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) filterIterator26);
        collections.Predicate predicate37 = filterIterator26.getPredicate();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.put((java.lang.Object) '#', obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 100L);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 100L);
        int i25 = defaultedMap22.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate26, (java.lang.Object) (-1));
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        boolean b40 = defaultedMap22.containsKey((java.lang.Object) filterIterator39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap22.containsKey(obj41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 100L);
        int i15 = defaultedMap12.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) predicate16, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator8, predicate16);
        filterIterator3.setPredicate(predicate16);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        java.util.Set set9 = defaultedMap4.entrySet();
        boolean b11 = defaultedMap4.equals((java.lang.Object) (-1));
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) (-1));
        defaultedMap14.clear();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 100.0d);
        java.util.Set set30 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) '#', obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 100L);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 100L);
        int i49 = defaultedMap46.size();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) predicate50, (java.lang.Object) (-1));
        defaultedMap41.putAll((java.util.Map) defaultedMap46);
        java.util.Set set54 = defaultedMap46.entrySet();
        java.lang.Object obj55 = defaultedMap25.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap46);
        java.util.Set set57 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = defaultedMap59.put((java.lang.Object) '#', obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap59.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj68 = defaultedMap65.get((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = null;
        filterIterator72.setPredicate(predicate73);
        filterIterator69.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate79 = null;
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        filterIterator72.setPredicate(predicate80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj86 = defaultedMap84.remove((java.lang.Object) 100L);
        int i87 = defaultedMap84.size();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj90 = defaultedMap84.put((java.lang.Object) predicate88, (java.lang.Object) (-1));
        filterIterator72.setPredicate(predicate88);
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        filterIterator72.setPredicate(predicate92);
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate92);
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator();
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap96, (java.lang.Object) filterIterator97);
        java.lang.Object obj99 = defaultedMap1.put((java.lang.Object) defaultedMap65, (java.lang.Object) filterIterator97);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (short) 10 + "'", obj68.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) 100.0d);
        java.util.Set set24 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) '#', obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 100L);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 100L);
        int i43 = defaultedMap40.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap40.put((java.lang.Object) predicate44, (java.lang.Object) (-1));
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        java.util.Set set48 = defaultedMap40.entrySet();
        java.lang.Object obj49 = defaultedMap19.remove((java.lang.Object) defaultedMap40);
        boolean b51 = defaultedMap40.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) predicate55);
        collections.Factory factory58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{#=null}" + "'", str7.equals("{#=null}"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = null;
        filterIterator28.setPredicate(predicate29);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        filterIterator35.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate43);
        boolean b47 = defaultedMap15.containsValue((java.lang.Object) filterIterator46);
        try {
            java.lang.Object obj48 = filterIterator46.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        java.util.Set set9 = defaultedMap4.entrySet();
        boolean b11 = defaultedMap4.equals((java.lang.Object) (-1));
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) (-1));
        defaultedMap14.clear();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 100.0d);
        java.util.Set set30 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) '#', obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 100L);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 100L);
        int i49 = defaultedMap46.size();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) predicate50, (java.lang.Object) (-1));
        defaultedMap41.putAll((java.util.Map) defaultedMap46);
        java.util.Set set54 = defaultedMap46.entrySet();
        java.lang.Object obj55 = defaultedMap25.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap46);
        java.util.Set set57 = defaultedMap1.keySet();
        java.util.Set set58 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        filterIterator15.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 100L);
        int i31 = defaultedMap28.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) predicate32, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) filterIterator26);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        filterIterator47.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        filterIterator50.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator37, predicate58);
        boolean b63 = defaultedMap1.equals((java.lang.Object) iterator37);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        filterIterator27.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator14, predicate35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        boolean b41 = defaultedMap10.containsValue((java.lang.Object) filterIterator39);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{#=null}" + "'", str9.equals("{#=null}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) '#', obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 100L);
        int i33 = defaultedMap30.size();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) predicate34, (java.lang.Object) (-1));
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        java.util.Set set38 = defaultedMap30.entrySet();
        java.lang.Object obj39 = defaultedMap9.remove((java.lang.Object) defaultedMap30);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        boolean b48 = defaultedMap30.containsKey((java.lang.Object) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj50 = defaultedMap1.put((java.lang.Object) filterIterator47, (java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) filterIterator57);
        java.lang.Object obj59 = defaultedMap52.remove((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) 100L);
        int i64 = defaultedMap61.size();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) predicate65, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = null;
        filterIterator68.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = null;
        filterIterator71.setPredicate(predicate72);
        filterIterator68.setIterator((java.util.Iterator) filterIterator71);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        filterIterator71.setPredicate(predicate79);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj85 = defaultedMap83.remove((java.lang.Object) 100L);
        int i86 = defaultedMap83.size();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj89 = defaultedMap83.put((java.lang.Object) predicate87, (java.lang.Object) (-1));
        filterIterator71.setPredicate(predicate87);
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate91);
        collections.Predicate predicate93 = filterIterator92.getPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate65, predicate93);
        filterIterator47.setPredicate(predicate93);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = null;
        filterIterator28.setPredicate(predicate29);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        filterIterator35.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate43);
        boolean b47 = defaultedMap15.containsValue((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = null;
        filterIterator51.setPredicate(predicate52);
        filterIterator48.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48);
        filterIterator46.setIterator((java.util.Iterator) filterIterator48);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate64 = filterIterator60.getPredicate();
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate66);
        filterIterator46.setIterator((java.util.Iterator) filterIterator60);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) '#', obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 100L);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Set set17 = defaultedMap13.entrySet();
        java.util.Collection collection18 = defaultedMap13.values();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection18);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            boolean b7 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b27 = defaultedMap25.equals((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        filterIterator33.setPredicate(predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 100L);
        int i48 = defaultedMap45.size();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate49, (java.lang.Object) (-1));
        filterIterator33.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        filterIterator56.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate49, predicate64);
        boolean b68 = defaultedMap15.equals((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = null;
        filterIterator70.setPredicate(predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = null;
        filterIterator73.setPredicate(predicate74);
        filterIterator70.setIterator((java.util.Iterator) filterIterator73);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) 100L);
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) 100.0d);
        java.util.Set set83 = defaultedMap78.entrySet();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap78);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj88 = defaultedMap86.remove((java.lang.Object) 100L);
        java.lang.Object obj90 = defaultedMap86.get((java.lang.Object) 100.0d);
        java.util.Set set91 = defaultedMap86.entrySet();
        java.util.Set set92 = defaultedMap86.keySet();
        java.util.Set set93 = defaultedMap86.entrySet();
        java.lang.Object obj94 = defaultedMap84.get((java.lang.Object) defaultedMap86);
        java.lang.Object obj95 = defaultedMap15.put((java.lang.Object) filterIterator73, (java.lang.Object) defaultedMap84);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 10 + "'", obj82.equals((short) 10));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) 10 + "'", obj90.equals((short) 10));
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) 100.0d);
        java.util.Set set24 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) '#', obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 100L);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 100L);
        int i43 = defaultedMap40.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap40.put((java.lang.Object) predicate44, (java.lang.Object) (-1));
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        java.util.Set set48 = defaultedMap40.entrySet();
        java.lang.Object obj49 = defaultedMap19.remove((java.lang.Object) defaultedMap40);
        boolean b51 = defaultedMap40.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 100L);
        java.lang.Object obj63 = defaultedMap59.get((java.lang.Object) 100.0d);
        java.util.Set set64 = defaultedMap59.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap66.put((java.lang.Object) '#', obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) 100L);
        defaultedMap72.putAll((java.util.Map) defaultedMap75);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) 100L);
        int i83 = defaultedMap80.size();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj86 = defaultedMap80.put((java.lang.Object) predicate84, (java.lang.Object) (-1));
        defaultedMap75.putAll((java.util.Map) defaultedMap80);
        java.util.Set set88 = defaultedMap80.entrySet();
        java.lang.Object obj89 = defaultedMap59.remove((java.lang.Object) defaultedMap80);
        boolean b91 = defaultedMap80.containsValue((java.lang.Object) 1.0f);
        boolean b92 = defaultedMap7.containsValue((java.lang.Object) defaultedMap80);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 10 + "'", obj23.equals((short) 10));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 10 + "'", obj63.equals((short) 10));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) 0);
        defaultedMap7.clear();
        java.util.Collection collection12 = defaultedMap7.values();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 100L);
        int i20 = defaultedMap17.size();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) predicate21, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator13, predicate21);
        java.lang.Object obj25 = defaultedMap7.get((java.lang.Object) filterIterator24);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        java.util.Set set9 = defaultedMap4.entrySet();
        boolean b11 = defaultedMap4.equals((java.lang.Object) (-1));
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) (-1));
        defaultedMap14.clear();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.lang.String str24 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = null;
        filterIterator28.setPredicate(predicate29);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate32 = filterIterator28.getPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate33);
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 100L);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) 100.0d);
        java.util.Set set42 = defaultedMap37.entrySet();
        java.util.Set set43 = defaultedMap37.keySet();
        defaultedMap37.clear();
        java.lang.Object obj45 = defaultedMap14.put((java.lang.Object) iterator35, (java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        filterIterator13.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator0, predicate21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) '#', obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) predicateUtils33);
        defaultedMap15.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 100L);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap37.entrySet();
        java.util.Set set43 = defaultedMap37.entrySet();
        java.lang.Object obj44 = defaultedMap15.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 10 + "'", obj41.equals((short) 10));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 100.0d);
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b20 = defaultedMap18.equals((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        filterIterator23.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        filterIterator26.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 100L);
        int i41 = defaultedMap38.size();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) predicate42, (java.lang.Object) (-1));
        filterIterator26.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = null;
        filterIterator46.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        filterIterator49.setPredicate(predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate57);
        java.lang.Object obj61 = defaultedMap10.remove((java.lang.Object) predicate57);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 100.0d);
        java.util.Set set69 = defaultedMap64.entrySet();
        java.util.Set set70 = defaultedMap64.keySet();
        java.util.Set set71 = defaultedMap64.entrySet();
        java.lang.Object obj72 = defaultedMap1.remove((java.lang.Object) set71);
        java.util.Set set73 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '#' + "'", obj22.equals('#'));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (short) 10 + "'", obj68.equals((short) 10));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        filterIterator10.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate18);
        try {
            java.lang.Object obj22 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator8);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 100L);
        int i15 = defaultedMap12.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) predicate16, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        filterIterator22.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        int i37 = defaultedMap34.size();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) predicate38, (java.lang.Object) (-1));
        filterIterator22.setPredicate(predicate38);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate42);
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate44);
        boolean b47 = defaultedMap1.isEmpty();
        java.util.Set set48 = defaultedMap1.keySet();
        boolean b49 = defaultedMap1.isEmpty();
        java.util.Collection collection50 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.equals((java.lang.Object) (-1));
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.remove(obj9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        boolean b14 = defaultedMap1.equals((java.lang.Object) map13);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) '#', obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate9);
        java.util.Iterator iterator12 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.put((java.lang.Object) '#', obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 100L);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 100L);
        int i31 = defaultedMap28.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) predicate32, (java.lang.Object) (-1));
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        java.util.Set set36 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b40 = defaultedMap38.equals((java.lang.Object) 1L);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = null;
        filterIterator46.setPredicate(predicate47);
        filterIterator43.setIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        filterIterator46.setPredicate(predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) 100L);
        int i61 = defaultedMap58.size();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap58.put((java.lang.Object) predicate62, (java.lang.Object) (-1));
        filterIterator46.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = null;
        filterIterator66.setPredicate(predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        filterIterator66.setIterator((java.util.Iterator) filterIterator69);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        filterIterator69.setPredicate(predicate77);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate62, predicate77);
        boolean b81 = defaultedMap28.equals((java.lang.Object) predicate62);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator12, predicate62);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.put((java.lang.Object) '#', obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 100L);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 100L);
        int i25 = defaultedMap22.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate26, (java.lang.Object) (-1));
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        boolean b40 = defaultedMap22.containsKey((java.lang.Object) filterIterator39);
        try {
            boolean b41 = filterIterator39.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = filterIterator32.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator38);
        try {
            filterIterator28.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap3.clear();
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsKey(obj6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = filterIterator32.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator38);
        try {
            boolean b41 = filterIterator38.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) 0);
        defaultedMap7.clear();
        java.lang.String str12 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        filterIterator16.setPredicate(predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 100L);
        int i31 = defaultedMap28.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) predicate32, (java.lang.Object) (-1));
        filterIterator16.setPredicate(predicate32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate36);
        boolean b38 = defaultedMap7.containsKey((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap7.isEmpty();
        java.util.Collection collection15 = defaultedMap7.values();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        filterIterator3.setPredicate(predicate19);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator6);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.put((java.lang.Object) '#', obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator15);
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 100L);
        int i22 = defaultedMap19.size();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) predicate23, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        filterIterator26.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        filterIterator29.setPredicate(predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 100L);
        int i44 = defaultedMap41.size();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap41.put((java.lang.Object) predicate45, (java.lang.Object) (-1));
        filterIterator29.setPredicate(predicate45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate49);
        collections.Predicate predicate51 = filterIterator50.getPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate23, predicate51);
        java.lang.Object obj53 = defaultedMap8.get((java.lang.Object) predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        filterIterator54.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        filterIterator57.setPredicate(predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) 100L);
        int i72 = defaultedMap69.size();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj75 = defaultedMap69.put((java.lang.Object) predicate73, (java.lang.Object) (-1));
        filterIterator57.setPredicate(predicate73);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate77);
        collections.Predicate predicate79 = filterIterator78.getPredicate();
        java.lang.Object obj80 = defaultedMap8.get((java.lang.Object) predicate79);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 10 + "'", obj53.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 10 + "'", obj80.equals((short) 10));
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.entrySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) filterIterator13);
        try {
            boolean b15 = filterIterator13.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator3.setIterator((java.util.Iterator) filterIterator16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set8 = defaultedMap7.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) 0);
        defaultedMap7.clear();
        java.util.Collection collection12 = defaultedMap7.values();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = filterIterator24.getPredicate();
        filterIterator20.setIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator30 = filterIterator20.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = null;
        filterIterator31.setPredicate(predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = null;
        filterIterator34.setPredicate(predicate35);
        filterIterator31.setIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        filterIterator34.setPredicate(predicate42);
        filterIterator20.setPredicate(predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 100L);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate42, predicate50);
        collections.Transformer transformer53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 10 + "'", obj51.equals((short) 10));
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 100.0d);
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b20 = defaultedMap18.equals((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        filterIterator23.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        filterIterator26.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 100L);
        int i41 = defaultedMap38.size();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) predicate42, (java.lang.Object) (-1));
        filterIterator26.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = null;
        filterIterator46.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        filterIterator49.setPredicate(predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate57);
        java.lang.Object obj61 = defaultedMap10.remove((java.lang.Object) predicate57);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 100.0d);
        java.util.Set set69 = defaultedMap64.entrySet();
        java.util.Set set70 = defaultedMap64.keySet();
        java.util.Set set71 = defaultedMap64.entrySet();
        java.lang.Object obj72 = defaultedMap1.remove((java.lang.Object) set71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) 100L);
        java.lang.Object obj78 = defaultedMap74.get((java.lang.Object) 100.0d);
        java.util.Set set79 = defaultedMap74.entrySet();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap74);
        java.lang.Object obj81 = defaultedMap1.remove((java.lang.Object) defaultedMap74);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '#' + "'", obj22.equals('#'));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (short) 10 + "'", obj68.equals((short) 10));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) 10 + "'", obj78.equals((short) 10));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) '#', obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        filterIterator18.setPredicate(predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 100L);
        int i33 = defaultedMap30.size();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) predicate34, (java.lang.Object) (-1));
        filterIterator18.setPredicate(predicate34);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate38);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 100.0d);
        java.util.Set set47 = defaultedMap42.entrySet();
        boolean b49 = defaultedMap42.equals((java.lang.Object) (-1));
        java.lang.String str50 = defaultedMap42.toString();
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = null;
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) map40, (java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 100.0d);
        java.util.Set set21 = defaultedMap16.entrySet();
        java.util.Set set22 = defaultedMap16.keySet();
        java.util.Set set23 = defaultedMap16.entrySet();
        java.lang.Object obj24 = defaultedMap10.remove((java.lang.Object) defaultedMap16);
        defaultedMap10.clear();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 10 + "'", obj20.equals((short) 10));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        filterIterator3.setPredicate(predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        java.util.Iterator iterator4 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        filterIterator16.setPredicate(predicate24);
        filterIterator8.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator28);
        filterIterator2.setIterator((java.util.Iterator) filterIterator16);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        collections.Predicate predicate8 = filterIterator3.getPredicate();
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(predicate8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        filterIterator7.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        filterIterator21.setPredicate(predicate29);
        filterIterator7.setPredicate(predicate29);
        try {
            filterIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) '#', obj33);
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0d);
        java.util.Set set43 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.put((java.lang.Object) '#', obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 100L);
        defaultedMap51.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 100L);
        int i62 = defaultedMap59.size();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap59.put((java.lang.Object) predicate63, (java.lang.Object) (-1));
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        java.util.Set set67 = defaultedMap59.entrySet();
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap59);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = null;
        filterIterator72.setPredicate(predicate73);
        filterIterator69.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        boolean b77 = defaultedMap59.containsKey((java.lang.Object) filterIterator76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj79 = defaultedMap30.put((java.lang.Object) filterIterator76, (java.lang.Object) predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate78);
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        try {
            filterIterator80.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(iterator81);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 100.0d);
        java.util.Set set31 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) 100.0d);
        java.util.Set set39 = defaultedMap34.entrySet();
        java.util.Set set40 = defaultedMap34.keySet();
        java.util.Set set41 = defaultedMap34.entrySet();
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj43 = defaultedMap15.get((java.lang.Object) defaultedMap32);
        int i44 = defaultedMap15.size();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 10 + "'", obj43.equals((short) 10));
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator8);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 100L);
        int i15 = defaultedMap12.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) predicate16, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        filterIterator22.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        int i37 = defaultedMap34.size();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) predicate38, (java.lang.Object) (-1));
        filterIterator22.setPredicate(predicate38);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate42);
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate44);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) filterIterator50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) filterIterator54);
        java.lang.Object obj56 = defaultedMap49.remove((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) 100L);
        int i61 = defaultedMap58.size();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap58.put((java.lang.Object) predicate62, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = null;
        filterIterator65.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = null;
        filterIterator68.setPredicate(predicate69);
        filterIterator65.setIterator((java.util.Iterator) filterIterator68);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        filterIterator68.setPredicate(predicate76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) 100L);
        int i83 = defaultedMap80.size();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj86 = defaultedMap80.put((java.lang.Object) predicate84, (java.lang.Object) (-1));
        filterIterator68.setPredicate(predicate84);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate88);
        collections.Predicate predicate90 = filterIterator89.getPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate62, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate47, predicate62);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1L);
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = filterIterator32.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator38);
        try {
            boolean b41 = filterIterator28.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        filterIterator7.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.put((java.lang.Object) '#', obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 100L);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 100L);
        int i25 = defaultedMap22.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate26, (java.lang.Object) (-1));
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        java.lang.String str32 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        filterIterator13.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator0, predicate21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        java.lang.String str27 = defaultedMap26.toString();
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 100.0d);
        java.util.Set set31 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) 100.0d);
        java.util.Set set39 = defaultedMap34.entrySet();
        java.util.Set set40 = defaultedMap34.keySet();
        java.util.Set set41 = defaultedMap34.entrySet();
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj43 = defaultedMap15.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 100L);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 100.0d);
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b55 = defaultedMap48.equals((java.lang.Object) (-1));
        java.lang.Object obj56 = defaultedMap45.get((java.lang.Object) b55);
        defaultedMap15.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 10 + "'", obj30.equals((short) 10));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 10 + "'", obj38.equals((short) 10));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 10 + "'", obj43.equals((short) 10));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 10 + "'", obj52.equals((short) 10));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 10 + "'", obj56.equals((short) 10));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap8.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 100L);
        int i32 = defaultedMap29.size();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) predicate33, (java.lang.Object) (-1));
        filterIterator17.setPredicate(predicate33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate37);
        java.lang.Object obj39 = defaultedMap8.remove((java.lang.Object) predicate37);
        filterIterator0.setPredicate(predicate37);
        java.util.Iterator iterator41 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(iterator41);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        try {
            java.lang.Object obj9 = filterIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator6);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.String str13 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) '#', obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 100L);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 100L);
        int i32 = defaultedMap29.size();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) predicate33, (java.lang.Object) (-1));
        defaultedMap24.putAll((java.util.Map) defaultedMap29);
        boolean b37 = defaultedMap11.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj38 = defaultedMap1.remove((java.lang.Object) b37);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        filterIterator3.setPredicate(predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate23);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) map12);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{#=null}" + "'", str8.equals("{#=null}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        filterIterator7.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        filterIterator21.setPredicate(predicate29);
        filterIterator7.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = null;
        filterIterator34.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        filterIterator37.setPredicate(predicate45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 100L);
        int i52 = defaultedMap49.size();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) predicate53, (java.lang.Object) (-1));
        filterIterator37.setPredicate(predicate53);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate57);
        filterIterator7.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        filterIterator60.setIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        filterIterator63.setPredicate(predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) 100L);
        int i78 = defaultedMap75.size();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj81 = defaultedMap75.put((java.lang.Object) predicate79, (java.lang.Object) (-1));
        filterIterator63.setPredicate(predicate79);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        filterIterator63.setPredicate(predicate83);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate83);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate83);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        filterIterator13.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator0, predicate21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.String str30 = defaultedMap28.toString();
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        try {
            java.lang.Object obj29 = filterIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        java.util.Iterator iterator4 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        filterIterator13.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator0, predicate21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        try {
            java.lang.Object obj27 = filterIterator25.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.equals((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b27 = defaultedMap25.equals((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        filterIterator33.setPredicate(predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 100L);
        int i48 = defaultedMap45.size();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate49, (java.lang.Object) (-1));
        filterIterator33.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        filterIterator56.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate49, predicate64);
        boolean b68 = defaultedMap15.equals((java.lang.Object) predicate49);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = null;
        filterIterator72.setPredicate(predicate73);
        filterIterator69.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        java.lang.Object obj77 = defaultedMap15.get((java.lang.Object) filterIterator69);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 10 + "'", obj77.equals((short) 10));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        filterIterator7.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        filterIterator21.setPredicate(predicate29);
        filterIterator7.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 100.0d);
        java.util.Set set40 = defaultedMap35.entrySet();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        filterIterator41.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        filterIterator44.setPredicate(predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 100L);
        int i59 = defaultedMap56.size();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj62 = defaultedMap56.put((java.lang.Object) predicate60, (java.lang.Object) (-1));
        filterIterator44.setPredicate(predicate60);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate64);
        java.lang.Object obj66 = defaultedMap35.remove((java.lang.Object) predicate64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate64);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 10 + "'", obj39.equals((short) 10));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        filterIterator2.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 100.0d);
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        filterIterator19.setPredicate(predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 100L);
        int i34 = defaultedMap31.size();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) predicate35, (java.lang.Object) (-1));
        filterIterator19.setPredicate(predicate35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate39);
        java.lang.Object obj41 = defaultedMap10.remove((java.lang.Object) predicate39);
        filterIterator2.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate39);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 10 + "'", obj14.equals((short) 10));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.equals((java.lang.Object) (-1));
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) filterIterator18);
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 100L);
        int i25 = defaultedMap22.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate26, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        filterIterator32.setPredicate(predicate40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 100L);
        int i47 = defaultedMap44.size();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) predicate48, (java.lang.Object) (-1));
        filterIterator32.setPredicate(predicate48);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate52);
        collections.Predicate predicate54 = filterIterator53.getPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate26, predicate54);
        filterIterator11.setPredicate(predicate26);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) filterIterator11);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = defaultedMap59.put((java.lang.Object) '#', obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap59.putAll((java.util.Map) defaultedMap65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 100L);
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) 100L);
        int i76 = defaultedMap73.size();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj79 = defaultedMap73.put((java.lang.Object) predicate77, (java.lang.Object) (-1));
        defaultedMap68.putAll((java.util.Map) defaultedMap73);
        java.lang.Object obj81 = defaultedMap1.remove((java.lang.Object) defaultedMap73);
        java.lang.String str82 = defaultedMap1.toString();
        java.lang.Object obj83 = null;
        boolean b84 = defaultedMap1.equals(obj83);
        java.lang.String str85 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) '#', obj33);
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0d);
        java.util.Set set43 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.put((java.lang.Object) '#', obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 100L);
        defaultedMap51.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 100L);
        int i62 = defaultedMap59.size();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap59.put((java.lang.Object) predicate63, (java.lang.Object) (-1));
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        java.util.Set set67 = defaultedMap59.entrySet();
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap59);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = null;
        filterIterator72.setPredicate(predicate73);
        filterIterator69.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        boolean b77 = defaultedMap59.containsKey((java.lang.Object) filterIterator76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj79 = defaultedMap30.put((java.lang.Object) filterIterator76, (java.lang.Object) predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate78);
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        java.util.Iterator iterator82 = null;
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82, predicate83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj88 = defaultedMap86.remove((java.lang.Object) 100L);
        int i89 = defaultedMap86.size();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj92 = defaultedMap86.put((java.lang.Object) predicate90, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator(iterator82, predicate90);
        filterIterator80.setPredicate(predicate90);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap10.entrySet();
        java.util.Set set15 = defaultedMap10.keySet();
        java.util.Set set16 = defaultedMap10.entrySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        filterIterator14.setPredicate(predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 100L);
        int i29 = defaultedMap26.size();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap26.put((java.lang.Object) predicate30, (java.lang.Object) (-1));
        filterIterator14.setPredicate(predicate30);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate34);
        boolean b38 = defaultedMap7.containsKey((java.lang.Object) 100L);
        java.lang.Object obj40 = defaultedMap7.remove((java.lang.Object) "{}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 10 + "'", obj10.equals((short) 10));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) filterIterator29);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 100L);
        int i36 = defaultedMap33.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) predicate37, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        filterIterator43.setPredicate(predicate51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 100L);
        int i58 = defaultedMap55.size();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) predicate59, (java.lang.Object) (-1));
        filterIterator43.setPredicate(predicate59);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate63);
        collections.Predicate predicate65 = filterIterator64.getPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate37, predicate65);
        java.lang.Object obj67 = defaultedMap15.remove((java.lang.Object) predicate65);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 100L);
        int i18 = defaultedMap15.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate19, (java.lang.Object) (-1));
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set23 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) '#', obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) predicateUtils33);
        defaultedMap15.putAll((java.util.Map) defaultedMap25);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 10 + "'", obj34.equals((short) 10));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator8);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 100L);
        int i15 = defaultedMap12.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) predicate16, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        filterIterator22.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 100L);
        int i37 = defaultedMap34.size();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) predicate38, (java.lang.Object) (-1));
        filterIterator22.setPredicate(predicate38);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate42);
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate44);
        java.util.Collection collection47 = defaultedMap1.values();
        java.util.Set set48 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 10 + "'", obj46.equals((short) 10));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate8);
        collections.Predicate predicate10 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate26 = filterIterator22.getPredicate();
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        filterIterator22.setPredicate(predicate31);
        filterIterator3.setIterator((java.util.Iterator) filterIterator22);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) '#', obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 100.0d);
        java.util.Set set17 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b22 = defaultedMap20.equals((java.lang.Object) 1L);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = null;
        filterIterator28.setPredicate(predicate29);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        filterIterator28.setPredicate(predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 100L);
        int i43 = defaultedMap40.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap40.put((java.lang.Object) predicate44, (java.lang.Object) (-1));
        filterIterator28.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = null;
        filterIterator51.setPredicate(predicate52);
        filterIterator48.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        filterIterator51.setPredicate(predicate59);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate44, predicate59);
        java.lang.Object obj63 = defaultedMap12.remove((java.lang.Object) predicate59);
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) 100L);
        java.lang.Object obj70 = defaultedMap66.get((java.lang.Object) 100.0d);
        java.util.Set set71 = defaultedMap66.entrySet();
        java.util.Set set72 = defaultedMap66.keySet();
        java.util.Set set73 = defaultedMap66.entrySet();
        java.lang.Object obj74 = defaultedMap3.remove((java.lang.Object) set73);
        boolean b75 = defaultedMap1.containsValue(obj74);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 10 + "'", obj16.equals((short) 10));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 10 + "'", obj70.equals((short) 10));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate9);
        try {
            filterIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        filterIterator11.setPredicate(predicate19);
        filterIterator3.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap24.put((java.lang.Object) '#', obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 100L);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 100L);
        int i41 = defaultedMap38.size();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) predicate42, (java.lang.Object) (-1));
        defaultedMap33.putAll((java.util.Map) defaultedMap38);
        java.util.Set set46 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b50 = defaultedMap48.equals((java.lang.Object) 1L);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        filterIterator56.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 100L);
        int i71 = defaultedMap68.size();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) predicate72, (java.lang.Object) (-1));
        filterIterator56.setPredicate(predicate72);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.Predicate predicate77 = null;
        filterIterator76.setPredicate(predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.Predicate predicate80 = null;
        filterIterator79.setPredicate(predicate80);
        filterIterator76.setIterator((java.util.Iterator) filterIterator79);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate86 = null;
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        filterIterator79.setPredicate(predicate87);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate72, predicate87);
        boolean b91 = defaultedMap38.equals((java.lang.Object) predicate72);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate72);
        collections.Predicate predicate93 = filterIterator92.getPredicate();
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(predicate93);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        filterIterator9.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 100L);
        int i24 = defaultedMap21.size();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) predicate25, (java.lang.Object) (-1));
        filterIterator9.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        filterIterator32.setPredicate(predicate40);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate40);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        filterIterator10.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 100L);
        int i26 = defaultedMap23.size();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) predicate27, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap33.put((java.lang.Object) '#', obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) 0);
        defaultedMap39.clear();
        java.util.Collection collection44 = defaultedMap39.values();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = null;
        filterIterator45.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        filterIterator45.setIterator((java.util.Iterator) filterIterator48);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate60 = filterIterator56.getPredicate();
        filterIterator52.setIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator62 = filterIterator52.getIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = null;
        filterIterator66.setPredicate(predicate67);
        filterIterator63.setIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        filterIterator66.setPredicate(predicate74);
        filterIterator52.setPredicate(predicate74);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) 100L);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj83 = defaultedMap79.get((java.lang.Object) predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate74, predicate82);
        filterIterator31.setPredicate(predicate74);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 10 + "'", obj42.equals((short) 10));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 10 + "'", obj83.equals((short) 10));
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate5, (java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) '#', obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 100L);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 100L);
        int i26 = defaultedMap23.size();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) predicate27, (java.lang.Object) (-1));
        defaultedMap18.putAll((java.util.Map) defaultedMap23);
        java.util.Set set31 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        filterIterator43.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        boolean b55 = defaultedMap23.containsValue((java.lang.Object) filterIterator54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = null;
        filterIterator59.setPredicate(predicate60);
        filterIterator56.setIterator((java.util.Iterator) filterIterator59);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator56);
        boolean b65 = defaultedMap1.equals((java.lang.Object) filterIterator56);
        collections.Factory factory66 = null;
        try {
            java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        try {
            filterIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(predicate10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator6);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 100L);
        int i13 = defaultedMap10.size();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) predicate14, (java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        filterIterator20.setPredicate(predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 100L);
        int i35 = defaultedMap32.size();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) predicate36, (java.lang.Object) (-1));
        filterIterator20.setPredicate(predicate36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator44);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        java.util.Set set9 = defaultedMap4.entrySet();
        boolean b11 = defaultedMap4.equals((java.lang.Object) (-1));
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) (-1));
        defaultedMap14.clear();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 100.0d);
        java.util.Set set30 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b35 = defaultedMap33.equals((java.lang.Object) 1L);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        filterIterator38.setIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        filterIterator41.setPredicate(predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 100L);
        int i56 = defaultedMap53.size();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) predicate57, (java.lang.Object) (-1));
        filterIterator41.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = null;
        filterIterator64.setPredicate(predicate65);
        filterIterator61.setIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate71 = null;
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        filterIterator64.setPredicate(predicate72);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate57, predicate72);
        java.lang.Object obj76 = defaultedMap25.remove((java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = defaultedMap78.put((java.lang.Object) '#', obj81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap78.putAll((java.util.Map) defaultedMap84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = null;
        filterIterator86.setPredicate(predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.Predicate predicate90 = null;
        filterIterator89.setPredicate(predicate90);
        filterIterator86.setIterator((java.util.Iterator) filterIterator89);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) filterIterator86);
        boolean b95 = defaultedMap25.equals((java.lang.Object) map94);
        defaultedMap14.putAll(map94);
        int i97 = defaultedMap14.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 10 + "'", obj8.equals((short) 10));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 10 + "'", obj12.equals((short) 10));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 10 + "'", obj18.equals((short) 10));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 10 + "'", obj29.equals((short) 10));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '#' + "'", obj37.equals('#'));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        filterIterator3.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        filterIterator17.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) '#', obj4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) '#', obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 100L);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 100L);
        int i33 = defaultedMap30.size();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) predicate34, (java.lang.Object) (-1));
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        java.util.Set set38 = defaultedMap30.entrySet();
        java.lang.Object obj39 = defaultedMap9.remove((java.lang.Object) defaultedMap30);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        boolean b48 = defaultedMap30.containsKey((java.lang.Object) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj50 = defaultedMap1.put((java.lang.Object) filterIterator47, (java.lang.Object) predicate49);
        boolean b51 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
    }
}

