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
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 100.0f);
        int i14 = defaultedMap11.size();
        defaultedMap11.clear();
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) b16, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            java.lang.Object obj3 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate10 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(predicate10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator27);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) (-1.0f));
        java.lang.String str40 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 100.0f);
        int i45 = defaultedMap42.size();
        defaultedMap42.clear();
        defaultedMap42.clear();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        boolean b49 = defaultedMap42.containsValue((java.lang.Object) predicate48);
        boolean b50 = defaultedMap35.equals((java.lang.Object) predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate48, predicate51);
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        int i25 = defaultedMap8.size();
        int i26 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) predicate20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate20);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        int i37 = defaultedMap18.size();
        collections.Factory factory38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator0.setPredicate(predicate10);
        java.util.Iterator iterator13 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Map map25 = null;
        try {
            defaultedMap8.putAll(map25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate22);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 100.0f);
        int i16 = defaultedMap13.size();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate25);
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 100.0f);
        int i32 = defaultedMap29.size();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) '4');
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        java.util.Set set44 = defaultedMap29.keySet();
        java.lang.Object obj46 = defaultedMap29.get((java.lang.Object) 1.0f);
        java.lang.Object obj47 = defaultedMap13.put((java.lang.Object) filterIterator20, (java.lang.Object) defaultedMap29);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        java.lang.Object obj55 = defaultedMap9.put((java.lang.Object) defaultedMap29, (java.lang.Object) predicate53);
        collections.Transformer transformer56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, transformer56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        int i23 = defaultedMap20.size();
        defaultedMap20.clear();
        defaultedMap20.clear();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) predicate26);
        boolean b28 = defaultedMap13.equals((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate26);
        filterIterator0.setPredicate(predicate26);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        java.util.Iterator iterator57 = filterIterator54.getIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator54);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        filterIterator59.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        filterIterator64.setIterator((java.util.Iterator) filterIterator65);
        java.util.Iterator iterator67 = filterIterator64.getIterator();
        filterIterator59.setIterator((java.util.Iterator) filterIterator64);
        filterIterator54.setIterator((java.util.Iterator) filterIterator64);
        java.util.Iterator iterator70 = filterIterator64.getIterator();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) filterIterator64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) (-1.0f));
        java.lang.String str31 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        int i36 = defaultedMap33.size();
        defaultedMap33.clear();
        defaultedMap33.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) predicate39);
        boolean b41 = defaultedMap26.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) 100.0f);
        int i46 = defaultedMap43.size();
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 100.0f);
        int i53 = defaultedMap50.size();
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) (short) 1);
        java.util.Set set56 = defaultedMap50.entrySet();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) set56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        filterIterator58.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        filterIterator63.setIterator((java.util.Iterator) filterIterator64);
        java.util.Iterator iterator66 = filterIterator63.getIterator();
        filterIterator58.setIterator((java.util.Iterator) filterIterator63);
        java.lang.Object obj68 = defaultedMap26.put((java.lang.Object) set56, (java.lang.Object) filterIterator58);
        java.lang.Object obj69 = defaultedMap17.get(obj68);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100L + "'", obj55.equals(100L));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100L + "'", obj69.equals(100L));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate18);
        filterIterator13.setIterator((java.util.Iterator) filterIterator15);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) (-1.0f));
        java.lang.String str28 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) 100.0f);
        int i33 = defaultedMap30.size();
        defaultedMap30.clear();
        defaultedMap30.clear();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) predicate36);
        boolean b38 = defaultedMap23.equals((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap40.equals(obj45);
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) (-1.0f));
        java.lang.String str49 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        java.lang.Object obj58 = defaultedMap23.put((java.lang.Object) defaultedMap40, (java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        filterIterator59.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate62);
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        filterIterator65.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate64, predicate68);
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map21, predicate68, predicate71);
        filterIterator3.setPredicate(predicate68);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L + "'", obj11.equals(100L));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) '4');
        boolean b41 = defaultedMap34.isEmpty();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate45);
        java.util.Iterator iterator47 = filterIterator42.getIterator();
        java.lang.Object obj48 = defaultedMap9.put((java.lang.Object) b41, (java.lang.Object) iterator47);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100L + "'", obj40.equals(100L));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate46);
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate(map48, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) predicate20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate20);
        collections.Predicate predicate24 = filterIterator5.getPredicate();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(predicate24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator41 = filterIterator38.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator51 = filterIterator48.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator48);
        filterIterator38.setIterator((java.util.Iterator) filterIterator48);
        java.lang.Object obj54 = defaultedMap9.get((java.lang.Object) filterIterator48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b58 = defaultedMap56.containsValue((java.lang.Object) 100.0f);
        int i59 = defaultedMap56.size();
        defaultedMap56.clear();
        boolean b61 = defaultedMap56.isEmpty();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        filterIterator62.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        java.lang.Object obj69 = defaultedMap56.remove((java.lang.Object) filterIterator66);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        filterIterator71.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        filterIterator74.setIterator((java.util.Iterator) filterIterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        filterIterator74.setPredicate(predicate77);
        filterIterator72.setIterator((java.util.Iterator) filterIterator74);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) filterIterator72);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        filterIterator81.setIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81, predicate84);
        boolean b86 = defaultedMap80.containsValue((java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate84);
        filterIterator48.setPredicate(predicate84);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (-1.0f));
        java.lang.String str15 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        defaultedMap17.clear();
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) predicate23);
        boolean b25 = defaultedMap10.equals((java.lang.Object) predicate23);
        java.util.Set set26 = defaultedMap10.entrySet();
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator2);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNull(predicate16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate19);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator14);
        filterIterator0.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.util.Collection collection20 = defaultedMap16.values();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator9 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        int i21 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 100.0f);
        int i28 = defaultedMap25.size();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Set set31 = defaultedMap25.entrySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) set31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator41 = filterIterator38.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator38);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) set31, (java.lang.Object) filterIterator33);
        int i44 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator0.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        filterIterator14.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate24);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap1.entrySet();
        int i8 = defaultedMap1.size();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator2);
        java.util.Set set15 = defaultedMap1.keySet();
        java.util.Set set16 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator2);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate13);
        filterIterator8.setIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) '4');
        defaultedMap17.putAll((java.util.Map) defaultedMap24);
        java.util.Set set32 = defaultedMap17.keySet();
        java.lang.Object obj34 = defaultedMap17.get((java.lang.Object) 1.0f);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) filterIterator8, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        boolean b41 = defaultedMap17.containsKey((java.lang.Object) set40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) 100.0f);
        int i46 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicateUtils48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        filterIterator50.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        java.lang.Object obj55 = defaultedMap43.get((java.lang.Object) iterator54);
        boolean b56 = defaultedMap17.containsValue((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100L + "'", obj55.equals(100L));
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        int i37 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator11);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator41 = filterIterator38.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator51 = filterIterator48.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator48);
        filterIterator38.setIterator((java.util.Iterator) filterIterator48);
        java.lang.Object obj54 = defaultedMap9.get((java.lang.Object) filterIterator48);
        java.util.Set set55 = defaultedMap9.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        int i18 = defaultedMap1.size();
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        int i25 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) (-1.0f));
        java.lang.String str32 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 100.0f);
        int i37 = defaultedMap34.size();
        defaultedMap34.clear();
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = defaultedMap34.containsValue((java.lang.Object) predicate40);
        boolean b42 = defaultedMap27.equals((java.lang.Object) predicate40);
        java.util.Set set43 = defaultedMap27.entrySet();
        boolean b44 = defaultedMap27.isEmpty();
        java.util.Collection collection45 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) (-1.0f));
        java.lang.String str52 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 100.0f);
        int i57 = defaultedMap54.size();
        defaultedMap54.clear();
        defaultedMap54.clear();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        boolean b61 = defaultedMap54.containsValue((java.lang.Object) predicate60);
        boolean b62 = defaultedMap47.equals((java.lang.Object) predicate60);
        java.util.Set set63 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b67 = defaultedMap65.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj70 = null;
        boolean b71 = defaultedMap65.equals(obj70);
        java.lang.Object obj73 = defaultedMap65.get((java.lang.Object) (-1.0f));
        java.lang.String str74 = defaultedMap65.toString();
        defaultedMap65.clear();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap65);
        java.lang.String str77 = defaultedMap65.toString();
        java.lang.Object obj78 = defaultedMap27.remove((java.lang.Object) defaultedMap65);
        defaultedMap8.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100L + "'", obj73.equals(100L));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.isEmpty();
        int i16 = defaultedMap10.size();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator22);
        boolean b25 = defaultedMap1.equals((java.lang.Object) map24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 1L);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) (-1.0f));
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        defaultedMap10.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) predicate16);
        boolean b18 = defaultedMap3.equals((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator36 = filterIterator33.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator46 = filterIterator43.getIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator43);
        filterIterator33.setIterator((java.util.Iterator) filterIterator43);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) filterIterator43);
        collections.Predicate predicate50 = filterIterator43.getPredicate();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertNull(predicate50);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        java.util.Set set25 = defaultedMap10.keySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) set25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        int i43 = defaultedMap40.size();
        defaultedMap40.clear();
        boolean b45 = defaultedMap40.isEmpty();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        java.lang.Object obj53 = defaultedMap40.remove((java.lang.Object) filterIterator50);
        collections.Predicate predicate54 = filterIterator50.getPredicate();
        boolean b55 = defaultedMap1.equals((java.lang.Object) predicate54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        defaultedMap1.clear();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 100.0f);
        int i14 = defaultedMap11.size();
        defaultedMap11.clear();
        boolean b16 = defaultedMap11.isEmpty();
        int i17 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate38, predicate40);
        boolean b42 = defaultedMap11.containsKey((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        int i47 = defaultedMap44.size();
        defaultedMap44.clear();
        boolean b49 = defaultedMap44.isEmpty();
        int i50 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) (-1.0f));
        java.lang.String str57 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 100.0f);
        int i62 = defaultedMap59.size();
        defaultedMap59.clear();
        defaultedMap59.clear();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        boolean b66 = defaultedMap59.containsValue((java.lang.Object) predicate65);
        boolean b67 = defaultedMap52.equals((java.lang.Object) predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate71, predicate73);
        boolean b75 = defaultedMap44.containsKey((java.lang.Object) predicate71);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        filterIterator76.setIterator((java.util.Iterator) filterIterator77);
        boolean b79 = defaultedMap44.containsKey((java.lang.Object) filterIterator77);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) predicate38, (java.lang.Object) defaultedMap44);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        filterIterator81.setIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        java.util.Iterator iterator88 = filterIterator87.getIterator();
        java.lang.Object obj89 = defaultedMap1.get((java.lang.Object) iterator88);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 100L + "'", obj89.equals(100L));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        boolean b54 = defaultedMap18.equals((java.lang.Object) filterIterator52);
        java.util.Set set55 = defaultedMap18.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator16 = filterIterator11.getIterator();
        collections.Predicate predicate17 = filterIterator11.getPredicate();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        java.util.Collection collection12 = defaultedMap9.values();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator13);
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        int i21 = defaultedMap18.size();
        defaultedMap18.clear();
        boolean b23 = defaultedMap18.isEmpty();
        int i24 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) (-1.0f));
        java.lang.String str31 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        int i36 = defaultedMap33.size();
        defaultedMap33.clear();
        defaultedMap33.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) predicate39);
        boolean b41 = defaultedMap26.equals((java.lang.Object) predicate39);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate45, predicate47);
        boolean b49 = defaultedMap18.containsKey((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) (-1.0f));
        java.lang.String str56 = defaultedMap51.toString();
        java.lang.String str57 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) (-1.0f));
        java.lang.String str64 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 100.0f);
        int i69 = defaultedMap66.size();
        defaultedMap66.clear();
        defaultedMap66.clear();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        boolean b73 = defaultedMap66.containsValue((java.lang.Object) predicate72);
        boolean b74 = defaultedMap59.equals((java.lang.Object) predicate72);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        filterIterator75.setIterator((java.util.Iterator) filterIterator76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate78, predicate80);
        boolean b82 = defaultedMap51.containsValue((java.lang.Object) defaultedMap59);
        java.lang.String str83 = defaultedMap51.toString();
        java.lang.Object obj84 = defaultedMap18.get((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 100L + "'", obj84.equals(100L));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        boolean b18 = defaultedMap1.isEmpty();
        java.util.Collection collection19 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) (-1.0f));
        java.lang.String str26 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 100.0f);
        int i31 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        boolean b36 = defaultedMap21.equals((java.lang.Object) predicate34);
        java.util.Set set37 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap39.equals(obj44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) (-1.0f));
        java.lang.String str48 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap39);
        java.lang.String str51 = defaultedMap39.toString();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) defaultedMap39);
        collections.Factory factory53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, factory53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        int i10 = defaultedMap7.size();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate19);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0f);
        int i26 = defaultedMap23.size();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = defaultedMap30.get((java.lang.Object) '4');
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        java.util.Set set38 = defaultedMap23.keySet();
        java.lang.Object obj40 = defaultedMap23.get((java.lang.Object) 1.0f);
        java.lang.Object obj41 = defaultedMap7.put((java.lang.Object) filterIterator14, (java.lang.Object) defaultedMap23);
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap7.containsValue((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj54 = defaultedMap50.remove((java.lang.Object) (-1.0f));
        java.lang.String str55 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b59 = defaultedMap57.containsValue((java.lang.Object) 100.0f);
        int i60 = defaultedMap57.size();
        defaultedMap57.clear();
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap57.containsValue((java.lang.Object) predicate63);
        boolean b65 = defaultedMap50.equals((java.lang.Object) predicate63);
        java.util.Set set66 = defaultedMap50.entrySet();
        java.lang.Object obj67 = defaultedMap44.get((java.lang.Object) set66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100L + "'", obj36.equals(100L));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100L + "'", obj40.equals(100L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100L + "'", obj67.equals(100L));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate58);
        filterIterator53.setIterator((java.util.Iterator) filterIterator55);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) (-1.0f));
        java.lang.String str68 = defaultedMap63.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) 100.0f);
        int i73 = defaultedMap70.size();
        defaultedMap70.clear();
        defaultedMap70.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        boolean b77 = defaultedMap70.containsValue((java.lang.Object) predicate76);
        boolean b78 = defaultedMap63.equals((java.lang.Object) predicate76);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate76, predicate79);
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = defaultedMap45.remove(obj81);
        boolean b83 = defaultedMap1.equals(obj82);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100L + "'", obj51.equals(100L));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator36 = filterIterator33.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator33);
        filterIterator27.setIterator((java.util.Iterator) filterIterator33);
        java.lang.Object obj39 = defaultedMap26.get((java.lang.Object) filterIterator27);
        boolean b40 = defaultedMap17.equals(obj39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100L + "'", obj39.equals(100L));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) '4');
        defaultedMap7.clear();
        java.util.Collection collection15 = defaultedMap7.values();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) (-1.0f));
        java.lang.String str8 = defaultedMap3.toString();
        java.util.Set set9 = defaultedMap3.keySet();
        boolean b10 = defaultedMap3.isEmpty();
        java.util.Set set11 = defaultedMap3.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) (-1.0f));
        java.lang.String str19 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 100.0f);
        int i24 = defaultedMap21.size();
        defaultedMap21.clear();
        defaultedMap21.clear();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) predicate27);
        boolean b29 = defaultedMap14.equals((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap31.equals(obj36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) (-1.0f));
        java.lang.String str40 = defaultedMap31.toString();
        defaultedMap31.clear();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        java.lang.Object obj49 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) filterIterator46);
        java.util.Iterator iterator50 = filterIterator46.getIterator();
        boolean b51 = defaultedMap1.containsValue((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate55);
        filterIterator46.setIterator((java.util.Iterator) filterIterator56);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100L + "'", obj39.equals(100L));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate55);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = filterIterator13.getIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator23);
        filterIterator13.setIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) 100.0f);
        int i33 = defaultedMap30.size();
        defaultedMap30.clear();
        defaultedMap30.clear();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate36);
        boolean b39 = defaultedMap1.equals((java.lang.Object) predicate36);
        int i40 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 100.0f);
        int i45 = defaultedMap42.size();
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate54);
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 100.0f);
        int i61 = defaultedMap58.size();
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b67 = defaultedMap65.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) '4');
        defaultedMap58.putAll((java.util.Map) defaultedMap65);
        java.util.Set set73 = defaultedMap58.keySet();
        java.lang.Object obj75 = defaultedMap58.get((java.lang.Object) 1.0f);
        java.lang.Object obj76 = defaultedMap42.put((java.lang.Object) filterIterator49, (java.lang.Object) defaultedMap58);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        filterIterator77.setIterator((java.util.Iterator) filterIterator78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        filterIterator82.setIterator((java.util.Iterator) filterIterator83);
        java.util.Iterator iterator85 = filterIterator82.getIterator();
        filterIterator77.setIterator((java.util.Iterator) filterIterator82);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        filterIterator87.setIterator((java.util.Iterator) filterIterator88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        filterIterator87.setPredicate(predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator();
        filterIterator92.setIterator((java.util.Iterator) filterIterator93);
        java.util.Iterator iterator95 = filterIterator92.getIterator();
        filterIterator87.setIterator((java.util.Iterator) filterIterator92);
        filterIterator82.setIterator((java.util.Iterator) filterIterator92);
        boolean b98 = defaultedMap58.equals((java.lang.Object) filterIterator92);
        boolean b99 = defaultedMap1.containsKey((java.lang.Object) filterIterator92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100L + "'", obj63.equals(100L));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100L + "'", obj71.equals(100L));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100L + "'", obj75.equals(100L));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(iterator85);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set16 = defaultedMap1.keySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        int i25 = defaultedMap22.size();
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate34);
        filterIterator29.setIterator((java.util.Iterator) filterIterator31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        int i41 = defaultedMap38.size();
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap45);
        java.util.Set set53 = defaultedMap38.keySet();
        java.lang.Object obj55 = defaultedMap38.get((java.lang.Object) 1.0f);
        java.lang.Object obj56 = defaultedMap22.put((java.lang.Object) filterIterator29, (java.lang.Object) defaultedMap38);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        filterIterator57.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        filterIterator62.setIterator((java.util.Iterator) filterIterator63);
        java.util.Iterator iterator65 = filterIterator62.getIterator();
        filterIterator57.setIterator((java.util.Iterator) filterIterator62);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        filterIterator67.setIterator((java.util.Iterator) filterIterator68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        java.util.Iterator iterator75 = filterIterator72.getIterator();
        filterIterator67.setIterator((java.util.Iterator) filterIterator72);
        filterIterator62.setIterator((java.util.Iterator) filterIterator72);
        java.util.Iterator iterator78 = filterIterator72.getIterator();
        java.lang.Object obj79 = defaultedMap22.remove((java.lang.Object) iterator78);
        java.lang.Object obj80 = defaultedMap1.get(obj79);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100L + "'", obj51.equals(100L));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100L + "'", obj55.equals(100L));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100L + "'", obj80.equals(100L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate14);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        int i10 = defaultedMap7.size();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate19);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0f);
        int i26 = defaultedMap23.size();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = defaultedMap30.get((java.lang.Object) '4');
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        java.util.Set set38 = defaultedMap23.keySet();
        java.lang.Object obj40 = defaultedMap23.get((java.lang.Object) 1.0f);
        java.lang.Object obj41 = defaultedMap7.put((java.lang.Object) filterIterator14, (java.lang.Object) defaultedMap23);
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap7.containsValue((java.lang.Object) defaultedMap44);
        int i49 = defaultedMap44.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100L + "'", obj36.equals(100L));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100L + "'", obj40.equals(100L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) '4');
        defaultedMap7.clear();
        java.util.Collection collection15 = defaultedMap7.values();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.String str23 = defaultedMap18.toString();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 100.0f);
        int i40 = defaultedMap37.size();
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate49);
        filterIterator44.setIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 100.0f);
        int i56 = defaultedMap53.size();
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = defaultedMap60.get((java.lang.Object) '4');
        defaultedMap53.putAll((java.util.Map) defaultedMap60);
        java.util.Set set68 = defaultedMap53.keySet();
        java.lang.Object obj70 = defaultedMap53.get((java.lang.Object) 1.0f);
        java.lang.Object obj71 = defaultedMap37.put((java.lang.Object) filterIterator44, (java.lang.Object) defaultedMap53);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        filterIterator76.setPredicate(predicate77);
        java.lang.Object obj79 = defaultedMap33.put((java.lang.Object) defaultedMap53, (java.lang.Object) predicate77);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        int i82 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100L + "'", obj58.equals(100L));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100L + "'", obj66.equals(100L));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100L + "'", obj70.equals(100L));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0f));
        java.lang.String str45 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        int i50 = defaultedMap47.size();
        defaultedMap47.clear();
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        boolean b54 = defaultedMap47.containsValue((java.lang.Object) predicate53);
        boolean b55 = defaultedMap40.equals((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b59 = defaultedMap57.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap57.equals(obj62);
        java.lang.Object obj65 = defaultedMap57.get((java.lang.Object) (-1.0f));
        java.lang.String str66 = defaultedMap57.toString();
        defaultedMap57.clear();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        java.lang.Object obj75 = defaultedMap40.put((java.lang.Object) defaultedMap57, (java.lang.Object) filterIterator72);
        int i76 = defaultedMap57.size();
        boolean b77 = defaultedMap1.equals((java.lang.Object) defaultedMap57);
        java.util.Set set78 = defaultedMap57.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100L + "'", obj65.equals(100L));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate35);
        filterIterator30.setIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 100.0f);
        int i45 = defaultedMap42.size();
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate54);
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 100.0f);
        int i61 = defaultedMap58.size();
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b67 = defaultedMap65.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) '4');
        defaultedMap58.putAll((java.util.Map) defaultedMap65);
        java.util.Set set73 = defaultedMap58.keySet();
        java.lang.Object obj75 = defaultedMap58.get((java.lang.Object) 1.0f);
        java.lang.Object obj76 = defaultedMap42.put((java.lang.Object) filterIterator49, (java.lang.Object) defaultedMap58);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        filterIterator77.setIterator((java.util.Iterator) filterIterator78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        java.lang.Object obj84 = defaultedMap38.put((java.lang.Object) defaultedMap58, (java.lang.Object) predicate82);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate28, predicate82);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100L + "'", obj63.equals(100L));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100L + "'", obj71.equals(100L));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100L + "'", obj75.equals(100L));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.isEmpty();
        int i16 = defaultedMap10.size();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator22);
        boolean b25 = defaultedMap1.equals((java.lang.Object) map24);
        int i26 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate10);
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate29);
        filterIterator24.setIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        int i36 = defaultedMap33.size();
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj46 = defaultedMap40.get((java.lang.Object) '4');
        defaultedMap33.putAll((java.util.Map) defaultedMap40);
        java.util.Set set48 = defaultedMap33.keySet();
        java.lang.Object obj50 = defaultedMap33.get((java.lang.Object) 1.0f);
        java.lang.Object obj51 = defaultedMap17.put((java.lang.Object) filterIterator24, (java.lang.Object) defaultedMap33);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj59 = defaultedMap13.put((java.lang.Object) defaultedMap33, (java.lang.Object) predicate57);
        java.lang.Object obj61 = defaultedMap33.get((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100L + "'", obj50.equals(100L));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100L + "'", obj61.equals(100L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator2);
        java.util.Set set15 = defaultedMap1.keySet();
        java.util.Set set16 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set16);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap19.equals(obj24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) (-1.0f));
        java.lang.String str28 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate37);
        filterIterator32.setIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) filterIterator32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0f));
        java.lang.String str45 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        int i50 = defaultedMap47.size();
        defaultedMap47.clear();
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        boolean b54 = defaultedMap47.containsValue((java.lang.Object) predicate53);
        boolean b55 = defaultedMap40.equals((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b59 = defaultedMap57.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap57.equals(obj62);
        java.lang.Object obj65 = defaultedMap57.get((java.lang.Object) (-1.0f));
        java.lang.String str66 = defaultedMap57.toString();
        defaultedMap57.clear();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        java.lang.Object obj75 = defaultedMap40.put((java.lang.Object) defaultedMap57, (java.lang.Object) filterIterator72);
        int i76 = defaultedMap57.size();
        boolean b77 = defaultedMap1.equals((java.lang.Object) defaultedMap57);
        java.lang.String str78 = defaultedMap57.toString();
        java.lang.String str79 = defaultedMap57.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100L + "'", obj65.equals(100L));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) (short) 1);
        java.util.Set set14 = defaultedMap8.entrySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        java.lang.String str22 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 100.0f);
        int i27 = defaultedMap24.size();
        defaultedMap24.clear();
        defaultedMap24.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap24.containsValue((java.lang.Object) predicate30);
        boolean b32 = defaultedMap17.equals((java.lang.Object) predicate30);
        java.util.Set set33 = defaultedMap17.entrySet();
        java.lang.Object obj35 = defaultedMap17.remove((java.lang.Object) (-1L));
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.lang.String str43 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        int i48 = defaultedMap45.size();
        defaultedMap45.clear();
        defaultedMap45.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) predicate51);
        boolean b53 = defaultedMap38.equals((java.lang.Object) predicate51);
        java.util.Set set54 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b58 = defaultedMap56.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj60 = defaultedMap56.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap56.equals(obj61);
        java.lang.Object obj64 = defaultedMap56.get((java.lang.Object) (-1.0f));
        java.lang.String str65 = defaultedMap56.toString();
        defaultedMap56.clear();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap56);
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) defaultedMap56);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100L + "'", obj64.equals(100L));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator41 = filterIterator38.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator51 = filterIterator48.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator48);
        filterIterator38.setIterator((java.util.Iterator) filterIterator48);
        java.lang.Object obj54 = defaultedMap9.get((java.lang.Object) filterIterator48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator9.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator23.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate58);
        filterIterator53.setIterator((java.util.Iterator) filterIterator55);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) (-1.0f));
        java.lang.String str68 = defaultedMap63.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) 100.0f);
        int i73 = defaultedMap70.size();
        defaultedMap70.clear();
        defaultedMap70.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        boolean b77 = defaultedMap70.containsValue((java.lang.Object) predicate76);
        boolean b78 = defaultedMap63.equals((java.lang.Object) predicate76);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate76, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate79);
        filterIterator9.setIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj83 = defaultedMap1.get((java.lang.Object) filterIterator9);
        int i84 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100L + "'", obj51.equals(100L));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 100L + "'", obj83.equals(100L));
        org.junit.Assert.assertTrue(i84 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator9.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator23.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate58);
        filterIterator53.setIterator((java.util.Iterator) filterIterator55);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) (-1.0f));
        java.lang.String str68 = defaultedMap63.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) 100.0f);
        int i73 = defaultedMap70.size();
        defaultedMap70.clear();
        defaultedMap70.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        boolean b77 = defaultedMap70.containsValue((java.lang.Object) predicate76);
        boolean b78 = defaultedMap63.equals((java.lang.Object) predicate76);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate76, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate79);
        filterIterator9.setIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj83 = defaultedMap1.get((java.lang.Object) filterIterator9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100L + "'", obj51.equals(100L));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 100L + "'", obj83.equals(100L));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) '4');
        defaultedMap7.clear();
        java.util.Collection collection15 = defaultedMap7.values();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.String str23 = defaultedMap18.toString();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 100.0f);
        int i40 = defaultedMap37.size();
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate49);
        filterIterator44.setIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 100.0f);
        int i56 = defaultedMap53.size();
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = defaultedMap60.get((java.lang.Object) '4');
        defaultedMap53.putAll((java.util.Map) defaultedMap60);
        java.util.Set set68 = defaultedMap53.keySet();
        java.lang.Object obj70 = defaultedMap53.get((java.lang.Object) 1.0f);
        java.lang.Object obj71 = defaultedMap37.put((java.lang.Object) filterIterator44, (java.lang.Object) defaultedMap53);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        filterIterator76.setPredicate(predicate77);
        java.lang.Object obj79 = defaultedMap33.put((java.lang.Object) defaultedMap53, (java.lang.Object) predicate77);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.util.Set set82 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100L + "'", obj58.equals(100L));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100L + "'", obj66.equals(100L));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100L + "'", obj70.equals(100L));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.String str34 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        boolean b54 = defaultedMap18.equals((java.lang.Object) filterIterator52);
        try {
            filterIterator52.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) iterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        int i18 = defaultedMap15.size();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        int i25 = defaultedMap22.size();
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.util.Set set28 = defaultedMap22.entrySet();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) set28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        boolean b31 = defaultedMap15.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        int i44 = defaultedMap1.size();
        java.util.Set set45 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = filterIterator5.getIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator15.getIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        filterIterator5.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate21 = filterIterator15.getPredicate();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(predicate21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) (-1.0f));
        java.lang.String str16 = defaultedMap11.toString();
        int i17 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        int i19 = defaultedMap11.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator13);
        java.util.Set set16 = defaultedMap1.keySet();
        java.util.Set set17 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate46);
        java.util.Collection collection49 = defaultedMap18.values();
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) predicate20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator39 = filterIterator36.getIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        java.util.Iterator iterator49 = filterIterator46.getIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator46);
        filterIterator36.setIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 100.0f);
        int i56 = defaultedMap53.size();
        defaultedMap53.clear();
        defaultedMap53.clear();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        boolean b60 = defaultedMap53.containsValue((java.lang.Object) predicate59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 100.0f);
        int i66 = defaultedMap63.size();
        defaultedMap63.clear();
        boolean b68 = defaultedMap63.isEmpty();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        filterIterator69.setIterator((java.util.Iterator) filterIterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        java.lang.Object obj76 = defaultedMap63.remove((java.lang.Object) filterIterator73);
        filterIterator61.setIterator((java.util.Iterator) filterIterator73);
        filterIterator28.setIterator((java.util.Iterator) filterIterator73);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        filterIterator79.setIterator((java.util.Iterator) filterIterator80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        filterIterator82.setIterator((java.util.Iterator) filterIterator83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        filterIterator82.setPredicate(predicate85);
        filterIterator80.setIterator((java.util.Iterator) filterIterator82);
        filterIterator73.setIterator((java.util.Iterator) filterIterator80);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate85);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate24);
        filterIterator19.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 100.0f);
        int i34 = defaultedMap31.size();
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate43);
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        int i50 = defaultedMap47.size();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = defaultedMap54.get((java.lang.Object) '4');
        defaultedMap47.putAll((java.util.Map) defaultedMap54);
        java.util.Set set62 = defaultedMap47.keySet();
        java.lang.Object obj64 = defaultedMap47.get((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap31.put((java.lang.Object) filterIterator38, (java.lang.Object) defaultedMap47);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        filterIterator66.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        java.lang.Object obj73 = defaultedMap27.put((java.lang.Object) defaultedMap47, (java.lang.Object) predicate71);
        boolean b74 = defaultedMap1.containsKey((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b78 = defaultedMap76.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj80 = defaultedMap76.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj82 = defaultedMap76.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator();
        filterIterator83.setIterator((java.util.Iterator) filterIterator84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        filterIterator86.setIterator((java.util.Iterator) filterIterator87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        filterIterator86.setPredicate(predicate89);
        filterIterator84.setIterator((java.util.Iterator) filterIterator86);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) filterIterator84);
        java.lang.Object obj93 = defaultedMap1.remove((java.lang.Object) defaultedMap76);
        java.lang.String str94 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100L + "'", obj36.equals(100L));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100L + "'", obj52.equals(100L));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100L + "'", obj60.equals(100L));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100L + "'", obj64.equals(100L));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100L + "'", obj82.equals(100L));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "{}" + "'", str94.equals("{}"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) '4');
        defaultedMap22.clear();
        java.util.Collection collection30 = defaultedMap22.values();
        boolean b31 = defaultedMap16.containsKey((java.lang.Object) defaultedMap22);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) b31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) (-1.0f));
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.keySet();
        boolean b43 = defaultedMap36.isEmpty();
        java.util.Set set44 = defaultedMap36.keySet();
        boolean b45 = defaultedMap34.containsKey((java.lang.Object) set44);
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        int i47 = defaultedMap34.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap19.equals(obj24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) (-1.0f));
        java.lang.String str28 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        boolean b31 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        java.util.Iterator iterator35 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate37 = filterIterator32.getPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate38);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) predicate38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        int i48 = defaultedMap45.size();
        java.util.Set set49 = defaultedMap45.keySet();
        java.lang.Object obj50 = defaultedMap20.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap20.equals(obj51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100L + "'", obj50.equals(100L));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap19.equals(obj24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) (-1.0f));
        java.lang.String str28 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        boolean b31 = defaultedMap1.isEmpty();
        java.util.Set set32 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 100.0f);
        int i15 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        boolean b22 = defaultedMap12.containsKey(obj21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        boolean b29 = defaultedMap12.containsValue((java.lang.Object) filterIterator28);
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) filterIterator28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) (-1.0f));
        java.lang.String str38 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        int i43 = defaultedMap40.size();
        defaultedMap40.clear();
        defaultedMap40.clear();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap40.containsValue((java.lang.Object) predicate46);
        boolean b48 = defaultedMap33.equals((java.lang.Object) predicate46);
        java.util.Set set49 = defaultedMap33.entrySet();
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        java.lang.Object obj53 = defaultedMap33.get((java.lang.Object) iterator50);
        boolean b54 = defaultedMap1.containsValue((java.lang.Object) iterator50);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100L + "'", obj53.equals(100L));
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0f));
        java.lang.String str45 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        int i50 = defaultedMap47.size();
        defaultedMap47.clear();
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        boolean b54 = defaultedMap47.containsValue((java.lang.Object) predicate53);
        boolean b55 = defaultedMap40.equals((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b59 = defaultedMap57.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap57.equals(obj62);
        java.lang.Object obj65 = defaultedMap57.get((java.lang.Object) (-1.0f));
        java.lang.String str66 = defaultedMap57.toString();
        defaultedMap57.clear();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        java.lang.Object obj75 = defaultedMap40.put((java.lang.Object) defaultedMap57, (java.lang.Object) filterIterator72);
        int i76 = defaultedMap57.size();
        boolean b77 = defaultedMap1.equals((java.lang.Object) defaultedMap57);
        int i78 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b82 = defaultedMap80.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj84 = defaultedMap80.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj86 = defaultedMap80.get((java.lang.Object) '4');
        boolean b87 = defaultedMap80.isEmpty();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b91 = defaultedMap89.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj93 = defaultedMap89.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj95 = defaultedMap89.get((java.lang.Object) '4');
        defaultedMap89.clear();
        java.lang.Object obj97 = defaultedMap80.remove((java.lang.Object) defaultedMap89);
        defaultedMap57.putAll((java.util.Map) defaultedMap89);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100L + "'", obj65.equals(100L));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 100L + "'", obj86.equals(100L));
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + 100L + "'", obj95.equals(100L));
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) predicate20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate20);
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap7.equals(obj12);
        java.lang.Object obj15 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Set set16 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 0);
        java.util.Set set27 = defaultedMap18.entrySet();
        java.lang.Object obj28 = defaultedMap7.get((java.lang.Object) set27);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 100.0f);
        int i34 = defaultedMap31.size();
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate43);
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 100.0f);
        int i50 = defaultedMap47.size();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = defaultedMap54.get((java.lang.Object) '4');
        defaultedMap47.putAll((java.util.Map) defaultedMap54);
        java.util.Set set62 = defaultedMap47.keySet();
        java.lang.Object obj64 = defaultedMap47.get((java.lang.Object) 1.0f);
        java.lang.Object obj65 = defaultedMap31.put((java.lang.Object) filterIterator38, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b69 = defaultedMap67.containsValue((java.lang.Object) 100.0f);
        java.util.Set set70 = defaultedMap67.entrySet();
        boolean b71 = defaultedMap47.containsKey((java.lang.Object) set70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b75 = defaultedMap73.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) (-1.0f));
        java.lang.String str78 = defaultedMap73.toString();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b82 = defaultedMap80.containsValue((java.lang.Object) 100.0f);
        int i83 = defaultedMap80.size();
        defaultedMap80.clear();
        defaultedMap80.clear();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        boolean b87 = defaultedMap80.containsValue((java.lang.Object) predicate86);
        boolean b88 = defaultedMap73.equals((java.lang.Object) predicate86);
        boolean b89 = defaultedMap47.containsValue((java.lang.Object) defaultedMap73);
        java.lang.Object obj90 = defaultedMap1.remove((java.lang.Object) b89);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100L + "'", obj36.equals(100L));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100L + "'", obj52.equals(100L));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100L + "'", obj60.equals(100L));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100L + "'", obj64.equals(100L));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.isEmpty();
        int i16 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.String str23 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 100.0f);
        int i28 = defaultedMap25.size();
        defaultedMap25.clear();
        defaultedMap25.clear();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap18.equals((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate37, predicate39);
        boolean b41 = defaultedMap10.containsKey((java.lang.Object) predicate37);
        int i42 = defaultedMap10.size();
        java.util.Set set43 = defaultedMap10.keySet();
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) set43);
        defaultedMap1.clear();
        java.util.Set set46 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) '4');
        defaultedMap22.clear();
        java.util.Collection collection30 = defaultedMap22.values();
        boolean b31 = defaultedMap16.containsKey((java.lang.Object) defaultedMap22);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) b31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) (-1.0f));
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.keySet();
        boolean b43 = defaultedMap36.isEmpty();
        java.util.Set set44 = defaultedMap36.keySet();
        boolean b45 = defaultedMap34.containsKey((java.lang.Object) set44);
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.util.Set set47 = defaultedMap34.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set16 = defaultedMap1.keySet();
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 100.0f);
        int i15 = defaultedMap12.size();
        defaultedMap12.clear();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicateUtils17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) iterator23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        int i36 = defaultedMap33.size();
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) (short) 1);
        java.util.Set set39 = defaultedMap33.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) set39);
        boolean b41 = defaultedMap12.containsValue((java.lang.Object) defaultedMap26);
        java.util.Set set42 = defaultedMap12.keySet();
        java.util.Set set43 = defaultedMap12.keySet();
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) set43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        defaultedMap1.clear();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 100.0f);
        int i14 = defaultedMap11.size();
        defaultedMap11.clear();
        boolean b16 = defaultedMap11.isEmpty();
        int i17 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate38, predicate40);
        boolean b42 = defaultedMap11.containsKey((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        int i47 = defaultedMap44.size();
        defaultedMap44.clear();
        boolean b49 = defaultedMap44.isEmpty();
        int i50 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) (-1.0f));
        java.lang.String str57 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 100.0f);
        int i62 = defaultedMap59.size();
        defaultedMap59.clear();
        defaultedMap59.clear();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        boolean b66 = defaultedMap59.containsValue((java.lang.Object) predicate65);
        boolean b67 = defaultedMap52.equals((java.lang.Object) predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate71, predicate73);
        boolean b75 = defaultedMap44.containsKey((java.lang.Object) predicate71);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        filterIterator76.setIterator((java.util.Iterator) filterIterator77);
        boolean b79 = defaultedMap44.containsKey((java.lang.Object) filterIterator77);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) predicate38, (java.lang.Object) defaultedMap44);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        filterIterator81.setIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        filterIterator88.setIterator((java.util.Iterator) filterIterator89);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator88, predicate91);
        collections.Predicate predicate93 = filterIterator92.getPredicate();
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87, predicate93);
        boolean b95 = defaultedMap1.containsValue((java.lang.Object) predicate93);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (-1.0f));
        java.lang.String str15 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        defaultedMap17.clear();
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) predicate23);
        boolean b25 = defaultedMap10.equals((java.lang.Object) predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator0, predicate23);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        filterIterator36.setIterator((java.util.Iterator) filterIterator48);
        filterIterator34.setIterator((java.util.Iterator) filterIterator48);
        filterIterator27.setIterator((java.util.Iterator) filterIterator48);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate45);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) predicate44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) (-1.0f));
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        defaultedMap10.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) predicate16);
        boolean b18 = defaultedMap3.equals((java.lang.Object) predicate16);
        java.util.Set set19 = defaultedMap3.entrySet();
        boolean b20 = defaultedMap3.isEmpty();
        java.util.Collection collection21 = defaultedMap3.values();
        java.util.Collection collection22 = defaultedMap3.values();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) '4');
        defaultedMap38.clear();
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        java.util.Set set48 = defaultedMap38.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        try {
            boolean b37 = filterIterator33.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        java.util.Iterator iterator28 = filterIterator25.getIterator();
        java.lang.Object obj29 = defaultedMap8.get((java.lang.Object) filterIterator25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100L + "'", obj29.equals(100L));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) '4');
        defaultedMap7.clear();
        java.util.Collection collection15 = defaultedMap7.values();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 100.0f);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) predicate20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap24.equals(obj29);
        java.lang.Object obj32 = defaultedMap24.get((java.lang.Object) (-1.0f));
        java.lang.String str33 = defaultedMap24.toString();
        defaultedMap24.clear();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap7.put((java.lang.Object) defaultedMap24, (java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate48, predicate52);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        boolean b60 = defaultedMap24.equals((java.lang.Object) filterIterator58);
        java.lang.String str61 = defaultedMap24.toString();
        java.lang.Object obj62 = defaultedMap1.get((java.lang.Object) str61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100L + "'", obj32.equals(100L));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100L + "'", obj62.equals(100L));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        int i37 = defaultedMap18.size();
        boolean b38 = defaultedMap18.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator4.setPredicate(predicate14);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) (-1.0f));
        java.lang.String str20 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        int i25 = defaultedMap22.size();
        defaultedMap22.clear();
        defaultedMap22.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        boolean b29 = defaultedMap22.containsValue((java.lang.Object) predicate28);
        boolean b30 = defaultedMap15.equals((java.lang.Object) predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator31);
        boolean b33 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator2);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator16 = filterIterator2.getIterator();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        boolean b18 = defaultedMap1.isEmpty();
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 100.0f);
        int i24 = defaultedMap21.size();
        defaultedMap21.clear();
        boolean b26 = defaultedMap21.isEmpty();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = defaultedMap21.remove((java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.lang.String str43 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        int i48 = defaultedMap45.size();
        defaultedMap45.clear();
        defaultedMap45.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) predicate51);
        boolean b53 = defaultedMap38.equals((java.lang.Object) predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator54.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate57, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate59, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate61);
        boolean b64 = defaultedMap1.equals((java.lang.Object) filterIterator31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 100.0f);
        int i6 = defaultedMap3.size();
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 100.0f);
        int i16 = defaultedMap13.size();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) (short) 1);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate25);
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 100.0f);
        int i32 = defaultedMap29.size();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) '4');
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        java.util.Set set44 = defaultedMap29.keySet();
        java.lang.Object obj46 = defaultedMap29.get((java.lang.Object) 1.0f);
        java.lang.Object obj47 = defaultedMap13.put((java.lang.Object) filterIterator20, (java.lang.Object) defaultedMap29);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        java.lang.Object obj55 = defaultedMap9.put((java.lang.Object) defaultedMap29, (java.lang.Object) predicate53);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate56, predicate58);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (-1.0f));
        java.lang.String str15 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        defaultedMap17.clear();
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) predicate23);
        boolean b25 = defaultedMap10.equals((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 100.0f);
        int i40 = defaultedMap37.size();
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        int i47 = defaultedMap44.size();
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) (short) 1);
        java.util.Set set50 = defaultedMap44.entrySet();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) set50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) (-1.0f));
        java.lang.String str58 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 100.0f);
        int i63 = defaultedMap60.size();
        defaultedMap60.clear();
        defaultedMap60.clear();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        boolean b67 = defaultedMap60.containsValue((java.lang.Object) predicate66);
        boolean b68 = defaultedMap53.equals((java.lang.Object) predicate66);
        java.util.Set set69 = defaultedMap53.entrySet();
        java.lang.Object obj71 = defaultedMap53.remove((java.lang.Object) (-1L));
        java.lang.Object obj72 = defaultedMap37.remove((java.lang.Object) (-1L));
        boolean b73 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        int i74 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) predicate22);
        boolean b24 = defaultedMap9.equals((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate28, predicate30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.lang.String str33 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) 100.0f);
        int i38 = defaultedMap35.size();
        defaultedMap35.clear();
        boolean b40 = defaultedMap35.isEmpty();
        int i41 = defaultedMap35.size();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator47);
        java.util.Set set50 = defaultedMap35.entrySet();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) defaultedMap35);
        java.util.Collection collection52 = defaultedMap35.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100L + "'", obj51.equals(100L));
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) '4');
        defaultedMap38.clear();
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        java.lang.String str48 = defaultedMap38.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        defaultedMap18.clear();
        java.lang.String str38 = defaultedMap18.toString();
        java.util.Collection collection39 = defaultedMap18.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 100.0f);
        int i19 = defaultedMap16.size();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap22.equals(obj27);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 0);
        java.util.Set set31 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap33.equals(obj38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 0);
        java.util.Set set42 = defaultedMap33.entrySet();
        java.lang.Object obj43 = defaultedMap22.get((java.lang.Object) set42);
        boolean b44 = defaultedMap16.containsKey((java.lang.Object) defaultedMap22);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) b44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100L + "'", obj41.equals(100L));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        int i25 = defaultedMap8.size();
        java.util.Set set26 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 100.0f);
        int i31 = defaultedMap28.size();
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.isEmpty();
        java.util.Collection collection34 = defaultedMap28.values();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap18.equals(obj23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.String str27 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.lang.String str43 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        int i48 = defaultedMap45.size();
        defaultedMap45.clear();
        defaultedMap45.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) predicate51);
        boolean b53 = defaultedMap38.equals((java.lang.Object) predicate51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b57 = defaultedMap55.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = null;
        boolean b61 = defaultedMap55.equals(obj60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) (-1.0f));
        java.lang.String str64 = defaultedMap55.toString();
        defaultedMap55.clear();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        filterIterator66.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        java.lang.Object obj73 = defaultedMap38.put((java.lang.Object) defaultedMap55, (java.lang.Object) filterIterator70);
        java.util.Iterator iterator74 = filterIterator70.getIterator();
        filterIterator33.setIterator(iterator74);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100L + "'", obj63.equals(100L));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(iterator74);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0f);
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.isEmpty();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap10.remove((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate31);
        filterIterator26.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate38);
        boolean b40 = defaultedMap34.containsValue((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate38);
        filterIterator1.setPredicate(predicate38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        java.lang.String str49 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 100.0f);
        int i54 = defaultedMap51.size();
        defaultedMap51.clear();
        defaultedMap51.clear();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        boolean b58 = defaultedMap51.containsValue((java.lang.Object) predicate57);
        boolean b59 = defaultedMap44.equals((java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b63 = defaultedMap61.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = null;
        boolean b67 = defaultedMap61.equals(obj66);
        java.lang.Object obj69 = defaultedMap61.get((java.lang.Object) (-1.0f));
        java.lang.String str70 = defaultedMap61.toString();
        defaultedMap61.clear();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        filterIterator76.setPredicate(predicate77);
        java.lang.Object obj79 = defaultedMap44.put((java.lang.Object) defaultedMap61, (java.lang.Object) filterIterator76);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        filterIterator80.setIterator((java.util.Iterator) filterIterator81);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80, predicate83);
        collections.Predicate predicate85 = filterIterator84.getPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        filterIterator86.setIterator((java.util.Iterator) filterIterator87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate85, predicate89);
        filterIterator1.setPredicate(predicate89);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100L + "'", obj69.equals(100L));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 100.0f);
        int i15 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        boolean b22 = defaultedMap12.containsKey(obj21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        boolean b29 = defaultedMap12.containsValue((java.lang.Object) filterIterator28);
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator32.setPredicate(predicate42);
        filterIterator28.setPredicate(predicate42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0f));
        java.lang.String str10 = defaultedMap5.toString();
        java.util.Set set11 = defaultedMap5.keySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = filterIterator17.getIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        java.util.Iterator iterator30 = filterIterator27.getIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator27);
        filterIterator17.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 100.0f);
        int i37 = defaultedMap34.size();
        defaultedMap34.clear();
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = defaultedMap34.containsValue((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate40);
        boolean b43 = defaultedMap5.equals((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate40);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 100.0f);
        int i15 = defaultedMap12.size();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) '4');
        defaultedMap12.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 100.0f);
        int i31 = defaultedMap28.size();
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) (short) 1);
        java.util.Set set34 = defaultedMap28.entrySet();
        boolean b35 = defaultedMap19.containsKey((java.lang.Object) defaultedMap28);
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        java.util.Set set37 = defaultedMap1.keySet();
        java.util.Set set38 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100L + "'", obj33.equals(100L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0f);
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) predicate14);
        boolean b16 = defaultedMap1.equals((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.entrySet();
        boolean b18 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 100.0f);
        int i16 = defaultedMap13.size();
        defaultedMap13.clear();
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) (-1.0f));
        java.lang.String str26 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 100.0f);
        int i31 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) predicate34);
        boolean b36 = defaultedMap21.equals((java.lang.Object) predicate34);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate40, predicate42);
        boolean b44 = defaultedMap13.containsKey((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) (-1.0f));
        java.lang.String str51 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 100.0f);
        int i56 = defaultedMap53.size();
        defaultedMap53.clear();
        defaultedMap53.clear();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        boolean b60 = defaultedMap53.containsValue((java.lang.Object) predicate59);
        boolean b61 = defaultedMap46.equals((java.lang.Object) predicate59);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate40, predicate59);
        int i63 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(i63 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        filterIterator2.setIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.remove(obj37);
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap1.containsKey(obj39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate14);
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 100.0f);
        int i29 = defaultedMap26.size();
        defaultedMap26.clear();
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) predicate32);
        boolean b34 = defaultedMap19.equals((java.lang.Object) predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.util.Set set37 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.containsKey(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0f);
        int i30 = defaultedMap27.size();
        defaultedMap27.clear();
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) predicate33);
        boolean b35 = defaultedMap20.equals((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 100.0f);
        int i48 = defaultedMap45.size();
        java.util.Set set49 = defaultedMap45.keySet();
        java.lang.Object obj50 = defaultedMap20.get((java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj55 = defaultedMap52.get((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100L + "'", obj43.equals(100L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100L + "'", obj50.equals(100L));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(obj55);
    }
}

