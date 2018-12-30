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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) '4');
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str51 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap50.get((java.lang.Object) map59);
        java.lang.Object obj61 = defaultedMap32.remove((java.lang.Object) map59);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.clear();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100L);
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0L + "'", obj4.equals(0L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str8 = defaultedMap4.toString();
        java.util.Collection collection9 = defaultedMap4.values();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{hi!=#}" + "'", str8.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = defaultedMap8.get(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj23 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.Object obj30 = defaultedMap16.get((java.lang.Object) str29);
        defaultedMap16.clear();
        java.util.Set set32 = defaultedMap16.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap16);
        java.util.Map map34 = null;
        try {
            defaultedMap8.putAll(map34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{hi!=#}" + "'", str20.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{hi!=#}" + "'", str29.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str14 = defaultedMap10.toString();
        java.util.Collection collection15 = defaultedMap10.values();
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Collection collection29 = defaultedMap24.values();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap24);
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) (-1));
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{hi!=#}" + "'", str14.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{hi!=#}" + "'", str28.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str21 = defaultedMap17.toString();
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap24.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{hi!=#}" + "'", str21.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap16.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap16);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i9 = defaultedMap8.size();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i17 = defaultedMap16.size();
        boolean b18 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i26 = defaultedMap25.size();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap20.remove((java.lang.Object) (-1));
        collections.Predicate predicate34 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate34, predicate41);
        defaultedMap16.putAll(map43);
        boolean b45 = defaultedMap3.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj47 = defaultedMap16.get((java.lang.Object) 10.0f);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        boolean b50 = defaultedMap1.equals((java.lang.Object) predicate49);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b33 = defaultedMap22.containsValue((java.lang.Object) defaultedMap29);
        java.lang.String str34 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i40 = defaultedMap39.size();
        boolean b41 = defaultedMap39.isEmpty();
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str48 = defaultedMap44.toString();
        boolean b49 = defaultedMap44.isEmpty();
        boolean b50 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i53 = defaultedMap52.size();
        java.lang.Object obj54 = defaultedMap36.put((java.lang.Object) b50, (java.lang.Object) defaultedMap52);
        java.util.Collection collection55 = defaultedMap36.values();
        java.lang.Object obj56 = defaultedMap29.get((java.lang.Object) collection55);
        java.lang.Object obj57 = defaultedMap12.get((java.lang.Object) collection55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{hi!=#}" + "'", str26.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{hi!=#}" + "'", str34.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{hi!=#}" + "'", str48.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str8 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) (-1));
        java.lang.Object obj20 = defaultedMap5.get((java.lang.Object) '4');
        java.util.Set set21 = defaultedMap5.keySet();
        boolean b22 = defaultedMap1.equals((java.lang.Object) set21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj13 = defaultedMap7.put(obj11, (java.lang.Object) (-1L));
        java.util.Set set14 = defaultedMap7.entrySet();
        java.util.Set set15 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate24 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str53 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i56 = defaultedMap55.size();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap52.putAll((java.util.Map) defaultedMap55);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap50.remove((java.lang.Object) (-1));
        collections.Predicate predicate64 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate64, predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate64);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate42, predicate48);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate42);
        collections.Transformer transformer77 = null;
        try {
            java.util.Map map78 = collections.map.DefaultedMap.decorate(map76, transformer77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i51 = defaultedMap50.size();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap50);
        defaultedMap32.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i51 = defaultedMap50.size();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (short) 1);
        boolean b57 = defaultedMap14.containsKey((java.lang.Object) map56);
        java.util.Collection collection58 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i61 = defaultedMap60.size();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str67 = defaultedMap63.toString();
        java.util.Collection collection68 = defaultedMap63.values();
        java.lang.Object obj69 = defaultedMap60.remove((java.lang.Object) defaultedMap63);
        boolean b71 = defaultedMap63.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj72 = defaultedMap14.get((java.lang.Object) b71);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{hi!=#}" + "'", str67.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        java.lang.String str11 = defaultedMap3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) 10.0f);
        java.util.Set set46 = defaultedMap14.keySet();
        java.util.Set set47 = defaultedMap14.entrySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate41);
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str56 = defaultedMap55.toString();
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i60 = defaultedMap59.size();
        boolean b61 = defaultedMap59.isEmpty();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str68 = defaultedMap64.toString();
        java.lang.Object obj71 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str77 = defaultedMap73.toString();
        java.lang.Object obj78 = defaultedMap64.get((java.lang.Object) str77);
        defaultedMap59.putAll((java.util.Map) defaultedMap64);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj89 = defaultedMap86.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str90 = defaultedMap86.toString();
        java.util.Collection collection91 = defaultedMap86.values();
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) defaultedMap86);
        java.lang.Object obj93 = defaultedMap64.get((java.lang.Object) defaultedMap81);
        java.lang.Object obj94 = defaultedMap22.get((java.lang.Object) defaultedMap64);
        java.lang.Object obj95 = defaultedMap12.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{hi!=#}" + "'", str68.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{hi!=#}" + "'", str77.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0L + "'", obj78.equals(0L));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{hi!=#}" + "'", str90.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 0L + "'", obj93.equals(0L));
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 0L + "'", obj94.equals(0L));
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + 0L + "'", obj95.equals(0L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        java.lang.String str28 = defaultedMap7.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{hi!=#, 1=0.0}" + "'", str28.equals("{hi!=#, 1=0.0}"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) (-1));
        collections.Predicate predicate28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate35);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map12, predicate35, predicate38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) map12);
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str27 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i30 = defaultedMap29.size();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (short) 1);
        java.lang.String str36 = defaultedMap24.toString();
        boolean b37 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        boolean b38 = defaultedMap17.equals((java.lang.Object) defaultedMap21);
        defaultedMap17.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) (-1));
        defaultedMap9.clear();
        java.util.Collection collection24 = defaultedMap9.values();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj37 = defaultedMap9.put(obj25, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str44 = defaultedMap40.toString();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) str53);
        defaultedMap40.clear();
        java.lang.Object obj56 = defaultedMap9.put((java.lang.Object) "", (java.lang.Object) defaultedMap40);
        java.util.Set set57 = defaultedMap40.keySet();
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) set57);
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.util.Set set61 = defaultedMap60.keySet();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str66 = defaultedMap65.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i69 = defaultedMap68.size();
        boolean b70 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (short) 1);
        java.lang.String str75 = defaultedMap63.toString();
        boolean b76 = defaultedMap60.equals((java.lang.Object) defaultedMap63);
        defaultedMap1.putAll((java.util.Map) defaultedMap63);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{hi!=#}" + "'", str44.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b76 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map25, predicate48, predicate51);
        java.lang.Object obj53 = defaultedMap14.get((java.lang.Object) map25);
        boolean b54 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) b54);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsValue(obj4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i51 = defaultedMap50.size();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection54 = defaultedMap32.values();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str23 = defaultedMap19.toString();
        java.util.Collection collection24 = defaultedMap19.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        java.lang.Object obj52 = defaultedMap19.put((java.lang.Object) defaultedMap27, (java.lang.Object) predicateUtils51);
        boolean b53 = defaultedMap1.containsValue(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Collection collection60 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap62.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b66 = defaultedMap55.containsValue((java.lang.Object) defaultedMap62);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate67, predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap71.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate67, predicate76);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{hi!=#}" + "'", str23.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{hi!=#}" + "'", str59.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (short) 1);
        java.util.Set set29 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i37 = defaultedMap36.size();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str58 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i61 = defaultedMap60.size();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap57.putAll((java.util.Map) defaultedMap60);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) (short) 1);
        java.lang.Object obj68 = defaultedMap55.remove((java.lang.Object) (-1));
        collections.Predicate predicate69 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap71.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate69, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate69);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate47, predicate53);
        java.lang.Object obj81 = defaultedMap17.get((java.lang.Object) map80);
        java.lang.Object obj82 = defaultedMap1.remove((java.lang.Object) map80);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0L + "'", obj81.equals(0L));
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) 10.0f);
        java.util.Set set46 = defaultedMap14.keySet();
        java.lang.String str47 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str54 = defaultedMap50.toString();
        boolean b55 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str61 = defaultedMap57.toString();
        java.util.Collection collection62 = defaultedMap57.values();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) collection62);
        boolean b64 = defaultedMap50.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap50);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{hi!=#}" + "'", str54.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{hi!=#}" + "'", str61.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i12 = defaultedMap11.size();
        boolean b13 = defaultedMap11.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) (-1));
        collections.Predicate predicate20 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate20, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate20);
        java.lang.Object obj31 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i39 = defaultedMap38.size();
        boolean b40 = defaultedMap38.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.Object obj50 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str56 = defaultedMap52.toString();
        java.lang.Object obj57 = defaultedMap43.get((java.lang.Object) str56);
        defaultedMap38.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str69 = defaultedMap65.toString();
        java.util.Collection collection70 = defaultedMap65.values();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) defaultedMap65);
        java.lang.Object obj72 = defaultedMap43.get((java.lang.Object) defaultedMap60);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) defaultedMap43);
        java.lang.String str74 = defaultedMap43.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{hi!=#}" + "'", str47.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=#}" + "'", str56.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{hi!=#}" + "'", str69.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{hi!=#, 1=0.0}" + "'", str74.equals("{hi!=#, 1=0.0}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str8 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) (-1));
        defaultedMap5.clear();
        java.util.Collection collection20 = defaultedMap5.values();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i29 = defaultedMap28.size();
        boolean b30 = defaultedMap28.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj33 = defaultedMap5.put(obj21, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap36.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str49 = defaultedMap45.toString();
        java.lang.Object obj50 = defaultedMap36.get((java.lang.Object) str49);
        defaultedMap36.clear();
        java.lang.Object obj52 = defaultedMap5.put((java.lang.Object) "", (java.lang.Object) defaultedMap36);
        java.util.Set set53 = defaultedMap36.keySet();
        boolean b54 = defaultedMap1.containsValue((java.lang.Object) set53);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{hi!=#}" + "'", str40.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{hi!=#}" + "'", str49.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) (-1));
        collections.Predicate predicate28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate35);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) predicateUtils38);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj46 = defaultedMap6.get(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap6.putAll((java.util.Map) defaultedMap48);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = defaultedMap8.get(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj23 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.Object obj30 = defaultedMap16.get((java.lang.Object) str29);
        defaultedMap16.clear();
        java.util.Set set32 = defaultedMap16.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap16);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate(map33, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{hi!=#}" + "'", str20.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{hi!=#}" + "'", str29.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) (-1));
        collections.Predicate predicate28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate35);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) predicateUtils38);
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj46 = defaultedMap6.get(obj45);
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) (-1));
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate44, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map28, predicate51, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate51, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) map64);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection13);
        java.lang.String str15 = defaultedMap1.toString();
        java.util.Collection collection16 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{hi!=#}" + "'", str15.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) (-1));
        defaultedMap9.clear();
        java.util.Collection collection24 = defaultedMap9.values();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj37 = defaultedMap9.put(obj25, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str44 = defaultedMap40.toString();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) str53);
        defaultedMap40.clear();
        java.lang.Object obj56 = defaultedMap9.put((java.lang.Object) "", (java.lang.Object) defaultedMap40);
        java.util.Set set57 = defaultedMap40.keySet();
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) set57);
        int i59 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{hi!=#}" + "'", str44.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertTrue(i59 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) (-1));
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10);
        boolean b17 = defaultedMap1.isEmpty();
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) 10.0f);
        java.util.Set set46 = defaultedMap14.keySet();
        java.lang.String str47 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Collection collection60 = defaultedMap55.values();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) defaultedMap55);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1L);
        java.util.Set set64 = defaultedMap55.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str70 = defaultedMap66.toString();
        java.lang.Object obj73 = defaultedMap66.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str79 = defaultedMap75.toString();
        java.lang.Object obj80 = defaultedMap66.get((java.lang.Object) str79);
        defaultedMap66.clear();
        boolean b82 = defaultedMap55.equals((java.lang.Object) defaultedMap66);
        java.util.Set set83 = defaultedMap55.keySet();
        boolean b84 = defaultedMap48.equals((java.lang.Object) set83);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{hi!=#}" + "'", str59.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{hi!=#}" + "'", str70.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{hi!=#}" + "'", str79.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0L + "'", obj80.equals(0L));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap8.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) (-1));
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str8 = defaultedMap4.toString();
        java.util.Collection collection9 = defaultedMap4.values();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i37 = defaultedMap36.size();
        boolean b38 = defaultedMap36.isEmpty();
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap31.remove((java.lang.Object) (-1));
        collections.Predicate predicate45 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate45, predicate52);
        defaultedMap27.putAll(map54);
        boolean b56 = defaultedMap14.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj58 = defaultedMap27.get((java.lang.Object) 10.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        boolean b61 = defaultedMap12.equals((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate60, predicate67);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{hi!=#}" + "'", str8.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap17.remove((java.lang.Object) (-1));
        defaultedMap17.clear();
        java.lang.String str32 = defaultedMap17.toString();
        java.lang.String str33 = defaultedMap17.toString();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str33);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str19 = defaultedMap15.toString();
        java.util.Collection collection20 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap22);
        java.lang.String str27 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        java.util.Collection collection48 = defaultedMap29.values();
        java.lang.Object obj49 = defaultedMap22.get((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsValue(obj49);
        java.util.Set set51 = defaultedMap1.entrySet();
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str56 = defaultedMap55.toString();
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i60 = defaultedMap59.size();
        boolean b61 = defaultedMap59.isEmpty();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str68 = defaultedMap64.toString();
        java.lang.Object obj71 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str77 = defaultedMap73.toString();
        java.lang.Object obj78 = defaultedMap64.get((java.lang.Object) str77);
        defaultedMap59.putAll((java.util.Map) defaultedMap64);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj89 = defaultedMap86.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str90 = defaultedMap86.toString();
        java.util.Collection collection91 = defaultedMap86.values();
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) defaultedMap86);
        java.lang.Object obj93 = defaultedMap64.get((java.lang.Object) defaultedMap81);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap64);
        defaultedMap94.clear();
        java.lang.Object obj96 = defaultedMap1.remove((java.lang.Object) defaultedMap94);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{hi!=#}" + "'", str19.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{hi!=#}" + "'", str68.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{hi!=#}" + "'", str77.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0L + "'", obj78.equals(0L));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{hi!=#}" + "'", str90.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 0L + "'", obj93.equals(0L));
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap16.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap26.remove((java.lang.Object) (-1));
        collections.Predicate predicate40 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate40, predicate47);
        java.lang.Object obj50 = defaultedMap6.get((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str11 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i14 = defaultedMap13.size();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str22 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.isEmpty();
        boolean b24 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        java.lang.Object obj28 = defaultedMap10.put((java.lang.Object) b24, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str34 = defaultedMap30.toString();
        java.util.Collection collection35 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b41 = defaultedMap30.containsValue((java.lang.Object) defaultedMap37);
        defaultedMap26.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str47 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i50 = defaultedMap49.size();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (short) 1);
        java.util.Set set56 = defaultedMap44.entrySet();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str62 = defaultedMap61.toString();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i65 = defaultedMap64.size();
        boolean b66 = defaultedMap64.isEmpty();
        defaultedMap61.putAll((java.util.Map) defaultedMap64);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) (short) 1);
        java.lang.String str71 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate77, predicate78);
        java.lang.Object obj80 = defaultedMap59.remove((java.lang.Object) predicate77);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate57, predicate77);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj86 = defaultedMap83.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate57, predicate88);
        try {
            java.util.Map map91 = collections.map.PredicatedMap.decorate(map0, predicate7, predicate57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{hi!=#}" + "'", str22.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{hi!=#}" + "'", str34.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str18 = defaultedMap14.toString();
        boolean b19 = defaultedMap14.isEmpty();
        java.util.Set set20 = defaultedMap14.keySet();
        int i21 = defaultedMap14.size();
        defaultedMap14.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{hi!=#}" + "'", str18.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Collection collection18 = defaultedMap13.values();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) (-1));
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) 10);
        boolean b24 = defaultedMap8.isEmpty();
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) b24);
        boolean b26 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        java.lang.Object obj41 = defaultedMap12.get((java.lang.Object) defaultedMap29);
        boolean b42 = defaultedMap29.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) 1.0d, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        java.util.Set set28 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Collection collection28 = defaultedMap23.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = defaultedMap18.get((java.lang.Object) (-1));
        java.lang.Object obj33 = defaultedMap18.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str36 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i39 = defaultedMap38.size();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        boolean b42 = defaultedMap38.isEmpty();
        boolean b43 = defaultedMap18.containsKey((java.lang.Object) defaultedMap38);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) b43);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) str14);
        defaultedMap1.clear();
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str29 = defaultedMap25.toString();
        java.util.Collection collection30 = defaultedMap25.values();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i40 = defaultedMap39.size();
        boolean b41 = defaultedMap39.isEmpty();
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj44 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap36);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{hi!=#}" + "'", str14.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{hi!=#}" + "'", str29.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i21 = defaultedMap20.size();
        boolean b22 = defaultedMap20.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) 1.0d, (java.lang.Object) (byte) 10);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap20.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str11 = defaultedMap7.toString();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{hi!=#}" + "'", str11.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) (-1));
        collections.Predicate predicate28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate35);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) predicateUtils38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) str14);
        defaultedMap1.clear();
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.util.Set set21 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{hi!=#}" + "'", str14.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str27 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i30 = defaultedMap29.size();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (short) 1);
        java.lang.String str36 = defaultedMap24.toString();
        boolean b37 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        boolean b38 = defaultedMap17.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj39 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i47 = defaultedMap46.size();
        boolean b48 = defaultedMap46.isEmpty();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str55 = defaultedMap51.toString();
        java.util.Collection collection56 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b62 = defaultedMap51.containsValue((java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        java.lang.Object obj66 = defaultedMap21.put((java.lang.Object) defaultedMap42, (java.lang.Object) defaultedMap58);
        java.util.Collection collection67 = defaultedMap21.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{hi!=#}" + "'", str55.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str8 = defaultedMap4.toString();
        java.util.Collection collection9 = defaultedMap4.values();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap13.remove((java.lang.Object) (-1));
        collections.Predicate predicate27 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate27, predicate34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate34);
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{hi!=#}" + "'", str8.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str8 = defaultedMap4.toString();
        java.util.Collection collection9 = defaultedMap4.values();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        boolean b12 = defaultedMap4.equals((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str23 = defaultedMap19.toString();
        java.util.Collection collection24 = defaultedMap19.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        java.lang.Object obj52 = defaultedMap19.put((java.lang.Object) defaultedMap27, (java.lang.Object) predicateUtils51);
        boolean b53 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj62 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str63 = defaultedMap59.toString();
        java.util.Collection collection64 = defaultedMap59.values();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b70 = defaultedMap59.containsValue((java.lang.Object) defaultedMap66);
        java.lang.String str71 = defaultedMap66.toString();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) false);
        java.lang.Object obj74 = defaultedMap55.get((java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str79 = defaultedMap78.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i82 = defaultedMap81.size();
        boolean b83 = defaultedMap81.isEmpty();
        defaultedMap78.putAll((java.util.Map) defaultedMap81);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) (short) 1);
        java.lang.Object obj89 = defaultedMap76.remove((java.lang.Object) (-1));
        java.lang.Object obj90 = defaultedMap66.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj91 = defaultedMap27.get((java.lang.Object) defaultedMap76);
        boolean b92 = defaultedMap4.containsValue(obj91);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{hi!=#}" + "'", str8.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{hi!=#}" + "'", str23.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{hi!=#}" + "'", str63.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{hi!=#}" + "'", str71.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0L + "'", obj90.equals(0L));
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0L + "'", obj91.equals(0L));
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate24 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str53 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i56 = defaultedMap55.size();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap52.putAll((java.util.Map) defaultedMap55);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap50.remove((java.lang.Object) (-1));
        collections.Predicate predicate64 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate64, predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate64);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate42, predicate48);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate42);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj81 = defaultedMap78.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate82, predicate83);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) (byte) 10);
        java.lang.Object obj87 = defaultedMap23.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str90 = defaultedMap89.toString();
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj95 = defaultedMap92.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap89, (java.lang.Object) "hi!");
        boolean b97 = defaultedMap23.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.util.Collection collection54 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b60 = defaultedMap49.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj62 = defaultedMap12.get((java.lang.Object) defaultedMap56);
        java.lang.String str63 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str66 = defaultedMap65.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i69 = defaultedMap68.size();
        boolean b70 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str77 = defaultedMap73.toString();
        java.lang.Object obj80 = defaultedMap73.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj85 = defaultedMap82.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str86 = defaultedMap82.toString();
        java.lang.Object obj87 = defaultedMap73.get((java.lang.Object) str86);
        defaultedMap73.clear();
        java.lang.Object obj89 = defaultedMap68.get((java.lang.Object) defaultedMap73);
        java.lang.Object obj90 = defaultedMap12.get((java.lang.Object) defaultedMap73);
        java.lang.String str91 = defaultedMap12.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{hi!=#, 1=0.0}" + "'", str63.equals("{hi!=#, 1=0.0}"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{hi!=#}" + "'", str77.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{hi!=#}" + "'", str86.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0L + "'", obj87.equals(0L));
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0L + "'", obj89.equals(0L));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0L + "'", obj90.equals(0L));
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{hi!=#, 1=0.0}" + "'", str91.equals("{hi!=#, 1=0.0}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap22.entrySet();
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) set31);
        boolean b33 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str43 = defaultedMap39.toString();
        java.util.Collection collection44 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b50 = defaultedMap39.containsValue((java.lang.Object) defaultedMap46);
        java.lang.String str51 = defaultedMap46.toString();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) false);
        java.lang.Object obj54 = defaultedMap35.get((java.lang.Object) defaultedMap46);
        java.lang.Object obj55 = defaultedMap1.remove(obj54);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{hi!=#}" + "'", str26.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{hi!=#}" + "'", str43.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{hi!=#}" + "'", str51.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i21 = defaultedMap20.size();
        boolean b22 = defaultedMap20.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) 1.0d, (java.lang.Object) (byte) 10);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) (-1));
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10);
        int i17 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str18 = defaultedMap14.toString();
        java.util.Collection collection19 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.isEmpty();
        java.util.Set set27 = defaultedMap21.keySet();
        boolean b28 = defaultedMap14.containsKey((java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        boolean b30 = defaultedMap1.equals((java.lang.Object) defaultedMap21);
        java.lang.String str31 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{hi!=#}" + "'", str18.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj13 = defaultedMap7.put(obj11, (java.lang.Object) (-1L));
        java.util.Set set14 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str20 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.isEmpty();
        java.util.Set set22 = defaultedMap16.keySet();
        int i23 = defaultedMap16.size();
        java.util.Collection collection24 = defaultedMap16.values();
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{hi!=#}" + "'", str20.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str31 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i34 = defaultedMap33.size();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap28.remove((java.lang.Object) (-1));
        defaultedMap28.clear();
        java.util.Collection collection43 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        boolean b45 = defaultedMap19.equals((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str51 = defaultedMap47.toString();
        java.util.Collection collection52 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj62 = defaultedMap59.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str70 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i73 = defaultedMap72.size();
        boolean b74 = defaultedMap72.isEmpty();
        defaultedMap69.putAll((java.util.Map) defaultedMap72);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap67.remove((java.lang.Object) (-1));
        collections.Predicate predicate81 = null;
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj86 = defaultedMap83.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate81, predicate88);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map65, predicate88, predicate91);
        java.lang.Object obj93 = defaultedMap54.get((java.lang.Object) map65);
        defaultedMap54.clear();
        defaultedMap47.putAll((java.util.Map) defaultedMap54);
        java.util.Set set96 = defaultedMap54.keySet();
        java.lang.Object obj97 = defaultedMap44.get((java.lang.Object) set96);
        collections.Predicate predicate98 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj99 = defaultedMap9.put(obj97, (java.lang.Object) predicate98);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{hi!=#}" + "'", str51.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 0L + "'", obj93.equals(0L));
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertNotNull(predicate98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b28 = defaultedMap17.containsKey((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str39 = defaultedMap35.toString();
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap35);
        java.lang.Object obj43 = defaultedMap30.get((java.lang.Object) 0.0f);
        java.lang.Object obj44 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{hi!=#}" + "'", str39.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map25, predicate48, predicate51);
        java.lang.Object obj53 = defaultedMap14.get((java.lang.Object) map25);
        boolean b54 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str60 = defaultedMap56.toString();
        java.lang.Object obj63 = defaultedMap56.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str69 = defaultedMap65.toString();
        java.lang.Object obj70 = defaultedMap56.get((java.lang.Object) str69);
        defaultedMap56.clear();
        java.util.Set set72 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap56);
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap73);
        java.lang.String str75 = defaultedMap8.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{hi!=#}" + "'", str60.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{hi!=#}" + "'", str69.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0L + "'", obj70.equals(0L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{hi!=#}" + "'", str75.equals("{hi!=#}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str52 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap51.get((java.lang.Object) map60);
        boolean b62 = defaultedMap32.equals((java.lang.Object) map60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str68 = defaultedMap64.toString();
        boolean b69 = defaultedMap64.isEmpty();
        java.util.Set set70 = defaultedMap64.keySet();
        int i71 = defaultedMap64.size();
        java.util.Collection collection72 = defaultedMap64.values();
        java.util.Map map73 = collections.map.DefaultedMap.decorate(map60, (java.lang.Object) defaultedMap64);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0L + "'", obj61.equals(0L));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{hi!=#}" + "'", str68.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(i71 == 1);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i24 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str30 = defaultedMap26.toString();
        boolean b31 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.util.Set set39 = defaultedMap34.keySet();
        java.lang.Object obj40 = defaultedMap26.get((java.lang.Object) defaultedMap34);
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{hi!=#}" + "'", str30.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        int i8 = defaultedMap1.size();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Collection collection16 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str22 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.isEmpty();
        java.util.Set set24 = defaultedMap18.keySet();
        boolean b25 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Collection collection37 = defaultedMap32.values();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1L);
        java.util.Set set41 = defaultedMap32.entrySet();
        java.lang.Object obj42 = defaultedMap11.remove((java.lang.Object) set41);
        java.lang.Object obj43 = defaultedMap1.remove(obj42);
        java.lang.Object obj44 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str48 = defaultedMap47.toString();
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i52 = defaultedMap51.size();
        boolean b53 = defaultedMap51.isEmpty();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = null;
        java.lang.Object obj57 = defaultedMap51.put(obj55, (java.lang.Object) (-1L));
        java.util.Set set58 = defaultedMap51.entrySet();
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) set58);
        java.lang.String str60 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{hi!=#}" + "'", str15.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{hi!=#}" + "'", str22.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{hi!=#}" + "'", str60.equals("{hi!=#}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str7 = defaultedMap3.toString();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str14 = defaultedMap10.toString();
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.keySet();
        boolean b17 = defaultedMap3.containsKey((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) 1.0d, (java.lang.Object) (byte) 10);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) map29);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{hi!=#}" + "'", str7.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{hi!=#}" + "'", str14.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str27 = defaultedMap23.toString();
        boolean b28 = defaultedMap23.isEmpty();
        boolean b29 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) b29, (java.lang.Object) defaultedMap31);
        java.util.Collection collection34 = defaultedMap15.values();
        java.lang.Object obj35 = defaultedMap8.get((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i41 = defaultedMap40.size();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str49 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.isEmpty();
        boolean b51 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i54 = defaultedMap53.size();
        java.lang.Object obj55 = defaultedMap37.put((java.lang.Object) b51, (java.lang.Object) defaultedMap53);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Collection collection57 = defaultedMap53.values();
        defaultedMap53.clear();
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj61 = defaultedMap8.put((java.lang.Object) defaultedMap53, obj59);
        java.lang.String str62 = defaultedMap53.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{hi!=#}" + "'", str49.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        boolean b28 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = defaultedMap8.get(obj13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i22 = defaultedMap21.size();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (short) 1);
        java.lang.String str28 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) predicate34);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate34);
        java.lang.String str39 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str46 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i49 = defaultedMap48.size();
        boolean b50 = defaultedMap48.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str57 = defaultedMap53.toString();
        java.lang.Object obj60 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap62.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str66 = defaultedMap62.toString();
        java.lang.Object obj67 = defaultedMap53.get((java.lang.Object) str66);
        defaultedMap53.clear();
        java.lang.Object obj69 = defaultedMap48.get((java.lang.Object) defaultedMap53);
        boolean b70 = defaultedMap1.containsKey(obj69);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap1.containsValue(obj71);
        java.lang.Object obj73 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str77 = defaultedMap76.toString();
        java.lang.Object obj78 = defaultedMap74.get((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i81 = defaultedMap80.size();
        boolean b82 = defaultedMap80.isEmpty();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) defaultedMap80);
        defaultedMap1.putAll((java.util.Map) defaultedMap80);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{hi!=#}" + "'", str57.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{hi!=#}" + "'", str66.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0L + "'", obj69.equals(0L));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str8 = defaultedMap4.toString();
        boolean b9 = defaultedMap4.isEmpty();
        boolean b10 = defaultedMap4.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap4.containsKey((java.lang.Object) (byte) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        defaultedMap4.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{hi!=#}" + "'", str8.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        boolean b10 = defaultedMap1.isEmpty();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap16.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str30 = defaultedMap26.toString();
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        boolean b33 = defaultedMap16.equals((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{hi!=#}" + "'", str30.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{hi!=#}" + "'", str32.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str21 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str30 = defaultedMap26.toString();
        java.lang.Object obj31 = defaultedMap17.get((java.lang.Object) str30);
        defaultedMap17.clear();
        boolean b33 = defaultedMap6.equals((java.lang.Object) defaultedMap17);
        java.util.Set set34 = defaultedMap6.keySet();
        boolean b35 = defaultedMap6.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{hi!=#}" + "'", str21.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{hi!=#}" + "'", str30.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        java.lang.Object obj41 = defaultedMap12.get((java.lang.Object) defaultedMap29);
        java.util.Set set42 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) set42);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.util.Collection collection54 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b60 = defaultedMap49.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj62 = defaultedMap12.get((java.lang.Object) defaultedMap56);
        java.lang.String str63 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str66 = defaultedMap65.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i69 = defaultedMap68.size();
        boolean b70 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str77 = defaultedMap73.toString();
        java.lang.Object obj80 = defaultedMap73.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj85 = defaultedMap82.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str86 = defaultedMap82.toString();
        java.lang.Object obj87 = defaultedMap73.get((java.lang.Object) str86);
        defaultedMap73.clear();
        java.lang.Object obj89 = defaultedMap68.get((java.lang.Object) defaultedMap73);
        java.lang.Object obj90 = defaultedMap12.get((java.lang.Object) defaultedMap73);
        collections.Transformer transformer91 = null;
        try {
            java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{hi!=#, 1=0.0}" + "'", str63.equals("{hi!=#, 1=0.0}"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{hi!=#}" + "'", str77.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{hi!=#}" + "'", str86.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0L + "'", obj87.equals(0L));
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0L + "'", obj89.equals(0L));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0L + "'", obj90.equals(0L));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map25, predicate48, predicate51);
        java.lang.Object obj53 = defaultedMap14.get((java.lang.Object) map25);
        boolean b54 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i57 = defaultedMap56.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj62 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str63 = defaultedMap59.toString();
        java.util.Collection collection64 = defaultedMap59.values();
        java.lang.Object obj65 = defaultedMap56.remove((java.lang.Object) defaultedMap59);
        java.util.Set set66 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str71 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i74 = defaultedMap73.size();
        boolean b75 = defaultedMap73.isEmpty();
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) (short) 1);
        java.lang.Object obj81 = defaultedMap68.remove((java.lang.Object) (-1));
        collections.Predicate predicate82 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj87 = defaultedMap84.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate82, predicate89);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate89);
        java.lang.Object obj93 = defaultedMap14.remove((java.lang.Object) defaultedMap56);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{hi!=#}" + "'", str63.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str51 = defaultedMap47.toString();
        defaultedMap47.clear();
        java.lang.Object obj53 = defaultedMap14.get((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{hi!=#}" + "'", str51.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str14 = defaultedMap10.toString();
        java.util.Collection collection15 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) (-1));
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate44, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map28, predicate51, predicate54);
        java.lang.Object obj56 = defaultedMap17.get((java.lang.Object) map28);
        defaultedMap17.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) predicate8, (java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{hi!=#}" + "'", str14.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap12.remove((java.lang.Object) (-1));
        defaultedMap12.clear();
        java.util.Collection collection27 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b29 = defaultedMap3.equals((java.lang.Object) defaultedMap28);
        java.util.Set set30 = defaultedMap28.keySet();
        java.lang.Object obj31 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i39 = defaultedMap38.size();
        boolean b40 = defaultedMap38.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap38);
        java.lang.Object obj42 = null;
        java.lang.Object obj44 = defaultedMap38.put(obj42, (java.lang.Object) (-1L));
        java.util.Set set45 = defaultedMap38.entrySet();
        boolean b46 = defaultedMap28.containsValue((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str23 = defaultedMap19.toString();
        java.lang.Object obj26 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str32 = defaultedMap28.toString();
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) str32);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.util.Collection collection46 = defaultedMap41.values();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap41);
        java.lang.Object obj48 = defaultedMap19.get((java.lang.Object) defaultedMap36);
        boolean b49 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{hi!=#}" + "'", str23.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{hi!=#}" + "'", str32.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str34 = defaultedMap30.toString();
        java.lang.Object obj37 = defaultedMap30.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str43 = defaultedMap39.toString();
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) str43);
        defaultedMap30.clear();
        java.util.Set set46 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        java.lang.Object obj48 = defaultedMap28.remove((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{hi!=#}" + "'", str34.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{hi!=#}" + "'", str43.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str28 = defaultedMap24.toString();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str37 = defaultedMap33.toString();
        java.lang.Object obj38 = defaultedMap24.get((java.lang.Object) str37);
        defaultedMap24.clear();
        java.lang.Object obj40 = defaultedMap19.get((java.lang.Object) defaultedMap24);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) defaultedMap19);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{hi!=#}" + "'", str28.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{hi!=#}" + "'", str37.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) (-1));
        collections.Predicate predicate28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate35);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map12, predicate35, predicate38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) map12);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str46 = defaultedMap42.toString();
        java.util.Collection collection47 = defaultedMap42.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b53 = defaultedMap42.containsValue((java.lang.Object) defaultedMap49);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) defaultedMap49);
        collections.Factory factory58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, factory58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{hi!=#}" + "'", str46.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap12.remove((java.lang.Object) (-1));
        defaultedMap12.clear();
        java.util.Collection collection27 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b29 = defaultedMap3.equals((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str54 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i57 = defaultedMap56.size();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap51.remove((java.lang.Object) (-1));
        collections.Predicate predicate65 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate65, predicate72);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map49, predicate72, predicate75);
        java.lang.Object obj77 = defaultedMap38.get((java.lang.Object) map49);
        defaultedMap38.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap38);
        java.util.Set set80 = defaultedMap38.keySet();
        java.lang.Object obj81 = defaultedMap28.get((java.lang.Object) set80);
        java.lang.Object obj82 = null;
        boolean b83 = defaultedMap28.equals(obj82);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{hi!=#}" + "'", str35.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0L + "'", obj77.equals(0L));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        int i8 = defaultedMap1.size();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Collection collection16 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str22 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.isEmpty();
        java.util.Set set24 = defaultedMap18.keySet();
        boolean b25 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Collection collection37 = defaultedMap32.values();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1L);
        java.util.Set set41 = defaultedMap32.entrySet();
        java.lang.Object obj42 = defaultedMap11.remove((java.lang.Object) set41);
        java.lang.Object obj43 = defaultedMap1.remove(obj42);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{hi!=#}" + "'", str15.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{hi!=#}" + "'", str22.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i9 = defaultedMap8.size();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) (-1));
        defaultedMap3.clear();
        java.util.Collection collection18 = defaultedMap3.values();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str24 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj31 = defaultedMap3.put(obj19, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.lang.Object obj41 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.Object obj48 = defaultedMap34.get((java.lang.Object) str47);
        defaultedMap34.clear();
        java.lang.Object obj50 = defaultedMap3.put((java.lang.Object) "", (java.lang.Object) defaultedMap34);
        java.util.Set set51 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str56 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i59 = defaultedMap58.size();
        boolean b60 = defaultedMap58.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap53.remove((java.lang.Object) (-1));
        defaultedMap53.clear();
        java.util.Collection collection68 = defaultedMap53.values();
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str74 = defaultedMap73.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i77 = defaultedMap76.size();
        boolean b78 = defaultedMap76.isEmpty();
        defaultedMap73.putAll((java.util.Map) defaultedMap76);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.lang.Object obj81 = defaultedMap53.put(obj69, (java.lang.Object) defaultedMap71);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj81);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj81);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap1.containsKey((java.lang.Object) defaultedMap83);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{hi!=#}" + "'", str47.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) -1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i31 = defaultedMap30.size();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) (-1));
        collections.Predicate predicate39 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate39, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate39);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate23);
        java.lang.String str51 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str27 = defaultedMap23.toString();
        boolean b28 = defaultedMap23.isEmpty();
        boolean b29 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) b29, (java.lang.Object) defaultedMap31);
        java.util.Collection collection34 = defaultedMap15.values();
        java.lang.Object obj35 = defaultedMap8.get((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i41 = defaultedMap40.size();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str49 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.isEmpty();
        boolean b51 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i54 = defaultedMap53.size();
        java.lang.Object obj55 = defaultedMap37.put((java.lang.Object) b51, (java.lang.Object) defaultedMap53);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Collection collection57 = defaultedMap53.values();
        defaultedMap53.clear();
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj61 = defaultedMap8.put((java.lang.Object) defaultedMap53, obj59);
        defaultedMap8.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{hi!=#}" + "'", str49.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) (-1));
        defaultedMap9.clear();
        java.util.Collection collection24 = defaultedMap9.values();
        java.lang.Object obj25 = defaultedMap4.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str21 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str30 = defaultedMap26.toString();
        java.lang.Object obj31 = defaultedMap17.get((java.lang.Object) str30);
        defaultedMap17.clear();
        boolean b33 = defaultedMap6.equals((java.lang.Object) defaultedMap17);
        java.util.Set set34 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap36.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str49 = defaultedMap45.toString();
        java.lang.Object obj50 = defaultedMap36.get((java.lang.Object) str49);
        defaultedMap36.clear();
        java.lang.Object obj52 = defaultedMap6.get((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{hi!=#}" + "'", str21.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{hi!=#}" + "'", str30.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{hi!=#}" + "'", str40.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{hi!=#}" + "'", str49.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str54 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i57 = defaultedMap56.size();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap51.remove((java.lang.Object) (-1));
        defaultedMap51.clear();
        java.util.Collection collection66 = defaultedMap51.values();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str72 = defaultedMap71.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i75 = defaultedMap74.size();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj79 = defaultedMap51.put(obj67, (java.lang.Object) defaultedMap69);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj79);
        boolean b82 = defaultedMap81.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b82 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap22.entrySet();
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) set31);
        boolean b33 = defaultedMap1.isEmpty();
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) "{hi!=#}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{hi!=#}" + "'", str26.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str27 = defaultedMap23.toString();
        boolean b28 = defaultedMap23.isEmpty();
        boolean b29 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) b29, (java.lang.Object) defaultedMap31);
        java.util.Collection collection34 = defaultedMap15.values();
        java.lang.Object obj35 = defaultedMap8.get((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str40 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i43 = defaultedMap42.size();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap37.remove((java.lang.Object) (-1));
        defaultedMap37.clear();
        java.lang.String str52 = defaultedMap37.toString();
        java.lang.String str53 = defaultedMap37.toString();
        java.lang.Object obj55 = defaultedMap37.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str61 = defaultedMap57.toString();
        boolean b62 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str68 = defaultedMap64.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i71 = defaultedMap70.size();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str77 = defaultedMap73.toString();
        java.util.Collection collection78 = defaultedMap73.values();
        java.lang.Object obj79 = defaultedMap70.remove((java.lang.Object) defaultedMap73);
        java.lang.Object obj80 = defaultedMap64.remove((java.lang.Object) defaultedMap70);
        java.lang.Object obj81 = defaultedMap37.put((java.lang.Object) defaultedMap57, obj80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str84 = defaultedMap83.toString();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i87 = defaultedMap86.size();
        boolean b88 = defaultedMap86.isEmpty();
        defaultedMap83.putAll((java.util.Map) defaultedMap86);
        boolean b90 = defaultedMap86.isEmpty();
        java.lang.Object obj91 = defaultedMap37.get((java.lang.Object) b90);
        boolean b92 = defaultedMap8.containsValue(obj91);
        java.util.Set set93 = defaultedMap8.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{hi!=#}" + "'", str61.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{hi!=#}" + "'", str68.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{hi!=#}" + "'", str77.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0L + "'", obj91.equals(0L));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        int i48 = defaultedMap45.size();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) i48);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap17.remove((java.lang.Object) (-1));
        defaultedMap17.clear();
        java.util.Collection collection32 = defaultedMap17.values();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i41 = defaultedMap40.size();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj45 = defaultedMap17.put(obj33, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str52 = defaultedMap48.toString();
        java.lang.Object obj55 = defaultedMap48.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str61 = defaultedMap57.toString();
        java.lang.Object obj62 = defaultedMap48.get((java.lang.Object) str61);
        defaultedMap48.clear();
        java.lang.Object obj64 = defaultedMap17.put((java.lang.Object) "", (java.lang.Object) defaultedMap48);
        boolean b65 = defaultedMap8.containsKey((java.lang.Object) "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{hi!=#}" + "'", str12.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{hi!=#}" + "'", str52.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{hi!=#}" + "'", str61.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str11 = defaultedMap7.toString();
        java.util.Collection collection12 = defaultedMap7.values();
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i21 = defaultedMap20.size();
        boolean b22 = defaultedMap20.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.Object obj32 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.lang.Object obj39 = defaultedMap25.get((java.lang.Object) str38);
        defaultedMap20.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str51 = defaultedMap47.toString();
        java.util.Collection collection52 = defaultedMap47.values();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap47);
        java.lang.Object obj54 = defaultedMap25.get((java.lang.Object) defaultedMap42);
        boolean b55 = defaultedMap7.containsValue((java.lang.Object) defaultedMap25);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) b55);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{hi!=#}" + "'", str11.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{hi!=#}" + "'", str29.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{hi!=#}" + "'", str51.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i51 = defaultedMap50.size();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap50);
        java.util.Set set54 = defaultedMap50.entrySet();
        int i55 = defaultedMap50.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str38 = defaultedMap34.toString();
        java.util.Collection collection39 = defaultedMap34.values();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        java.lang.Object obj41 = defaultedMap12.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj42 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str46 = defaultedMap45.toString();
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) defaultedMap45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj47);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{hi!=#}" + "'", str38.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        java.lang.Object obj15 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str23 = defaultedMap19.toString();
        boolean b24 = defaultedMap19.isEmpty();
        boolean b25 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (byte) 10);
        boolean b36 = defaultedMap19.containsKey((java.lang.Object) (byte) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{hi!=#}" + "'", str23.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Collection collection21 = defaultedMap17.values();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap17.get(obj22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str24 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap21.remove((java.lang.Object) (-1));
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate35, predicate42);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map19, predicate42, predicate45);
        java.lang.Object obj47 = defaultedMap8.get((java.lang.Object) map19);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set50 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i58 = defaultedMap57.size();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set66 = defaultedMap65.keySet();
        java.lang.Object obj68 = defaultedMap52.put((java.lang.Object) set66, (java.lang.Object) (short) 100);
        java.lang.String str69 = defaultedMap52.toString();
        java.util.Collection collection70 = defaultedMap52.values();
        java.lang.Object obj71 = defaultedMap8.get((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{[]=100}" + "'", str69.equals("{[]=100}"));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i26 = defaultedMap25.size();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap20.remove((java.lang.Object) (-1));
        defaultedMap20.clear();
        java.util.Collection collection35 = defaultedMap20.values();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i44 = defaultedMap43.size();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj48 = defaultedMap20.put(obj36, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str55 = defaultedMap51.toString();
        java.lang.Object obj58 = defaultedMap51.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str64 = defaultedMap60.toString();
        java.lang.Object obj65 = defaultedMap51.get((java.lang.Object) str64);
        defaultedMap51.clear();
        java.lang.Object obj67 = defaultedMap20.put((java.lang.Object) "", (java.lang.Object) defaultedMap51);
        java.util.Set set68 = defaultedMap51.keySet();
        java.lang.Object obj69 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str73 = defaultedMap72.toString();
        java.lang.Object obj74 = defaultedMap70.get((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i77 = defaultedMap76.size();
        boolean b78 = defaultedMap76.isEmpty();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str85 = defaultedMap81.toString();
        java.lang.Object obj88 = defaultedMap81.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj93 = defaultedMap90.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str94 = defaultedMap90.toString();
        java.lang.Object obj95 = defaultedMap81.get((java.lang.Object) str94);
        defaultedMap76.putAll((java.util.Map) defaultedMap81);
        java.lang.Object obj97 = defaultedMap1.put((java.lang.Object) set68, (java.lang.Object) defaultedMap81);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{hi!=#}" + "'", str55.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{hi!=#}" + "'", str64.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{hi!=#}" + "'", str85.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "{hi!=#}" + "'", str94.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + 0L + "'", obj95.equals(0L));
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        java.util.Set set50 = defaultedMap32.keySet();
        boolean b51 = defaultedMap32.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.util.Collection collection12 = defaultedMap3.values();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.keySet();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0L + "'", obj4.equals(0L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) (-1));
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate44, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map28, predicate51, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate51, predicate61);
        int i65 = defaultedMap17.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection28 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str47 = defaultedMap43.toString();
        java.util.Collection collection48 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str54 = defaultedMap50.toString();
        boolean b55 = defaultedMap50.isEmpty();
        java.util.Set set56 = defaultedMap50.keySet();
        boolean b57 = defaultedMap43.containsKey((java.lang.Object) defaultedMap50);
        defaultedMap50.clear();
        boolean b59 = defaultedMap30.equals((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str72 = defaultedMap71.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i75 = defaultedMap74.size();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (short) 1);
        java.lang.Object obj82 = defaultedMap69.remove((java.lang.Object) (-1));
        collections.Predicate predicate83 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj88 = defaultedMap85.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate89, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate83, predicate90);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map67, predicate90, predicate93);
        java.lang.Object obj95 = defaultedMap30.remove((java.lang.Object) predicate93);
        java.lang.Object obj96 = defaultedMap12.get((java.lang.Object) predicate93);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{hi!=#}" + "'", str47.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{hi!=#}" + "'", str54.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 0L + "'", obj96.equals(0L));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str19 = defaultedMap15.toString();
        java.util.Collection collection20 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap22);
        java.lang.String str27 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        java.util.Collection collection48 = defaultedMap29.values();
        java.lang.Object obj49 = defaultedMap22.get((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsValue(obj49);
        boolean b51 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{hi!=#}" + "'", str19.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) '4');
        java.util.Collection collection17 = defaultedMap1.values();
        java.lang.Object obj19 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i29 = defaultedMap28.size();
        boolean b30 = defaultedMap28.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (short) 1);
        java.lang.String str35 = defaultedMap23.toString();
        boolean b36 = defaultedMap20.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap20.containsKey(obj37);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) b38);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        boolean b6 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.isEmpty();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) (-1));
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate44, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map28, predicate51, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate51, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        boolean b66 = defaultedMap17.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str24 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap21.remove((java.lang.Object) (-1));
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate35, predicate42);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map19, predicate42, predicate45);
        java.lang.Object obj47 = defaultedMap8.get((java.lang.Object) map19);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        int i50 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertTrue(i50 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.lang.String str21 = defaultedMap12.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{hi!=#}" + "'", str21.equals("{hi!=#}"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.util.Collection collection54 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b60 = defaultedMap49.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj62 = defaultedMap12.get((java.lang.Object) defaultedMap56);
        java.lang.String str63 = defaultedMap56.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{hi!=#}" + "'", str63.equals("{hi!=#}"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str27 = defaultedMap23.toString();
        boolean b28 = defaultedMap23.isEmpty();
        boolean b29 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) b29, (java.lang.Object) defaultedMap31);
        java.util.Collection collection34 = defaultedMap15.values();
        java.lang.Object obj35 = defaultedMap8.get((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i41 = defaultedMap40.size();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str49 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.isEmpty();
        boolean b51 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i54 = defaultedMap53.size();
        java.lang.Object obj55 = defaultedMap37.put((java.lang.Object) b51, (java.lang.Object) defaultedMap53);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Collection collection57 = defaultedMap53.values();
        defaultedMap53.clear();
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj61 = defaultedMap8.put((java.lang.Object) defaultedMap53, obj59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str67 = defaultedMap63.toString();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str73 = defaultedMap69.toString();
        java.util.Collection collection74 = defaultedMap69.values();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) collection74);
        boolean b76 = defaultedMap8.equals((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{hi!=#}" + "'", str49.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{hi!=#}" + "'", str67.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{hi!=#}" + "'", str73.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap19.remove((java.lang.Object) (-1));
        defaultedMap19.clear();
        java.util.Collection collection34 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.lang.Object obj44 = defaultedMap19.put((java.lang.Object) predicate41, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str49 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i52 = defaultedMap51.size();
        boolean b53 = defaultedMap51.isEmpty();
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap46.remove((java.lang.Object) (-1));
        collections.Predicate predicate60 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap62.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate60, predicate67);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate67);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i21 = defaultedMap20.size();
        boolean b22 = defaultedMap20.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Collection collection37 = defaultedMap32.values();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str43 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap42.entrySet();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str56 = defaultedMap52.toString();
        java.lang.Object obj59 = defaultedMap52.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str65 = defaultedMap61.toString();
        java.lang.Object obj66 = defaultedMap52.get((java.lang.Object) str65);
        defaultedMap52.clear();
        java.util.Collection collection68 = defaultedMap52.values();
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) defaultedMap32, (java.lang.Object) collection68);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=#}" + "'", str10.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=#}" + "'", str56.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{hi!=#}" + "'", str65.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0L + "'", obj66.equals(0L));
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) (-1));
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map25, predicate48, predicate51);
        java.lang.Object obj53 = defaultedMap14.get((java.lang.Object) map25);
        boolean b54 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        java.lang.String str55 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str58 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i61 = defaultedMap60.size();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap57.putAll((java.util.Map) defaultedMap60);
        defaultedMap8.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str69 = defaultedMap68.toString();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i72 = defaultedMap71.size();
        boolean b73 = defaultedMap71.isEmpty();
        defaultedMap68.putAll((java.util.Map) defaultedMap71);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) (short) 1);
        java.lang.Object obj79 = defaultedMap66.remove((java.lang.Object) (-1));
        defaultedMap66.clear();
        java.lang.String str81 = defaultedMap66.toString();
        java.lang.String str82 = defaultedMap66.toString();
        java.lang.Object obj84 = defaultedMap66.remove((java.lang.Object) (short) -1);
        java.lang.Object obj85 = defaultedMap57.get((java.lang.Object) defaultedMap66);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{hi!=#}" + "'", str55.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0L + "'", obj85.equals(0L));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap9.entrySet();
        java.lang.Object obj22 = defaultedMap3.put(obj7, (java.lang.Object) set21);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str45 = defaultedMap41.toString();
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) str45);
        defaultedMap32.clear();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) defaultedMap32);
        java.util.Set set49 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str54 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i57 = defaultedMap56.size();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap51.remove((java.lang.Object) (-1));
        defaultedMap51.clear();
        java.util.Collection collection66 = defaultedMap51.values();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str72 = defaultedMap71.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i75 = defaultedMap74.size();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj79 = defaultedMap51.put(obj67, (java.lang.Object) defaultedMap69);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj79);
        collections.Transformer transformer82 = null;
        try {
            java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, transformer82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{hi!=#}" + "'", str45.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap23.isEmpty();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) (-1));
        collections.Predicate predicate32 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate39);
        defaultedMap14.putAll(map41);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i51 = defaultedMap50.size();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (short) 1);
        boolean b57 = defaultedMap14.containsKey((java.lang.Object) map56);
        java.util.Set set58 = defaultedMap14.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) str25);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str53 = defaultedMap49.toString();
        java.util.Collection collection54 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b60 = defaultedMap49.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj62 = defaultedMap12.get((java.lang.Object) defaultedMap56);
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{hi!=#}" + "'", str16.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{hi!=#}" + "'", str25.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{hi!=#}" + "'", str53.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str19 = defaultedMap15.toString();
        java.util.Collection collection20 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap22);
        java.lang.String str27 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str41 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.isEmpty();
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i46 = defaultedMap45.size();
        java.lang.Object obj47 = defaultedMap29.put((java.lang.Object) b43, (java.lang.Object) defaultedMap45);
        java.util.Collection collection48 = defaultedMap29.values();
        java.lang.Object obj49 = defaultedMap22.get((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsValue(obj49);
        java.util.Set set51 = defaultedMap1.entrySet();
        java.util.Set set52 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{hi!=#}" + "'", str19.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{hi!=#}" + "'", str27.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{hi!=#}" + "'", str41.equals("{hi!=#}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap22.remove((java.lang.Object) (-1));
        java.lang.Object obj36 = defaultedMap12.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i44 = defaultedMap43.size();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap38.remove((java.lang.Object) (-1));
        defaultedMap38.clear();
        java.util.Collection collection53 = defaultedMap38.values();
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i62 = defaultedMap61.size();
        boolean b63 = defaultedMap61.isEmpty();
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj66 = defaultedMap38.put(obj54, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str73 = defaultedMap69.toString();
        java.lang.Object obj76 = defaultedMap69.put((java.lang.Object) (short) 1, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj81 = defaultedMap78.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str82 = defaultedMap78.toString();
        java.lang.Object obj83 = defaultedMap69.get((java.lang.Object) str82);
        defaultedMap69.clear();
        java.lang.Object obj85 = defaultedMap38.put((java.lang.Object) "", (java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i88 = defaultedMap87.size();
        boolean b89 = defaultedMap87.isEmpty();
        defaultedMap69.putAll((java.util.Map) defaultedMap87);
        boolean b91 = defaultedMap22.containsValue((java.lang.Object) defaultedMap69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{hi!=#}" + "'", str73.equals("{hi!=#}"));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{hi!=#}" + "'", str82.equals("{hi!=#}"));
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0L + "'", obj83.equals(0L));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) false);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate(map15, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{hi!=#}" + "'", str5.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{hi!=#}" + "'", str13.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap22.remove((java.lang.Object) (-1));
        java.lang.Object obj36 = defaultedMap12.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str42 = defaultedMap38.toString();
        java.util.Collection collection43 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b49 = defaultedMap38.containsValue((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str67 = defaultedMap66.toString();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i70 = defaultedMap69.size();
        boolean b71 = defaultedMap69.isEmpty();
        defaultedMap66.putAll((java.util.Map) defaultedMap69);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) (short) 1);
        java.lang.Object obj77 = defaultedMap64.remove((java.lang.Object) (-1));
        collections.Predicate predicate78 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj83 = defaultedMap80.put((java.lang.Object) 1, (java.lang.Object) 10.0d);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate78, predicate85);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate(map62, predicate85, predicate88);
        java.lang.Object obj90 = defaultedMap51.get((java.lang.Object) map62);
        boolean b91 = defaultedMap45.containsKey((java.lang.Object) defaultedMap51);
        java.util.Set set92 = defaultedMap45.keySet();
        java.lang.Object obj93 = defaultedMap22.get((java.lang.Object) set92);
        boolean b94 = defaultedMap22.isEmpty();
        java.util.Set set95 = defaultedMap22.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=#}" + "'", str9.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{hi!=#}" + "'", str17.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{hi!=#}" + "'", str42.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0L + "'", obj90.equals(0L));
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 0L + "'", obj93.equals(0L));
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) (-1));
        defaultedMap1.clear();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        java.lang.String str30 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        java.lang.String str36 = defaultedMap32.toString();
        java.util.Collection collection37 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) "hi!", (java.lang.Object) '#');
        boolean b43 = defaultedMap32.containsValue((java.lang.Object) defaultedMap39);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap19.get((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{hi!=#}" + "'", str36.equals("{hi!=#}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
    }
}

