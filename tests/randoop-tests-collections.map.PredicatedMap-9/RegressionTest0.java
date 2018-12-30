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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) ' ');
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate(map15, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        defaultedMap7.clear();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0f + "'", obj4.equals(100.0f));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) map17);
        java.lang.String str19 = defaultedMap18.toString();
        int i20 = defaultedMap18.size();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) i20);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) '4', (java.lang.Object) (-1));
        java.lang.String str14 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{4=-1}" + "'", str14.equals("{4=-1}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection13 = defaultedMap10.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0f + "'", obj4.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        defaultedMap21.clear();
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) 10);
        boolean b31 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i18 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap22.toString();
        boolean b25 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i28 = defaultedMap27.size();
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj30 = defaultedMap12.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap10.get(obj30);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        defaultedMap6.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection19 = defaultedMap11.values();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap19.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        defaultedMap36.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj50 = defaultedMap36.get((java.lang.Object) (-1.0f));
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100.0f + "'", obj50.equals(100.0f));
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0f + "'", obj4.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0f + "'", obj6.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap11.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap17.toString();
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) defaultedMap17);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1);
        defaultedMap6.putAll(map22);
        java.util.Set set24 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) map12);
        java.util.Collection collection14 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0f + "'", obj4.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i31 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap35.toString();
        boolean b38 = defaultedMap30.containsValue((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i41 = defaultedMap40.size();
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj43 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate50);
        defaultedMap45.clear();
        boolean b54 = defaultedMap45.containsValue((java.lang.Object) 10);
        java.lang.Object obj55 = defaultedMap15.put((java.lang.Object) defaultedMap25, (java.lang.Object) 10);
        boolean b56 = defaultedMap25.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100.0f + "'", obj42.equals(100.0f));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i6 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap15.toString();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) defaultedMap15);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i24 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap28.toString();
        boolean b31 = defaultedMap23.containsValue((java.lang.Object) defaultedMap28);
        boolean b33 = defaultedMap23.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) (-1.0f));
        defaultedMap5.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100.0f + "'", obj35.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '4' + "'", obj37.equals('4'));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        java.util.Set set11 = defaultedMap6.keySet();
        boolean b12 = defaultedMap6.isEmpty();
        int i13 = defaultedMap6.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) (-1.0f));
        int i18 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) map21);
        java.lang.String str23 = defaultedMap22.toString();
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) defaultedMap22);
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap1.equals((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.String str16 = defaultedMap8.toString();
        int i17 = defaultedMap8.size();
        java.util.Set set18 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap20.isEmpty();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap20.remove(obj30);
        boolean b32 = defaultedMap8.containsKey(obj30);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.String str16 = defaultedMap8.toString();
        int i17 = defaultedMap8.size();
        java.util.Set set18 = defaultedMap8.entrySet();
        java.util.Set set19 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        java.lang.String str23 = defaultedMap8.toString();
        java.util.Set set24 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) predicateUtils25);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) map32);
        boolean b34 = defaultedMap15.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b36 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100.0f + "'", obj35.equals(100.0f));
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i5 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap9.toString();
        boolean b12 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i15 = defaultedMap14.size();
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.String str31 = defaultedMap29.toString();
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i35 = defaultedMap34.size();
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj37 = defaultedMap19.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b45 = defaultedMap42.containsValue((java.lang.Object) (byte) 0);
        boolean b47 = defaultedMap42.containsValue((java.lang.Object) "");
        boolean b48 = defaultedMap42.isEmpty();
        boolean b49 = defaultedMap42.isEmpty();
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) b49);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '4' + "'", obj17.equals('4'));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + '4' + "'", obj50.equals('4'));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) str21);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i26 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) map34);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i40 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.String str46 = defaultedMap44.toString();
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap39.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj50 = defaultedMap35.get((java.lang.Object) b49);
        java.lang.Object obj51 = defaultedMap22.get(obj50);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "{}" + "'", obj51.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) str21);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap36.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate49);
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map31, predicate32, predicate43);
        java.lang.Object obj54 = defaultedMap11.get((java.lang.Object) map31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection9 = defaultedMap3.values();
        boolean b10 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj23 = defaultedMap12.get((java.lang.Object) defaultedMap21);
        java.util.Set set24 = defaultedMap21.entrySet();
        java.lang.Object obj25 = defaultedMap3.get((java.lang.Object) set24);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 10);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) map23, (java.lang.Object) predicateUtils24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.lang.String str40 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap38.values();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate51);
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate45);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) predicate45);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0f + "'", obj21.equals(100.0f));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100.0f + "'", obj56.equals(100.0f));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        boolean b22 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) 100);
        boolean b28 = defaultedMap1.containsKey(obj27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100.0f + "'", obj27.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 10);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) map23, (java.lang.Object) predicateUtils24);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b33 = defaultedMap30.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set36 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i39 = defaultedMap38.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.String str45 = defaultedMap43.toString();
        boolean b46 = defaultedMap38.containsValue((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i49 = defaultedMap48.size();
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj51 = defaultedMap35.get((java.lang.Object) defaultedMap38);
        boolean b52 = defaultedMap30.containsValue(obj51);
        boolean b53 = defaultedMap1.containsKey((java.lang.Object) b52);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0f + "'", obj21.equals(100.0f));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100.0f + "'", obj50.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + '4' + "'", obj51.equals('4'));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap8.containsValue(obj11);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i8 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) map16);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) defaultedMap17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 10);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap1.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100.0f + "'", obj19.equals(100.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i18 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap22.toString();
        boolean b25 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        java.util.Collection collection26 = defaultedMap22.values();
        int i27 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.String str36 = defaultedMap34.toString();
        boolean b37 = defaultedMap29.containsValue((java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        java.util.Set set39 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.String str54 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap52.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection58 = defaultedMap52.values();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate59, predicate65);
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map47, predicate48, predicate59);
        collections.Predicate predicate70 = null;
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate59, predicate70);
        boolean b72 = defaultedMap22.containsKey((java.lang.Object) defaultedMap34);
        boolean b73 = defaultedMap1.containsValue((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i5 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap9.toString();
        boolean b12 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap16.values();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate29);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate29, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate29);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate(map35, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap14.remove((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        java.lang.String str34 = defaultedMap14.toString();
        java.util.Set set35 = defaultedMap14.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection16 = defaultedMap8.values();
        boolean b17 = defaultedMap8.isEmpty();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        int i9 = defaultedMap7.size();
        java.util.Set set10 = defaultedMap7.keySet();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i5 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap9.toString();
        boolean b12 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i15 = defaultedMap14.size();
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.String str31 = defaultedMap29.toString();
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i35 = defaultedMap34.size();
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj37 = defaultedMap19.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set41 = defaultedMap40.entrySet();
        int i42 = defaultedMap40.size();
        defaultedMap40.clear();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '4' + "'", obj17.equals('4'));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i4 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap8.toString();
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap26.toString();
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = defaultedMap8.remove((java.lang.Object) defaultedMap16);
        java.util.Set set36 = defaultedMap16.entrySet();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i40 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) map48);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object obj51 = defaultedMap39.get((java.lang.Object) defaultedMap49);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (byte) 10);
        boolean b55 = defaultedMap39.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i58 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.String str64 = defaultedMap62.toString();
        boolean b65 = defaultedMap57.containsValue((java.lang.Object) defaultedMap62);
        boolean b67 = defaultedMap57.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj69 = defaultedMap57.get((java.lang.Object) (-1.0f));
        defaultedMap39.putAll((java.util.Map) defaultedMap57);
        defaultedMap1.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.lang.String str77 = defaultedMap75.toString();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap75.putAll((java.util.Map) defaultedMap79);
        java.util.Collection collection81 = defaultedMap75.values();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap84.putAll((java.util.Map) defaultedMap86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate82, predicate88);
        boolean b92 = defaultedMap1.containsValue((java.lang.Object) predicate88);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0f + "'", obj33.equals(100.0f));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100.0f + "'", obj69.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        boolean b22 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap35.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) (short) 1);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.String str60 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap58.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection64 = defaultedMap58.values();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate65, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map53, predicate54, predicate65);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate44, predicate54);
        java.lang.Object obj77 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) predicate54);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        defaultedMap11.clear();
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = defaultedMap3.put((java.lang.Object) set16, (java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap14.remove((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        java.util.Set set34 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b41 = defaultedMap38.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        defaultedMap38.putAll((java.util.Map) defaultedMap43);
        java.lang.String str51 = defaultedMap43.toString();
        java.lang.Object obj52 = defaultedMap14.get((java.lang.Object) defaultedMap43);
        int i53 = defaultedMap43.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0L);
        java.lang.String str11 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        defaultedMap11.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap19.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        boolean b41 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        int i42 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100L);
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) "hi!");
        java.lang.Object obj16 = null;
        java.util.Map map17 = collections.map.DefaultedMap.decorate(map15, obj16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) map17);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 10);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) map23, (java.lang.Object) predicateUtils24);
        defaultedMap1.clear();
        boolean b27 = defaultedMap1.isEmpty();
        int i28 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0f + "'", obj21.equals(100.0f));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj24 = defaultedMap6.remove((java.lang.Object) defaultedMap21);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap26.toString();
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) map39);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) str41);
        java.lang.Object obj43 = defaultedMap31.remove((java.lang.Object) defaultedMap42);
        java.lang.Object obj44 = defaultedMap16.get((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i47 = defaultedMap46.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        java.lang.String str53 = defaultedMap51.toString();
        boolean b54 = defaultedMap46.containsValue((java.lang.Object) defaultedMap51);
        java.util.Collection collection55 = defaultedMap51.values();
        boolean b56 = defaultedMap16.containsValue((java.lang.Object) collection55);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        boolean b11 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsValue((java.lang.Object) (short) 1);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.String str36 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap34.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection40 = defaultedMap34.values();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate47);
        java.util.Map map51 = collections.map.PredicatedMap.decorate(map29, predicate30, predicate41);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate30);
        java.util.Set set53 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.String str59 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection63 = defaultedMap57.values();
        java.util.Set set64 = defaultedMap57.entrySet();
        java.util.Set set65 = defaultedMap57.keySet();
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) set65);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.String str21 = defaultedMap19.toString();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.get(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        boolean b33 = defaultedMap19.equals((java.lang.Object) defaultedMap31);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set37 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i40 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.String str46 = defaultedMap44.toString();
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i50 = defaultedMap49.size();
        java.lang.Object obj51 = defaultedMap39.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj52 = defaultedMap36.get((java.lang.Object) defaultedMap39);
        boolean b53 = defaultedMap1.equals(obj52);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '4' + "'", obj52.equals('4'));
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.lang.String str30 = defaultedMap22.toString();
        int i31 = defaultedMap22.size();
        java.util.Set set32 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap36.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection42 = defaultedMap36.values();
        java.util.Set set43 = defaultedMap36.entrySet();
        java.util.Set set44 = defaultedMap36.keySet();
        java.lang.Object obj45 = defaultedMap11.put((java.lang.Object) defaultedMap22, (java.lang.Object) set44);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i11 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap15.toString();
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) defaultedMap15);
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i29 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.String str35 = defaultedMap33.toString();
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i39 = defaultedMap38.size();
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = defaultedMap23.remove((java.lang.Object) defaultedMap38);
        java.lang.Object obj42 = defaultedMap15.remove((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        defaultedMap46.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj60 = defaultedMap51.remove((java.lang.Object) 1.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj62 = defaultedMap3.get((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100.0f + "'", obj40.equals(100.0f));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100.0f + "'", obj62.equals(100.0f));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        boolean b13 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection31 = defaultedMap25.values();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate(map41, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate20, predicate48);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (-1.0d));
        java.util.Set set15 = defaultedMap12.keySet();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i26 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap30.toString();
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i36 = defaultedMap35.size();
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = defaultedMap20.remove((java.lang.Object) defaultedMap35);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        boolean b40 = defaultedMap20.containsKey((java.lang.Object) predicate39);
        java.lang.Object obj41 = defaultedMap12.put((java.lang.Object) 1.0f, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set44 = defaultedMap43.entrySet();
        int i45 = defaultedMap43.size();
        java.lang.Object obj46 = defaultedMap12.get((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate53);
        defaultedMap48.clear();
        boolean b56 = defaultedMap12.equals((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100.0f + "'", obj14.equals(100.0f));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap21.toString();
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        boolean b27 = defaultedMap21.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i35 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap39.toString();
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i45 = defaultedMap44.size();
        java.lang.Object obj46 = defaultedMap34.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj47 = defaultedMap29.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj48 = defaultedMap21.remove((java.lang.Object) defaultedMap29);
        java.lang.String str49 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap29.remove((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) ' ', obj54);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i14 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) map22);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) defaultedMap23);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (byte) 10);
        boolean b29 = defaultedMap13.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i32 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap36.toString();
        boolean b39 = defaultedMap31.containsValue((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap31.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) (-1.0f));
        defaultedMap13.putAll((java.util.Map) defaultedMap31);
        boolean b45 = defaultedMap11.containsValue((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap14.remove((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i41 = defaultedMap40.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.String str47 = defaultedMap45.toString();
        boolean b48 = defaultedMap40.containsValue((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i51 = defaultedMap50.size();
        java.lang.Object obj52 = defaultedMap40.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj53 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        boolean b55 = defaultedMap35.containsKey((java.lang.Object) predicate54);
        java.lang.Object obj56 = defaultedMap14.remove((java.lang.Object) predicate54);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap8.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set27 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.String str36 = defaultedMap34.toString();
        boolean b37 = defaultedMap29.containsValue((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i40 = defaultedMap39.size();
        java.lang.Object obj41 = defaultedMap29.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj42 = defaultedMap26.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i50 = defaultedMap49.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.String str56 = defaultedMap54.toString();
        boolean b57 = defaultedMap49.containsValue((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i60 = defaultedMap59.size();
        java.lang.Object obj61 = defaultedMap49.get((java.lang.Object) defaultedMap59);
        java.lang.Object obj62 = defaultedMap44.remove((java.lang.Object) defaultedMap59);
        boolean b63 = defaultedMap26.containsValue((java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = defaultedMap8.get((java.lang.Object) b63);
        java.lang.String str65 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100.0f + "'", obj41.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '4' + "'", obj42.equals('4'));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100.0f + "'", obj61.equals(100.0f));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Collection collection12 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i15 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.String str21 = defaultedMap19.toString();
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) defaultedMap19);
        java.util.Collection collection23 = defaultedMap19.values();
        boolean b25 = defaultedMap19.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i33 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.String str39 = defaultedMap37.toString();
        boolean b40 = defaultedMap32.containsValue((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i43 = defaultedMap42.size();
        java.lang.Object obj44 = defaultedMap32.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj45 = defaultedMap27.remove((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = defaultedMap19.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj48 = defaultedMap27.remove((java.lang.Object) (short) -1);
        boolean b49 = defaultedMap6.equals((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap17.toString();
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i23 = defaultedMap22.size();
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        boolean b33 = defaultedMap12.equals((java.lang.Object) defaultedMap26);
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap8.equals((java.lang.Object) collection34);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection16 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.String str22 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) (short) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (byte) 0);
        boolean b26 = defaultedMap21.containsValue((java.lang.Object) "");
        defaultedMap3.putAll((java.util.Map) defaultedMap21);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection16 = defaultedMap8.values();
        boolean b17 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) str21);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set26 = defaultedMap25.entrySet();
        int i27 = defaultedMap25.size();
        defaultedMap25.clear();
        boolean b29 = defaultedMap22.equals((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i20 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap24.toString();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i30 = defaultedMap29.size();
        java.lang.Object obj31 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap14.remove((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        java.util.Set set34 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i37 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.lang.String str43 = defaultedMap41.toString();
        boolean b44 = defaultedMap36.containsValue((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i47 = defaultedMap46.size();
        java.lang.Object obj48 = defaultedMap36.get((java.lang.Object) defaultedMap46);
        java.lang.Object obj49 = defaultedMap14.get((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap53.putAll((java.util.Map) defaultedMap57);
        java.util.Collection collection59 = defaultedMap53.values();
        java.util.Set set60 = defaultedMap53.entrySet();
        java.util.Set set61 = defaultedMap53.keySet();
        java.lang.Object obj62 = defaultedMap14.get((java.lang.Object) defaultedMap53);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100.0f + "'", obj62.equals(100.0f));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        java.lang.String str23 = defaultedMap8.toString();
        int i24 = defaultedMap8.size();
        java.util.Collection collection25 = defaultedMap8.values();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map33);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        java.lang.String str37 = defaultedMap34.toString();
        boolean b38 = defaultedMap20.containsValue((java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i4 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap8.toString();
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i14 = defaultedMap13.size();
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) defaultedMap13);
        java.lang.String str16 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) map24);
        java.lang.String str26 = defaultedMap25.toString();
        int i27 = defaultedMap25.size();
        boolean b29 = defaultedMap25.equals((java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) defaultedMap25);
        boolean b31 = defaultedMap1.containsValue(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) map39);
        java.lang.String str41 = defaultedMap40.toString();
        int i42 = defaultedMap40.size();
        boolean b44 = defaultedMap40.equals((java.lang.Object) 1L);
        boolean b45 = defaultedMap40.isEmpty();
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) b45);
        java.util.Set set47 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100.0f + "'", obj30.equals(100.0f));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 10.0f + "'", obj46.equals(10.0f));
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap21.toString();
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i27 = defaultedMap26.size();
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) defaultedMap16);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '4' + "'", obj29.equals('4'));
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i11 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj22 = defaultedMap10.get((java.lang.Object) defaultedMap20);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection34 = defaultedMap28.values();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.String str59 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection63 = defaultedMap57.values();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate64, predicate70);
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map52, predicate53, predicate64);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map24, predicate41, predicate64);
        boolean b76 = defaultedMap7.containsKey((java.lang.Object) predicate64);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100.0f + "'", obj22.equals(100.0f));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i17 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap21.toString();
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i27 = defaultedMap26.size();
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = defaultedMap11.remove((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        defaultedMap31.clear();
        boolean b40 = defaultedMap31.containsValue((java.lang.Object) 10);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i44 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) map52);
        java.lang.String str54 = defaultedMap53.toString();
        java.lang.Object obj55 = defaultedMap43.get((java.lang.Object) defaultedMap53);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (byte) 10);
        boolean b59 = defaultedMap43.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj60 = defaultedMap11.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100.0f + "'", obj55.equals(100.0f));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.get(obj14);
        java.util.Collection collection16 = defaultedMap11.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i5 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap9.toString();
        boolean b12 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap16.values();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate29);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate29, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate29);
        boolean b36 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i39 = defaultedMap38.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) map47);
        java.lang.String str49 = defaultedMap48.toString();
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) defaultedMap48);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (byte) 10);
        boolean b54 = defaultedMap38.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i57 = defaultedMap56.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.lang.String str63 = defaultedMap61.toString();
        boolean b64 = defaultedMap56.containsValue((java.lang.Object) defaultedMap61);
        boolean b66 = defaultedMap56.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj68 = defaultedMap56.get((java.lang.Object) (-1.0f));
        defaultedMap38.putAll((java.util.Map) defaultedMap56);
        int i70 = defaultedMap38.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100.0f + "'", obj50.equals(100.0f));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100.0f + "'", obj68.equals(100.0f));
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i4 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap8.toString();
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap26.toString();
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = defaultedMap8.remove((java.lang.Object) defaultedMap16);
        java.util.Set set36 = defaultedMap16.entrySet();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i40 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) map48);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object obj51 = defaultedMap39.get((java.lang.Object) defaultedMap49);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (byte) 10);
        boolean b55 = defaultedMap39.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i58 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.String str64 = defaultedMap62.toString();
        boolean b65 = defaultedMap57.containsValue((java.lang.Object) defaultedMap62);
        boolean b67 = defaultedMap57.containsValue((java.lang.Object) 10.0d);
        java.lang.Object obj69 = defaultedMap57.get((java.lang.Object) (-1.0f));
        defaultedMap39.putAll((java.util.Map) defaultedMap57);
        defaultedMap1.putAll((java.util.Map) defaultedMap39);
        collections.Transformer transformer72 = null;
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, transformer72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0f + "'", obj33.equals(100.0f));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100.0f + "'", obj69.equals(100.0f));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        defaultedMap1.clear();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.String str21 = defaultedMap19.toString();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.get(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        boolean b33 = defaultedMap19.equals((java.lang.Object) defaultedMap31);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) map42);
        java.util.Set set44 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.String str14 = defaultedMap11.toString();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) predicate15);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) str9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        java.util.Set set21 = defaultedMap18.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "{}" + "'", obj20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.get(obj14);
        java.util.Set set16 = defaultedMap11.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) map32);
        boolean b34 = defaultedMap15.containsValue((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i37 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.lang.String str43 = defaultedMap41.toString();
        boolean b44 = defaultedMap36.containsValue((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.String str50 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap48.putAll((java.util.Map) defaultedMap52);
        java.util.Collection collection54 = defaultedMap48.values();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate55, predicate61);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate61, predicate65);
        defaultedMap33.putAll(map66);
        boolean b68 = defaultedMap11.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 10.0f);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        java.util.Set set21 = defaultedMap19.entrySet();
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Set set23 = defaultedMap19.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection19 = defaultedMap13.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate26);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate30);
        java.util.Collection collection32 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i35 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap39.toString();
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.String str48 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap46.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection52 = defaultedMap46.values();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate59);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate59, predicate63);
        java.util.Set set65 = defaultedMap34.keySet();
        java.lang.String str66 = defaultedMap34.toString();
        java.lang.Object obj68 = defaultedMap1.put((java.lang.Object) defaultedMap34, (java.lang.Object) 0L);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection19 = defaultedMap13.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate26);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate30);
        java.util.Collection collection32 = defaultedMap1.values();
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) map12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0f + "'", obj4.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map33);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        java.lang.String str37 = defaultedMap34.toString();
        boolean b38 = defaultedMap20.containsValue((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i41 = defaultedMap40.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.String str47 = defaultedMap45.toString();
        boolean b48 = defaultedMap40.containsValue((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i51 = defaultedMap50.size();
        java.lang.Object obj52 = defaultedMap40.get((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        boolean b61 = defaultedMap40.equals((java.lang.Object) defaultedMap54);
        java.util.Collection collection62 = defaultedMap54.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        boolean b64 = defaultedMap34.containsKey((java.lang.Object) defaultedMap54);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) str9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "{}" + "'", obj20.equals("{}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 10);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) map23, (java.lang.Object) predicateUtils24);
        int i26 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0f + "'", obj21.equals(100.0f));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap14.values();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map30, predicate37, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i46 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.lang.String str52 = defaultedMap50.toString();
        boolean b53 = defaultedMap45.containsValue((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.String str59 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection63 = defaultedMap57.values();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate64, predicate70);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate70, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate70);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate37, predicate70);
        java.util.Set set78 = defaultedMap8.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (byte) 0);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) "");
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.String str10 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i13 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap17.toString();
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        boolean b23 = defaultedMap17.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i31 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap35.toString();
        boolean b38 = defaultedMap30.containsValue((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i41 = defaultedMap40.size();
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj43 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = defaultedMap17.remove((java.lang.Object) defaultedMap25);
        java.util.Set set45 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b52 = defaultedMap49.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        defaultedMap49.putAll((java.util.Map) defaultedMap54);
        java.lang.String str62 = defaultedMap54.toString();
        java.lang.Object obj63 = defaultedMap25.get((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i66 = defaultedMap65.size();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) map74);
        java.lang.String str76 = defaultedMap75.toString();
        java.lang.Object obj77 = defaultedMap65.get((java.lang.Object) defaultedMap75);
        java.lang.Object obj78 = defaultedMap54.remove(obj77);
        defaultedMap8.putAll((java.util.Map) defaultedMap54);
        java.lang.Object obj81 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100.0f + "'", obj42.equals(100.0f));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100.0f + "'", obj63.equals(100.0f));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 100.0f + "'", obj77.equals(100.0f));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.String str14 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        defaultedMap17.clear();
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) map34);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.String str37 = defaultedMap35.toString();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.get(obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.String str45 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '4');
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        boolean b49 = defaultedMap35.equals((java.lang.Object) defaultedMap47);
        boolean b50 = defaultedMap17.containsValue((java.lang.Object) defaultedMap47);
        java.util.Set set51 = defaultedMap17.keySet();
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap17.remove(obj52);
        java.lang.Object obj54 = defaultedMap15.remove(obj53);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        boolean b22 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        int i23 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap16.toString();
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj24 = defaultedMap6.remove((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = defaultedMap3.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap11.toString();
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set19 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i22 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap26.toString();
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap18.get((java.lang.Object) defaultedMap21);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap18);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0f + "'", obj33.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '4' + "'", obj34.equals('4'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection16 = defaultedMap8.values();
        java.lang.String str17 = defaultedMap8.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0f) + "'", obj9.equals((-1.0f)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.String str8 = defaultedMap6.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) str21);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i26 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap30.toString();
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) defaultedMap30);
        java.util.Collection collection34 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.String str45 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) str45);
        java.lang.Object obj47 = defaultedMap35.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj48 = defaultedMap22.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i51 = defaultedMap50.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        java.lang.String str57 = defaultedMap55.toString();
        boolean b58 = defaultedMap50.containsValue((java.lang.Object) defaultedMap55);
        java.util.Collection collection59 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        int i62 = defaultedMap61.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.String str68 = defaultedMap66.toString();
        boolean b69 = defaultedMap61.containsValue((java.lang.Object) defaultedMap66);
        java.util.Collection collection70 = defaultedMap66.values();
        boolean b72 = defaultedMap66.equals((java.lang.Object) ' ');
        boolean b73 = defaultedMap55.containsKey((java.lang.Object) ' ');
        java.util.Collection collection74 = defaultedMap55.values();
        boolean b75 = defaultedMap35.equals((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "{}" + "'", obj48.equals("{}"));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue(b75 == true);
    }
}

