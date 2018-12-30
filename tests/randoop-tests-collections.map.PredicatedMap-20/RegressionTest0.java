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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
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
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 0L);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1L + "'", obj4.equals(1L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) ' ');
        boolean b9 = defaultedMap3.containsValue(obj8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.util.Set set13 = defaultedMap9.keySet();
        java.lang.String str14 = defaultedMap9.toString();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) str14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap9.values();
        defaultedMap9.clear();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) '4');
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.util.Collection collection14 = defaultedMap13.values();
        defaultedMap13.clear();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 0);
        int i19 = defaultedMap5.size();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap9.equals((java.lang.Object) defaultedMap11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) set29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) set29);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) -1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) 0.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj40);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) '4');
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) set10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap3.remove((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) -1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) defaultedMap10);
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0={}}" + "'", str12.equals("{0={}}"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.util.Set set32 = defaultedMap28.keySet();
        defaultedMap28.clear();
        int i34 = defaultedMap28.size();
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object obj37 = defaultedMap28.remove((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.remove(obj6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection22 = defaultedMap17.values();
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) defaultedMap17, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) '4');
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection31 = defaultedMap26.values();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate33);
        boolean b35 = defaultedMap17.containsValue((java.lang.Object) predicate32);
        boolean b36 = defaultedMap8.containsKey((java.lang.Object) predicate32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Set set30 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) '4');
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj39 = null;
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj39);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) '4');
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) set50);
        java.util.Collection collection52 = defaultedMap51.values();
        defaultedMap51.clear();
        boolean b54 = defaultedMap43.containsValue((java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = defaultedMap32.get((java.lang.Object) defaultedMap51);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) '4');
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection63 = defaultedMap58.values();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate65);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate(map67, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b74 = defaultedMap72.containsKey((java.lang.Object) '4');
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection77 = defaultedMap72.values();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate78, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate68, predicate79);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set84 = defaultedMap83.keySet();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) set84);
        java.util.Collection collection86 = defaultedMap85.values();
        defaultedMap85.clear();
        java.lang.Object obj88 = defaultedMap1.put((java.lang.Object) predicate68, (java.lang.Object) defaultedMap85);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap8.containsValue((java.lang.Object) "");
        boolean b29 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1L + "'", obj4.equals(1L));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.util.Set set8 = defaultedMap4.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) set8);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj6 = null;
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) set10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap24.values();
        defaultedMap24.clear();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap24);
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap11.put((java.lang.Object) predicate14, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) '4');
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection41 = defaultedMap36.values();
        java.lang.Object obj43 = defaultedMap33.put((java.lang.Object) defaultedMap36, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) '4');
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection50 = defaultedMap45.values();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        boolean b54 = defaultedMap36.containsValue((java.lang.Object) predicate51);
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map7, predicate14, predicate51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        java.util.Set set30 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) '4');
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.util.Set set45 = defaultedMap41.keySet();
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap41.remove(obj46);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap41);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        java.lang.Object obj50 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) predicateUtils49);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) set29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) set29);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) -1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) 0.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj40);
        java.util.Collection collection42 = defaultedMap8.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) '4');
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection13 = defaultedMap8.values();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) '4');
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap25.remove(obj30);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap25);
        defaultedMap8.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) (-1L));
        java.util.Set set41 = defaultedMap37.keySet();
        defaultedMap37.clear();
        int i43 = defaultedMap37.size();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj45 = defaultedMap8.get((java.lang.Object) defaultedMap35);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        int i47 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) '4');
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj18 = null;
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, obj18);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) '4');
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) set29);
        java.util.Collection collection31 = defaultedMap30.values();
        defaultedMap30.clear();
        boolean b33 = defaultedMap22.containsValue((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap11.get((java.lang.Object) defaultedMap30);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) '4');
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection42 = defaultedMap37.values();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate44);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) '4');
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection56 = defaultedMap51.values();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate48, predicate57);
        boolean b61 = defaultedMap1.equals((java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) '4');
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection68 = defaultedMap63.values();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) '4');
        boolean b77 = defaultedMap73.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection78 = defaultedMap73.values();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate69, predicate79);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        defaultedMap3.clear();
        boolean b7 = defaultedMap3.equals((java.lang.Object) ' ');
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set11);
        defaultedMap3.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap24.values();
        defaultedMap24.clear();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap24);
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap3.remove((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) '4');
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) (short) -1);
        java.util.Collection collection14 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection21 = defaultedMap16.values();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) '4');
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap33.remove(obj38);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap33);
        defaultedMap16.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj43 = defaultedMap6.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0d);
        defaultedMap16.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) '4');
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj26 = null;
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, obj26);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) set37);
        java.util.Collection collection39 = defaultedMap38.values();
        defaultedMap38.clear();
        boolean b41 = defaultedMap30.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj42 = defaultedMap19.get((java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) '4');
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection50 = defaultedMap45.values();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate52);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate(map54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) '4');
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection64 = defaultedMap59.values();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate56, predicate65);
        java.lang.Object obj69 = defaultedMap1.remove((java.lang.Object) predicate56);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1L + "'", obj17.equals(1L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) "hi!");
        java.util.Map map9 = null;
        try {
            defaultedMap1.putAll(map9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        java.util.Set set6 = defaultedMap3.keySet();
        java.util.Collection collection7 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1L + "'", obj4.equals(1L));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) '4');
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) set22);
        java.util.Collection collection24 = defaultedMap23.values();
        defaultedMap23.clear();
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap10.put((java.lang.Object) predicate13, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection35 = defaultedMap30.values();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) '4');
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        java.util.Set set51 = defaultedMap47.keySet();
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap47.remove(obj52);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap47);
        defaultedMap30.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) '4');
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj64 = null;
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj64);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) '4');
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set75 = defaultedMap74.keySet();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) set75);
        java.util.Collection collection77 = defaultedMap76.values();
        defaultedMap76.clear();
        boolean b79 = defaultedMap68.containsValue((java.lang.Object) defaultedMap76);
        java.lang.Object obj80 = defaultedMap57.get((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b85 = defaultedMap82.containsKey((java.lang.Object) (-1L));
        java.util.Set set86 = defaultedMap82.keySet();
        java.lang.Object obj87 = defaultedMap57.remove((java.lang.Object) defaultedMap82);
        defaultedMap57.clear();
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap57);
        java.lang.Object obj90 = defaultedMap10.get((java.lang.Object) map89);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + "" + "'", obj80.equals(""));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(obj90);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.util.Collection collection16 = defaultedMap15.values();
        defaultedMap15.clear();
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.util.Set set25 = defaultedMap21.keySet();
        defaultedMap21.clear();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap21.keySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1L + "'", obj28.equals(1L));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.util.Collection collection16 = defaultedMap15.values();
        defaultedMap15.clear();
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap7);
        boolean b20 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) "{}");
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        int i11 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.util.Collection collection16 = defaultedMap15.values();
        defaultedMap15.clear();
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap7);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) ' ');
        defaultedMap25.clear();
        int i29 = defaultedMap25.size();
        int i30 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) '4');
        boolean b41 = defaultedMap25.equals((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1L + "'", obj27.equals(1L));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap9.values();
        defaultedMap9.clear();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap9.values();
        defaultedMap9.clear();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.util.Set set13 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.util.Set set19 = defaultedMap15.keySet();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap15.equals((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap9.containsKey((java.lang.Object) b26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) '4');
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) set15);
        java.util.Collection collection17 = defaultedMap16.values();
        defaultedMap16.clear();
        boolean b19 = defaultedMap8.containsValue((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) predicate6, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) '4');
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection28 = defaultedMap23.values();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.util.Set set44 = defaultedMap40.keySet();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap40.remove(obj45);
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap40);
        defaultedMap23.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) '4');
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj57 = null;
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, obj57);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) '4');
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set68 = defaultedMap67.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) set68);
        java.util.Collection collection70 = defaultedMap69.values();
        defaultedMap69.clear();
        boolean b72 = defaultedMap61.containsValue((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap50.get((java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b76 = defaultedMap75.isEmpty();
        boolean b78 = defaultedMap75.containsKey((java.lang.Object) (-1L));
        java.util.Set set79 = defaultedMap75.keySet();
        java.lang.Object obj80 = defaultedMap50.remove((java.lang.Object) defaultedMap75);
        defaultedMap50.clear();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) defaultedMap50);
        java.lang.Object obj83 = defaultedMap3.get((java.lang.Object) map82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj87 = defaultedMap85.get((java.lang.Object) ' ');
        int i88 = defaultedMap85.size();
        boolean b89 = defaultedMap3.containsValue((java.lang.Object) defaultedMap85);
        java.util.Set set90 = defaultedMap85.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 1L + "'", obj87.equals(1L));
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNotNull(set90);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) '4');
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) -1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) defaultedMap10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) ' ');
        defaultedMap25.clear();
        int i29 = defaultedMap25.size();
        int i30 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str32 = defaultedMap25.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1L + "'", obj27.equals(1L));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) '4');
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj24);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap8.containsValue((java.lang.Object) defaultedMap19);
        java.util.Collection collection28 = defaultedMap19.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set13);
        java.lang.Object obj16 = defaultedMap5.put((java.lang.Object) "{0={}}", (java.lang.Object) set13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.util.Collection collection16 = defaultedMap15.values();
        defaultedMap15.clear();
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap7);
        java.util.Collection collection20 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        int i24 = defaultedMap20.size();
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap12.isEmpty();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b24);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) '4');
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.util.Collection collection14 = defaultedMap13.values();
        defaultedMap13.clear();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 0);
        java.util.Set set19 = defaultedMap5.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.equals(obj5);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) set6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.util.Set set24 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap7.put((java.lang.Object) predicate10, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) '4');
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.util.Set set38 = defaultedMap34.keySet();
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap34.remove(obj39);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) '4');
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection48 = defaultedMap43.values();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) '4');
        boolean b57 = defaultedMap53.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        java.util.Set set64 = defaultedMap60.keySet();
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap60.remove(obj65);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap60);
        defaultedMap43.putAll((java.util.Map) defaultedMap60);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b73 = defaultedMap72.isEmpty();
        boolean b75 = defaultedMap72.containsKey((java.lang.Object) (-1L));
        java.util.Set set76 = defaultedMap72.keySet();
        defaultedMap72.clear();
        int i78 = defaultedMap72.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj80 = defaultedMap43.get((java.lang.Object) defaultedMap70);
        java.lang.Object obj81 = defaultedMap7.put(obj41, (java.lang.Object) defaultedMap70);
        java.lang.Object obj82 = defaultedMap3.remove(obj41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + "" + "'", obj80.equals(""));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) '4');
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection10 = defaultedMap5.values();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) '4');
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.util.Set set26 = defaultedMap22.keySet();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap22.remove(obj27);
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap22);
        defaultedMap5.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) '4');
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj39 = null;
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj39);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) '4');
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) set50);
        java.util.Collection collection52 = defaultedMap51.values();
        defaultedMap51.clear();
        boolean b54 = defaultedMap43.containsValue((java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = defaultedMap32.get((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        java.util.Set set61 = defaultedMap57.keySet();
        java.lang.Object obj62 = defaultedMap32.remove((java.lang.Object) defaultedMap57);
        boolean b63 = defaultedMap5.containsValue((java.lang.Object) defaultedMap32);
        boolean b64 = defaultedMap1.containsValue((java.lang.Object) b63);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) '4');
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) (short) -1);
        boolean b14 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Set set4 = defaultedMap3.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        boolean b7 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        java.util.Set set30 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        java.util.Collection collection32 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) '4');
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.util.Set set45 = defaultedMap41.keySet();
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap41.remove(obj46);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) set52);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) '4');
        java.lang.Object obj59 = defaultedMap41.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap53);
        java.lang.Object obj60 = defaultedMap1.remove(obj59);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        java.util.Set set30 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        collections.Predicate predicate32 = null;
        collections.Predicate predicate33 = null;
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate33);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        defaultedMap23.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj12);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap24.values();
        defaultedMap24.clear();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) '4');
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection36 = defaultedMap31.values();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) '4');
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection50 = defaultedMap45.values();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        java.util.Set set62 = defaultedMap58.keySet();
        defaultedMap58.clear();
        int i64 = defaultedMap58.size();
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) '4');
        boolean b71 = defaultedMap67.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj72 = null;
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, obj72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap75.clear();
        java.lang.Object obj77 = defaultedMap58.put(obj72, (java.lang.Object) defaultedMap75);
        boolean b78 = defaultedMap1.containsValue(obj72);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b14 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.util.Collection collection15 = defaultedMap12.values();
        boolean b16 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (short) 100);
        java.util.Set set23 = defaultedMap20.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap20);
        boolean b26 = defaultedMap20.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection12 = defaultedMap7.values();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap24.remove(obj29);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap24);
        defaultedMap7.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) '4');
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj41 = null;
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, obj41);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) '4');
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) set52);
        java.util.Collection collection54 = defaultedMap53.values();
        defaultedMap53.clear();
        boolean b56 = defaultedMap45.containsValue((java.lang.Object) defaultedMap53);
        java.lang.Object obj57 = defaultedMap34.get((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        java.util.Set set63 = defaultedMap59.keySet();
        java.lang.Object obj64 = defaultedMap34.remove((java.lang.Object) defaultedMap59);
        boolean b65 = defaultedMap7.containsValue((java.lang.Object) defaultedMap34);
        java.lang.Object obj66 = defaultedMap1.get((java.lang.Object) b65);
        boolean b67 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) ' ');
        defaultedMap28.clear();
        int i32 = defaultedMap28.size();
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) i32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        int i6 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) '4');
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) set15);
        java.util.Collection collection17 = defaultedMap16.values();
        defaultedMap16.clear();
        boolean b19 = defaultedMap8.containsValue((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) predicate6, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) '4');
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection28 = defaultedMap23.values();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.util.Set set44 = defaultedMap40.keySet();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap40.remove(obj45);
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap40);
        defaultedMap23.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) '4');
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj57 = null;
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, obj57);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) '4');
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set68 = defaultedMap67.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) set68);
        java.util.Collection collection70 = defaultedMap69.values();
        defaultedMap69.clear();
        boolean b72 = defaultedMap61.containsValue((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap50.get((java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b76 = defaultedMap75.isEmpty();
        boolean b78 = defaultedMap75.containsKey((java.lang.Object) (-1L));
        java.util.Set set79 = defaultedMap75.keySet();
        java.lang.Object obj80 = defaultedMap50.remove((java.lang.Object) defaultedMap75);
        defaultedMap50.clear();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) defaultedMap50);
        java.lang.Object obj83 = defaultedMap3.get((java.lang.Object) map82);
        java.util.Set set84 = defaultedMap3.entrySet();
        collections.Factory factory85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(set84);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap9.values();
        defaultedMap9.clear();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) '4');
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap29.clear();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap10.get((java.lang.Object) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) '4');
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        java.util.Set set47 = defaultedMap43.keySet();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap43.remove(obj48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) '4');
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        java.util.Set set63 = defaultedMap59.keySet();
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap59.remove(obj64);
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) '4');
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection73 = defaultedMap68.values();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate75);
        java.lang.Object obj77 = defaultedMap52.get((java.lang.Object) defaultedMap68);
        java.util.Collection collection78 = defaultedMap68.values();
        boolean b79 = defaultedMap36.equals((java.lang.Object) defaultedMap68);
        java.lang.Object obj80 = defaultedMap29.get((java.lang.Object) defaultedMap68);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) '4');
        boolean b86 = defaultedMap82.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj87 = null;
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, obj87);
        java.lang.Object obj89 = defaultedMap1.put((java.lang.Object) defaultedMap68, (java.lang.Object) defaultedMap82);
        java.lang.Object obj90 = null;
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap(obj90);
        boolean b92 = defaultedMap91.isEmpty();
        boolean b93 = defaultedMap68.equals((java.lang.Object) defaultedMap91);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        defaultedMap20.clear();
        java.lang.String str26 = defaultedMap20.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) '4');
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap29.clear();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap10.get((java.lang.Object) defaultedMap29);
        java.lang.String str34 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) '4');
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj43 = null;
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj43);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) '4');
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set54 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) set54);
        java.util.Collection collection56 = defaultedMap55.values();
        defaultedMap55.clear();
        boolean b58 = defaultedMap47.containsValue((java.lang.Object) defaultedMap55);
        java.lang.Object obj59 = defaultedMap36.get((java.lang.Object) defaultedMap55);
        java.lang.Object obj61 = defaultedMap36.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b66 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        java.util.Set set67 = defaultedMap63.keySet();
        defaultedMap63.clear();
        int i69 = defaultedMap63.size();
        boolean b70 = defaultedMap36.containsKey((java.lang.Object) defaultedMap63);
        boolean b71 = defaultedMap29.containsValue((java.lang.Object) b70);
        int i72 = defaultedMap29.size();
        boolean b73 = defaultedMap1.containsValue((java.lang.Object) defaultedMap29);
        java.lang.String str74 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        defaultedMap3.clear();
        boolean b7 = defaultedMap3.equals((java.lang.Object) ' ');
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap30.clear();
        int i36 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        int i39 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.clear();
        java.lang.String str43 = defaultedMap41.toString();
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) str43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.util.Set set18 = defaultedMap14.keySet();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap14.remove(obj19);
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) '4');
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj30 = null;
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj30);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection33 = defaultedMap23.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) collection33);
        boolean b35 = defaultedMap3.equals((java.lang.Object) collection33);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        java.util.Set set27 = defaultedMap8.entrySet();
        java.lang.Object obj29 = defaultedMap8.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1L + "'", obj4.equals(1L));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.util.Set set23 = defaultedMap19.keySet();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap19.remove(obj24);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj35 = null;
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection38 = defaultedMap28.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) collection38);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.util.Set set27 = defaultedMap17.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap24.remove(obj29);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection38 = defaultedMap33.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap17.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection43 = defaultedMap33.values();
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) '4');
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (-1L));
        java.util.Set set57 = defaultedMap53.keySet();
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap53.remove(obj58);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set64 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) set64);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) '4');
        java.lang.Object obj71 = defaultedMap53.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap65);
        boolean b73 = defaultedMap53.containsValue((java.lang.Object) "");
        defaultedMap1.putAll((java.util.Map) defaultedMap53);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap24.remove(obj29);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection38 = defaultedMap33.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap17.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection43 = defaultedMap33.values();
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap1.keySet();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        int i27 = defaultedMap1.size();
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) '4');
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) set31);
        java.util.Collection collection33 = defaultedMap32.values();
        defaultedMap32.clear();
        boolean b35 = defaultedMap24.containsValue((java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap24.isEmpty();
        java.lang.Object obj37 = defaultedMap20.remove((java.lang.Object) defaultedMap24);
        defaultedMap24.clear();
        defaultedMap24.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) '4');
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj12);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.util.Collection collection25 = defaultedMap24.values();
        defaultedMap24.clear();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) '4');
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection36 = defaultedMap31.values();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) '4');
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection50 = defaultedMap45.values();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate52);
        boolean b55 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) ' ');
        defaultedMap8.clear();
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) '4');
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.remove(obj26);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) '4');
        java.lang.Object obj39 = defaultedMap21.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap33);
        boolean b41 = defaultedMap21.containsValue((java.lang.Object) "");
        java.lang.Object obj42 = defaultedMap8.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b10 = defaultedMap7.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) '4');
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj21);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) '4');
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        java.util.Collection collection34 = defaultedMap33.values();
        defaultedMap33.clear();
        boolean b36 = defaultedMap25.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = defaultedMap14.get((java.lang.Object) defaultedMap33);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) '4');
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection45 = defaultedMap40.values();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate47);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) '4');
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection59 = defaultedMap54.values();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate51, predicate60);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b69 = defaultedMap66.equals((java.lang.Object) defaultedMap68);
        java.lang.Object obj71 = defaultedMap68.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) '4');
        boolean b78 = defaultedMap74.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection79 = defaultedMap74.values();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate81);
        java.lang.Object obj83 = defaultedMap68.put((java.lang.Object) true, (java.lang.Object) predicate80);
        boolean b84 = defaultedMap4.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj35 = null;
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) '4');
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) set46);
        java.util.Collection collection48 = defaultedMap47.values();
        defaultedMap47.clear();
        boolean b50 = defaultedMap39.containsValue((java.lang.Object) defaultedMap47);
        java.lang.Object obj51 = defaultedMap28.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (-1L));
        java.util.Set set57 = defaultedMap53.keySet();
        java.lang.Object obj58 = defaultedMap28.remove((java.lang.Object) defaultedMap53);
        boolean b59 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "" + "'", obj61.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) '4');
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection44 = defaultedMap39.values();
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) defaultedMap39, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) '4');
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection53 = defaultedMap48.values();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b62 = defaultedMap59.equals((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) '4');
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection69 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap61.put((java.lang.Object) defaultedMap64, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) '4');
        boolean b77 = defaultedMap73.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection78 = defaultedMap73.values();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate79, predicate80);
        boolean b82 = defaultedMap64.containsValue((java.lang.Object) predicate79);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate54, predicate79);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        java.lang.String str9 = defaultedMap5.toString();
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        int i14 = defaultedMap13.size();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) -1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 0.0f);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap4.put((java.lang.Object) 0L, (java.lang.Object) 100.0f);
        java.util.Collection collection23 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) set31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set31);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) set38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap39.equals((java.lang.Object) defaultedMap41);
        java.util.Collection collection44 = defaultedMap41.values();
        boolean b45 = defaultedMap33.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set48 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) set48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (short) 100);
        java.util.Set set52 = defaultedMap49.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap49);
        java.lang.Object obj54 = defaultedMap4.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap30.clear();
        int i36 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) '4');
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj45 = null;
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj45);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) set50);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        defaultedMap51.clear();
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection11 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap8.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection35 = defaultedMap30.values();
        boolean b36 = defaultedMap8.containsValue((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        java.util.Collection collection7 = defaultedMap4.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) '4');
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj11);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) '4');
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) set22);
        java.util.Collection collection24 = defaultedMap23.values();
        defaultedMap23.clear();
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = defaultedMap4.get((java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        java.util.Set set29 = defaultedMap23.entrySet();
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) '4');
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap29.clear();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap10.get((java.lang.Object) defaultedMap29);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) '4');
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        java.util.Set set47 = defaultedMap43.keySet();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap43.remove(obj48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) '4');
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        java.util.Set set63 = defaultedMap59.keySet();
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap59.remove(obj64);
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) '4');
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection73 = defaultedMap68.values();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate75);
        java.lang.Object obj77 = defaultedMap52.get((java.lang.Object) defaultedMap68);
        java.util.Collection collection78 = defaultedMap68.values();
        boolean b79 = defaultedMap36.equals((java.lang.Object) defaultedMap68);
        java.lang.Object obj80 = defaultedMap29.get((java.lang.Object) defaultedMap68);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) '4');
        boolean b86 = defaultedMap82.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj87 = null;
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, obj87);
        java.lang.Object obj89 = defaultedMap1.put((java.lang.Object) defaultedMap68, (java.lang.Object) defaultedMap82);
        java.util.Set set90 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(set90);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj35 = null;
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) '4');
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) set46);
        java.util.Collection collection48 = defaultedMap47.values();
        defaultedMap47.clear();
        boolean b50 = defaultedMap39.containsValue((java.lang.Object) defaultedMap47);
        java.lang.Object obj51 = defaultedMap28.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (-1L));
        java.util.Set set57 = defaultedMap53.keySet();
        java.lang.Object obj58 = defaultedMap28.remove((java.lang.Object) defaultedMap53);
        defaultedMap28.clear();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap28);
        java.lang.Object obj62 = defaultedMap18.remove((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection8 = defaultedMap3.values();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) '4');
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap20.keySet();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap20.remove(obj25);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap20);
        defaultedMap3.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.util.Set set36 = defaultedMap32.keySet();
        defaultedMap32.clear();
        int i38 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap3.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        int i42 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        java.util.Collection collection11 = defaultedMap10.values();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) -1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 0.0f);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b21 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        java.util.Collection collection22 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) '4');
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        java.util.Set set35 = defaultedMap31.keySet();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap31.remove(obj36);
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set42 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) set42);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) '4');
        java.lang.Object obj49 = defaultedMap31.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) '4');
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) 1.0d);
        boolean b58 = defaultedMap43.equals((java.lang.Object) defaultedMap51);
        java.lang.Object obj59 = defaultedMap4.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap43);
        java.lang.String str60 = defaultedMap4.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{{}={-1.0=0.0}}" + "'", str60.equals("{{}={-1.0=0.0}}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap30.clear();
        int i36 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) '4');
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj44 = null;
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap47.clear();
        java.lang.Object obj49 = defaultedMap30.put(obj44, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) defaultedMap47);
        int i52 = defaultedMap47.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) '4');
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.util.Collection collection14 = defaultedMap13.values();
        defaultedMap13.clear();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 0);
        int i19 = defaultedMap5.size();
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.util.Collection collection24 = defaultedMap21.values();
        boolean b25 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (short) 100);
        java.util.Set set32 = defaultedMap29.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap29);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap29);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) defaultedMap10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) '4');
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap24.remove(obj29);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection38 = defaultedMap33.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap17.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection43 = defaultedMap33.values();
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        int i45 = defaultedMap33.size();
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) -1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 0.0f);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap4.put((java.lang.Object) 0L, (java.lang.Object) 100.0f);
        boolean b23 = defaultedMap4.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.util.Set set16 = defaultedMap12.keySet();
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) "hi!");
        java.util.Set set20 = defaultedMap12.keySet();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1L + "'", obj19.equals(1L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1L + "'", obj23.equals(1L));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) set7);
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap9.equals((java.lang.Object) defaultedMap11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set14 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) ' ');
        defaultedMap12.clear();
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) '4');
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap25.remove(obj30);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) '4');
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.util.Set set45 = defaultedMap41.keySet();
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap41.remove(obj46);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) '4');
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection55 = defaultedMap50.values();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap34.get((java.lang.Object) defaultedMap50);
        java.util.Collection collection60 = defaultedMap50.values();
        boolean b61 = defaultedMap18.equals((java.lang.Object) defaultedMap50);
        java.lang.Object obj62 = defaultedMap12.put(obj16, (java.lang.Object) b61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        java.util.Set set68 = defaultedMap64.keySet();
        java.util.Set set69 = defaultedMap64.keySet();
        boolean b70 = defaultedMap12.equals((java.lang.Object) set69);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set69);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) '4');
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap18.remove(obj23);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap27.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap9.values();
        defaultedMap9.clear();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.util.Set set13 = defaultedMap9.entrySet();
        java.lang.String str14 = defaultedMap9.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) set6);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set13 = defaultedMap7.entrySet();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) '4');
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b35 = defaultedMap20.equals((java.lang.Object) defaultedMap28);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.util.Set set44 = defaultedMap40.keySet();
        defaultedMap40.clear();
        int i46 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) '4');
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj54 = null;
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap57.clear();
        java.lang.Object obj59 = defaultedMap40.put(obj54, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap57);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap60);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) '4');
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.util.Collection collection14 = defaultedMap13.values();
        defaultedMap13.clear();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap13);
        java.util.Set set17 = defaultedMap5.keySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) set17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 10 + "'", obj18.equals((byte) 10));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) '4');
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) set15);
        java.util.Collection collection17 = defaultedMap16.values();
        defaultedMap16.clear();
        boolean b19 = defaultedMap8.containsValue((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) predicate6, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) '4');
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection28 = defaultedMap23.values();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) '4');
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.util.Set set44 = defaultedMap40.keySet();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap40.remove(obj45);
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap40);
        defaultedMap23.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) '4');
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj57 = null;
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, obj57);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) '4');
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set68 = defaultedMap67.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) set68);
        java.util.Collection collection70 = defaultedMap69.values();
        defaultedMap69.clear();
        boolean b72 = defaultedMap61.containsValue((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap50.get((java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b76 = defaultedMap75.isEmpty();
        boolean b78 = defaultedMap75.containsKey((java.lang.Object) (-1L));
        java.util.Set set79 = defaultedMap75.keySet();
        java.lang.Object obj80 = defaultedMap50.remove((java.lang.Object) defaultedMap75);
        defaultedMap50.clear();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) defaultedMap50);
        java.lang.Object obj83 = defaultedMap3.get((java.lang.Object) map82);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) map82);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b87 = defaultedMap86.isEmpty();
        boolean b89 = defaultedMap86.containsKey((java.lang.Object) (-1L));
        java.util.Set set90 = defaultedMap86.keySet();
        java.lang.String str91 = defaultedMap86.toString();
        boolean b92 = defaultedMap84.containsValue((java.lang.Object) defaultedMap86);
        java.util.Set set93 = defaultedMap86.keySet();
        java.util.Set set94 = defaultedMap86.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNotNull(set94);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        java.util.Set set23 = defaultedMap3.keySet();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) set27);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) '4');
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) set39);
        java.util.Collection collection41 = defaultedMap40.values();
        defaultedMap40.clear();
        boolean b43 = defaultedMap32.containsValue((java.lang.Object) defaultedMap40);
        boolean b44 = defaultedMap28.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) (-1L));
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Set set51 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) '4');
        boolean b57 = defaultedMap53.containsKey((java.lang.Object) (short) 10);
        java.util.Collection collection58 = defaultedMap53.values();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) '4');
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b71 = defaultedMap70.isEmpty();
        boolean b73 = defaultedMap70.containsKey((java.lang.Object) (-1L));
        java.util.Set set74 = defaultedMap70.keySet();
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap70.remove(obj75);
        java.lang.Object obj77 = defaultedMap63.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap70);
        defaultedMap53.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b85 = defaultedMap82.containsKey((java.lang.Object) (-1L));
        java.util.Set set86 = defaultedMap82.keySet();
        defaultedMap82.clear();
        int i88 = defaultedMap82.size();
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        java.lang.Object obj90 = defaultedMap53.get((java.lang.Object) defaultedMap80);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap53);
        java.lang.Object obj92 = defaultedMap28.remove((java.lang.Object) map91);
        java.lang.Object obj93 = defaultedMap3.get((java.lang.Object) defaultedMap28);
        java.util.Set set94 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "" + "'", obj90.equals(""));
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 1L + "'", obj93.equals(1L));
        org.junit.Assert.assertNotNull(set94);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.util.Set set7 = defaultedMap3.keySet();
        defaultedMap3.clear();
        int i9 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap3.put(obj17, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) '4');
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) set31);
        java.util.Collection collection33 = defaultedMap32.values();
        defaultedMap32.clear();
        boolean b35 = defaultedMap24.containsValue((java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap24.isEmpty();
        java.lang.Object obj37 = defaultedMap20.remove((java.lang.Object) defaultedMap24);
        boolean b38 = defaultedMap20.isEmpty();
        boolean b39 = defaultedMap20.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) -1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 0.0f);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Set set14 = defaultedMap4.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) '4');
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj24);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap8.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        java.util.Set set33 = defaultedMap29.keySet();
        java.lang.String str34 = defaultedMap29.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.util.Set set36 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.util.Set set13 = defaultedMap9.keySet();
        defaultedMap9.clear();
        int i15 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) '4');
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj23 = null;
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.clear();
        java.lang.Object obj28 = defaultedMap9.put(obj23, (java.lang.Object) defaultedMap26);
        java.util.Set set29 = defaultedMap9.keySet();
        boolean b30 = defaultedMap3.containsValue((java.lang.Object) set29);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) '4');
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) '4');
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.util.Collection collection21 = defaultedMap20.values();
        defaultedMap20.clear();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        defaultedMap20.clear();
        java.util.Set set26 = defaultedMap20.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 10);
        int i7 = defaultedMap3.size();
        boolean b8 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.remove(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) '4');
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj24);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap8.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        java.util.Set set33 = defaultedMap29.keySet();
        java.lang.String str34 = defaultedMap29.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap29);
        java.lang.String str36 = defaultedMap29.toString();
        java.util.Set set37 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) '4');
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) (short) 10);
        java.lang.Object obj46 = null;
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, obj46);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) '4');
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set57 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) set57);
        java.util.Collection collection59 = defaultedMap58.values();
        defaultedMap58.clear();
        boolean b61 = defaultedMap50.containsValue((java.lang.Object) defaultedMap58);
        java.lang.Object obj62 = defaultedMap39.get((java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        java.util.Set set68 = defaultedMap64.keySet();
        java.lang.Object obj69 = defaultedMap39.remove((java.lang.Object) defaultedMap64);
        boolean b70 = defaultedMap29.containsKey(obj69);
        java.util.Collection collection71 = defaultedMap29.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "" + "'", obj62.equals(""));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
    }
}

