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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.isEmpty();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap1.equals((java.lang.Object) b4);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 0.0f);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        boolean b12 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        int i9 = defaultedMap8.size();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj11);
        boolean b13 = defaultedMap1.containsValue(obj11);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) set4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) '#');
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b6 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i9 = defaultedMap8.size();
        defaultedMap8.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) defaultedMap5, (java.lang.Object) predicate12);
        try {
            java.util.Map map14 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        int i22 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i13 = defaultedMap12.size();
        defaultedMap12.clear();
        boolean b15 = defaultedMap9.equals((java.lang.Object) defaultedMap12);
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.keySet();
        boolean b13 = defaultedMap6.isEmpty();
        java.util.Set set14 = defaultedMap6.keySet();
        boolean b15 = defaultedMap4.equals((java.lang.Object) set14);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i18 = defaultedMap17.size();
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) i18);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 10);
        boolean b30 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        int i35 = defaultedMap34.size();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) "hi!");
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj37);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        boolean b20 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        int i4 = defaultedMap1.size();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.String str29 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{null={}}" + "'", str29.equals("{null={}}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj2 = null;
        java.lang.Object obj4 = defaultedMap1.put(obj2, (java.lang.Object) ' ');
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) ' ');
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        int i18 = defaultedMap17.size();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) "hi!");
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.lang.Object obj27 = defaultedMap7.put(obj20, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b32 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i35 = defaultedMap34.size();
        defaultedMap34.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj39 = defaultedMap29.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate38);
        boolean b40 = defaultedMap7.containsValue(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        int i45 = defaultedMap44.size();
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) "hi!");
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, obj47);
        java.lang.Object obj49 = defaultedMap7.get((java.lang.Object) defaultedMap42);
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) (short) 0);
        java.util.Set set5 = defaultedMap2.entrySet();
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap6.equals((java.lang.Object) b11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        int i33 = defaultedMap32.size();
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) "hi!");
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = defaultedMap22.put(obj35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b45 = defaultedMap44.isEmpty();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.util.Set set47 = defaultedMap44.keySet();
        java.util.Set set48 = defaultedMap44.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap44);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap44);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap2.containsKey(obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.containsKey(obj10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        try {
            java.util.Map map15 = collections.map.PredicatedMap.decorate(map0, predicate5, predicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i31 = defaultedMap30.size();
        defaultedMap30.clear();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0f);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) "");
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (short) 0);
        java.util.Set set43 = defaultedMap40.entrySet();
        java.lang.Object obj44 = defaultedMap34.remove((java.lang.Object) defaultedMap40);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate45, predicate46);
        boolean b48 = defaultedMap30.equals((java.lang.Object) predicate45);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (short) 0);
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) ' ');
        java.util.Collection collection55 = defaultedMap50.values();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b60 = defaultedMap59.isEmpty();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b66 = defaultedMap65.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate62, predicate67);
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate67, predicate71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (short) 0);
        java.util.Set set77 = defaultedMap74.entrySet();
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) (short) 0);
        java.lang.Object obj83 = defaultedMap79.get((java.lang.Object) ' ');
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) ' ');
        java.lang.Object obj85 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) map84);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '4');
        java.util.Map map88 = null;
        try {
            defaultedMap30.putAll(map88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Set set15 = defaultedMap9.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) defaultedMap11);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) predicate16);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        java.util.Collection collection26 = defaultedMap21.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate38);
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate38, predicate42);
        java.util.Set set44 = defaultedMap1.entrySet();
        boolean b45 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) predicate10);
        java.lang.String str12 = defaultedMap3.toString();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap25.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap3.containsValue((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i46 = defaultedMap45.size();
        defaultedMap45.clear();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj49 = defaultedMap3.get((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0d + "'", obj49.equals(100.0d));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap6.containsKey(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate9, predicate10);
        defaultedMap1.putAll(map11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) predicate10);
        java.lang.String str12 = defaultedMap3.toString();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap25.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap3.containsValue((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Set set44 = defaultedMap42.entrySet();
        boolean b45 = defaultedMap25.containsKey((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Set set23 = defaultedMap17.keySet();
        boolean b24 = defaultedMap17.isEmpty();
        boolean b26 = defaultedMap17.equals((java.lang.Object) 1L);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap17.remove(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap30.equals((java.lang.Object) '#');
        java.lang.Object obj35 = defaultedMap17.get((java.lang.Object) b34);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap1.put(obj35, obj36);
        int i38 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        boolean b27 = defaultedMap23.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        java.util.Collection collection35 = defaultedMap30.values();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (byte) 10);
        boolean b38 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        int i43 = defaultedMap42.size();
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) "hi!");
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj45);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj45);
        boolean b48 = defaultedMap30.isEmpty();
        boolean b49 = defaultedMap28.containsKey((java.lang.Object) defaultedMap30);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) defaultedMap30);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.util.Collection collection18 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        int i24 = defaultedMap21.size();
        java.util.Set set25 = defaultedMap21.keySet();
        boolean b26 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Set set30 = defaultedMap28.entrySet();
        java.util.Set set31 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap28.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i42 = defaultedMap41.size();
        defaultedMap41.clear();
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) defaultedMap38, (java.lang.Object) predicate45);
        java.lang.String str47 = defaultedMap38.toString();
        defaultedMap28.putAll((java.util.Map) defaultedMap38);
        boolean b49 = defaultedMap21.equals((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b24 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 10);
        boolean b16 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        int i21 = defaultedMap20.size();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj23);
        boolean b26 = defaultedMap8.isEmpty();
        boolean b27 = defaultedMap6.containsKey((java.lang.Object) defaultedMap8);
        java.util.Set set28 = defaultedMap6.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) "");
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        java.util.Set set18 = defaultedMap12.keySet();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.util.Set set21 = defaultedMap6.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate21, predicate22);
        boolean b24 = defaultedMap6.equals((java.lang.Object) predicate21);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        java.util.Collection collection31 = defaultedMap26.values();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate38, predicate43);
        collections.Predicate predicate47 = null;
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate43, predicate47);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) predicate47);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 0);
        java.util.Set set54 = defaultedMap51.entrySet();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (short) 0);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) ' ');
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) (short) 0);
        java.util.Set set5 = defaultedMap2.entrySet();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) ' ');
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (short) 0);
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap13.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap26.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap30.containsKey(obj31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b40 = defaultedMap39.isEmpty();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        try {
            java.util.Map map44 = collections.map.PredicatedMap.decorate(map0, predicate34, predicate41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i10 = defaultedMap9.size();
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap13.isEmpty();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.util.Set set16 = defaultedMap13.keySet();
        java.util.Set set17 = defaultedMap13.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.lang.Object obj25 = defaultedMap19.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) collection28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 0);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        boolean b36 = defaultedMap31.isEmpty();
        int i37 = defaultedMap31.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap31);
        boolean b39 = defaultedMap13.containsValue((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap9.equals((java.lang.Object) defaultedMap31);
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        int i5 = defaultedMap1.size();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.String str7 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Set set6 = defaultedMap4.entrySet();
        java.util.Set set7 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        int i18 = defaultedMap12.size();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        boolean b26 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        boolean b34 = defaultedMap29.isEmpty();
        int i35 = defaultedMap29.size();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (short) 0);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        defaultedMap29.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap37.remove(obj43);
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) '4');
        boolean b48 = defaultedMap37.equals((java.lang.Object) "");
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 10);
        boolean b30 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        int i35 = defaultedMap34.size();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) "hi!");
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj37);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        boolean b41 = defaultedMap22.isEmpty();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        boolean b48 = defaultedMap43.isEmpty();
        int i49 = defaultedMap43.size();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 0);
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) ' ');
        defaultedMap43.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj57 = defaultedMap22.get((java.lang.Object) defaultedMap51);
        defaultedMap22.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        defaultedMap1.clear();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        boolean b19 = defaultedMap14.isEmpty();
        int i20 = defaultedMap14.size();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        defaultedMap14.clear();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b9 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i12 = defaultedMap11.size();
        defaultedMap11.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj16 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) predicate15);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap25.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 0);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (short) 0);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) ' ');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 0);
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (short) 0);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap40.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap53.toString();
        boolean b56 = defaultedMap25.containsKey((java.lang.Object) str55);
        java.util.Collection collection57 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.String str10 = defaultedMap5.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap25.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 0);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (short) 0);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) ' ');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 0);
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (short) 0);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap40.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap53.toString();
        boolean b56 = defaultedMap25.containsKey((java.lang.Object) str55);
        boolean b57 = defaultedMap25.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) false);
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0d + "'", obj9.equals(100.0d));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate21, predicate22);
        boolean b24 = defaultedMap6.equals((java.lang.Object) predicate21);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        java.util.Collection collection31 = defaultedMap26.values();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate38, predicate43);
        collections.Predicate predicate47 = null;
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate43, predicate47);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) predicate47);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 0);
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) ' ');
        java.lang.Object obj57 = defaultedMap51.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        int i62 = defaultedMap61.size();
        java.lang.Object obj64 = defaultedMap61.get((java.lang.Object) "hi!");
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Set set69 = defaultedMap67.entrySet();
        java.util.Set set70 = defaultedMap67.keySet();
        java.lang.Object obj71 = defaultedMap51.put(obj64, (java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b74 = defaultedMap73.isEmpty();
        java.util.Set set75 = defaultedMap73.entrySet();
        java.util.Set set76 = defaultedMap73.keySet();
        java.util.Set set77 = defaultedMap73.entrySet();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap73);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b83 = defaultedMap82.isEmpty();
        java.util.Set set84 = defaultedMap82.entrySet();
        java.util.Set set85 = defaultedMap82.keySet();
        java.lang.Object obj87 = defaultedMap80.put((java.lang.Object) defaultedMap82, (java.lang.Object) (short) 10);
        boolean b88 = defaultedMap51.containsValue((java.lang.Object) defaultedMap82);
        java.util.Set set89 = defaultedMap82.entrySet();
        java.lang.Object obj90 = defaultedMap1.get((java.lang.Object) defaultedMap82);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        java.util.Collection collection30 = defaultedMap25.values();
        java.util.Set set31 = defaultedMap25.entrySet();
        java.lang.Object obj32 = defaultedMap9.get((java.lang.Object) set31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i6 = defaultedMap5.size();
        defaultedMap5.clear();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) "");
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (short) 0);
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap15);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate20, predicate21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) predicate20);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        java.util.Collection collection30 = defaultedMap25.values();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b41 = defaultedMap40.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate37, predicate42);
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate42, predicate46);
        defaultedMap1.putAll(map47);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.lang.Object obj20 = defaultedMap13.put((java.lang.Object) 100L, (java.lang.Object) 0.0f);
        boolean b21 = defaultedMap1.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i14 = defaultedMap13.size();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        java.lang.Object obj29 = defaultedMap23.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) collection32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        boolean b40 = defaultedMap35.isEmpty();
        int i41 = defaultedMap35.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap35);
        boolean b43 = defaultedMap17.containsValue((java.lang.Object) defaultedMap35);
        boolean b44 = defaultedMap13.equals((java.lang.Object) defaultedMap35);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) b44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap22.containsKey(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        boolean b28 = defaultedMap20.containsKey((java.lang.Object) predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate26);
        java.lang.String str30 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (short) 0);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        java.lang.Object obj43 = defaultedMap37.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) collection46);
        java.lang.Object obj48 = defaultedMap32.put((java.lang.Object) (byte) 0, (java.lang.Object) collection46);
        java.lang.Object obj49 = new java.lang.Object();
        boolean b50 = defaultedMap32.containsValue(obj49);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap1.equals(obj12);
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.util.Collection collection12 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i36 = defaultedMap35.size();
        boolean b37 = defaultedMap33.equals((java.lang.Object) i36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0f);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) "");
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap39.equals(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Set set49 = defaultedMap47.entrySet();
        java.lang.Object obj50 = defaultedMap39.get((java.lang.Object) set49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, obj50);
        java.util.Collection collection52 = defaultedMap33.values();
        boolean b53 = defaultedMap18.containsKey((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) map15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        boolean b27 = defaultedMap23.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        java.util.Collection collection35 = defaultedMap30.values();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (byte) 10);
        boolean b38 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        int i43 = defaultedMap42.size();
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) "hi!");
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj45);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj45);
        boolean b48 = defaultedMap30.isEmpty();
        boolean b49 = defaultedMap28.containsKey((java.lang.Object) defaultedMap30);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) defaultedMap30);
        java.util.Set set51 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) "");
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        java.util.Set set18 = defaultedMap12.keySet();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.util.Collection collection18 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Set set23 = defaultedMap21.entrySet();
        java.util.Set set24 = defaultedMap21.keySet();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap5.entrySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 0);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap16.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap29);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i35 = defaultedMap34.size();
        defaultedMap34.clear();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) "");
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (short) 0);
        java.util.Set set47 = defaultedMap44.entrySet();
        java.lang.Object obj48 = defaultedMap38.remove((java.lang.Object) defaultedMap44);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate49, predicate50);
        boolean b52 = defaultedMap34.equals((java.lang.Object) predicate49);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        int i4 = defaultedMap3.size();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) "hi!");
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i13 = defaultedMap12.size();
        defaultedMap12.clear();
        boolean b15 = defaultedMap9.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0f);
        int i23 = defaultedMap20.size();
        boolean b24 = defaultedMap17.equals((java.lang.Object) i23);
        boolean b25 = defaultedMap17.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (short) 0);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        boolean b33 = defaultedMap28.isEmpty();
        java.lang.Object obj34 = defaultedMap17.get((java.lang.Object) defaultedMap28);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap1.isEmpty();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) collection23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap26.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj36 = defaultedMap26.get((java.lang.Object) collection35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (short) 0);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        boolean b43 = defaultedMap38.isEmpty();
        int i44 = defaultedMap38.size();
        defaultedMap26.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (short) 0);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Collection collection52 = defaultedMap47.values();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 10);
        boolean b55 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        int i60 = defaultedMap59.size();
        java.lang.Object obj62 = defaultedMap59.get((java.lang.Object) "hi!");
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, obj62);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, obj62);
        boolean b65 = defaultedMap26.containsKey((java.lang.Object) defaultedMap47);
        boolean b66 = defaultedMap47.isEmpty();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (short) 0);
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) ' ');
        boolean b73 = defaultedMap68.isEmpty();
        int i74 = defaultedMap68.size();
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (short) 0);
        java.lang.Object obj80 = defaultedMap76.get((java.lang.Object) ' ');
        defaultedMap68.putAll((java.util.Map) defaultedMap76);
        java.lang.Object obj82 = defaultedMap47.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj83 = defaultedMap1.put(obj24, (java.lang.Object) defaultedMap47);
        collections.Factory factory84 = null;
        try {
            java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, factory84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        int i4 = defaultedMap3.size();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) "hi!");
        int i7 = defaultedMap3.size();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) 10.0f);
        boolean b12 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        int i16 = defaultedMap10.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.util.Collection collection21 = defaultedMap13.values();
        boolean b22 = defaultedMap3.equals((java.lang.Object) collection21);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i31 = defaultedMap30.size();
        defaultedMap30.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj35 = defaultedMap25.put((java.lang.Object) defaultedMap27, (java.lang.Object) predicate34);
        java.lang.String str36 = defaultedMap27.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (short) 0);
        java.util.Set set41 = defaultedMap38.entrySet();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 0);
        java.util.Set set54 = defaultedMap51.entrySet();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (short) 0);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) ' ');
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap49.putAll((java.util.Map) defaultedMap62);
        boolean b64 = defaultedMap27.containsValue((java.lang.Object) defaultedMap49);
        defaultedMap9.putAll((java.util.Map) defaultedMap27);
        boolean b66 = defaultedMap27.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) "");
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        java.util.Set set18 = defaultedMap12.keySet();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "");
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) defaultedMap11);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) predicate16);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        java.util.Collection collection26 = defaultedMap21.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate38);
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate38, predicate42);
        java.util.Set set44 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) ' ');
        boolean b12 = defaultedMap7.isEmpty();
        java.util.Set set13 = defaultedMap7.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0f);
        int i15 = defaultedMap12.size();
        boolean b16 = defaultedMap9.equals((java.lang.Object) i15);
        boolean b17 = defaultedMap9.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap20);
        defaultedMap20.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (short) 0);
        java.util.Set set41 = defaultedMap38.entrySet();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap36.putAll((java.util.Map) defaultedMap49);
        java.lang.String str51 = defaultedMap49.toString();
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj54 = null;
        boolean b55 = defaultedMap53.containsKey(obj54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate57, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate57, predicate61);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap22.containsKey(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        boolean b28 = defaultedMap20.containsKey((java.lang.Object) predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate26);
        java.util.Set set30 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) (short) 0);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 'a');
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b6 = defaultedMap5.isEmpty();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Set set9 = defaultedMap5.entrySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap11.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) collection20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        boolean b28 = defaultedMap23.isEmpty();
        int i29 = defaultedMap23.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap23);
        boolean b31 = defaultedMap5.containsValue((java.lang.Object) defaultedMap23);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap23);
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) collection23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) collection23);
        java.lang.Object obj26 = new java.lang.Object();
        boolean b27 = defaultedMap9.containsValue(obj26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj26);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 0);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        boolean b10 = defaultedMap5.isEmpty();
        java.util.Set set11 = defaultedMap5.keySet();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Set set17 = defaultedMap14.keySet();
        java.util.Set set18 = defaultedMap14.entrySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) collection29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        boolean b37 = defaultedMap32.isEmpty();
        int i38 = defaultedMap32.size();
        defaultedMap20.putAll((java.util.Map) defaultedMap32);
        boolean b40 = defaultedMap14.containsValue((java.lang.Object) defaultedMap32);
        java.util.Collection collection41 = defaultedMap14.values();
        java.lang.Object obj42 = defaultedMap5.remove((java.lang.Object) defaultedMap14);
        java.util.Set set43 = defaultedMap14.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Set set10 = defaultedMap6.entrySet();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        java.lang.Object obj18 = defaultedMap12.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) collection21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 0);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) ' ');
        boolean b29 = defaultedMap24.isEmpty();
        int i30 = defaultedMap24.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap24);
        boolean b32 = defaultedMap6.containsValue((java.lang.Object) defaultedMap24);
        java.util.Collection collection33 = defaultedMap6.values();
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        java.util.Collection collection14 = defaultedMap9.values();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        java.lang.Object obj22 = defaultedMap16.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) collection25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (short) 0);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        boolean b33 = defaultedMap28.isEmpty();
        int i34 = defaultedMap28.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 10);
        boolean b16 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        int i21 = defaultedMap20.size();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj23);
        boolean b26 = defaultedMap8.isEmpty();
        boolean b27 = defaultedMap6.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        boolean b34 = defaultedMap29.isEmpty();
        int i35 = defaultedMap29.size();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (short) 0);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        defaultedMap29.putAll((java.util.Map) defaultedMap37);
        defaultedMap29.clear();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        int i46 = defaultedMap45.size();
        java.lang.Object obj48 = defaultedMap45.get((java.lang.Object) "hi!");
        int i49 = defaultedMap45.size();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 0);
        boolean b52 = defaultedMap29.equals((java.lang.Object) defaultedMap45);
        boolean b53 = defaultedMap8.equals((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Set set6 = defaultedMap3.keySet();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap3.toString();
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (short) 0);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) ' ');
        java.util.Collection collection9 = defaultedMap4.values();
        java.util.Set set10 = defaultedMap4.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap25.toString();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap29.containsKey(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate33, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (short) 0);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        int i49 = defaultedMap48.size();
        java.lang.Object obj51 = defaultedMap48.get((java.lang.Object) "hi!");
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b55 = defaultedMap54.isEmpty();
        java.util.Set set56 = defaultedMap54.entrySet();
        java.util.Set set57 = defaultedMap54.keySet();
        java.lang.Object obj58 = defaultedMap38.put(obj51, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b61 = defaultedMap60.isEmpty();
        java.util.Set set62 = defaultedMap60.entrySet();
        java.util.Set set63 = defaultedMap60.keySet();
        java.util.Set set64 = defaultedMap60.entrySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap60);
        java.lang.Object obj67 = defaultedMap38.get((java.lang.Object) 100.0d);
        java.lang.Object obj68 = defaultedMap25.get(obj67);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) (short) 0);
        java.lang.Object obj74 = defaultedMap70.get((java.lang.Object) ' ');
        java.util.Collection collection75 = defaultedMap70.values();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b80 = defaultedMap79.isEmpty();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate81, predicate82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b86 = defaultedMap85.isEmpty();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate82, predicate87);
        java.util.Set set91 = defaultedMap70.keySet();
        boolean b92 = defaultedMap25.containsValue((java.lang.Object) set91);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + ' ' + "'", obj68.equals(' '));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i29 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) defaultedMap25, (java.lang.Object) predicate32);
        boolean b34 = defaultedMap1.containsValue(obj33);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        int i24 = defaultedMap21.size();
        java.lang.Object obj26 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.String str27 = defaultedMap21.toString();
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        java.lang.Object obj36 = defaultedMap30.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        int i41 = defaultedMap40.size();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) "hi!");
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b47 = defaultedMap46.isEmpty();
        java.util.Set set48 = defaultedMap46.entrySet();
        java.util.Set set49 = defaultedMap46.keySet();
        java.lang.Object obj50 = defaultedMap30.put(obj43, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i58 = defaultedMap57.size();
        defaultedMap57.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj62 = defaultedMap52.put((java.lang.Object) defaultedMap54, (java.lang.Object) predicate61);
        boolean b63 = defaultedMap30.containsValue(obj62);
        java.util.Set set64 = defaultedMap30.keySet();
        boolean b65 = defaultedMap21.containsKey((java.lang.Object) set64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) ' ');
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        int i18 = defaultedMap17.size();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) "hi!");
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.lang.Object obj27 = defaultedMap7.put(obj20, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.util.Set set32 = defaultedMap29.keySet();
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj43 = defaultedMap36.put((java.lang.Object) defaultedMap38, (java.lang.Object) (short) 10);
        boolean b44 = defaultedMap7.containsValue((java.lang.Object) defaultedMap38);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Set set6 = defaultedMap4.entrySet();
        java.util.Set set7 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        int i18 = defaultedMap12.size();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        boolean b26 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i29 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) defaultedMap25, (java.lang.Object) predicate32);
        boolean b34 = defaultedMap1.containsValue(obj33);
        java.util.Collection collection35 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        java.lang.Object obj14 = defaultedMap8.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) collection17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        boolean b25 = defaultedMap20.isEmpty();
        int i26 = defaultedMap20.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap20);
        boolean b28 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection31 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection34 = defaultedMap33.values();
        boolean b35 = defaultedMap30.equals((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) b35);
        int i37 = defaultedMap1.size();
        boolean b38 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 0);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap24.putAll((java.util.Map) defaultedMap37);
        java.lang.String str39 = defaultedMap37.toString();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap41.containsKey(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (short) 0);
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) ' ');
        java.lang.Object obj56 = defaultedMap50.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        int i61 = defaultedMap60.size();
        java.lang.Object obj63 = defaultedMap60.get((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, obj63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b67 = defaultedMap66.isEmpty();
        java.util.Set set68 = defaultedMap66.entrySet();
        java.util.Set set69 = defaultedMap66.keySet();
        java.lang.Object obj70 = defaultedMap50.put(obj63, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b73 = defaultedMap72.isEmpty();
        java.util.Set set74 = defaultedMap72.entrySet();
        java.util.Set set75 = defaultedMap72.keySet();
        java.util.Set set76 = defaultedMap72.entrySet();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) defaultedMap72);
        java.lang.Object obj79 = defaultedMap50.get((java.lang.Object) 100.0d);
        java.lang.Object obj80 = defaultedMap37.get(obj79);
        java.lang.Object obj81 = defaultedMap1.get(obj80);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + ' ' + "'", obj80.equals(' '));
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        int i25 = defaultedMap24.size();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) "hi!");
        int i28 = defaultedMap24.size();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) defaultedMap24, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection35 = defaultedMap34.values();
        boolean b36 = defaultedMap22.containsValue((java.lang.Object) defaultedMap34);
        java.lang.Object obj37 = defaultedMap20.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap9.remove(obj15);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) '4');
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) (short) -1);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap22.containsKey(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b32 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i35 = defaultedMap34.size();
        defaultedMap34.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj39 = defaultedMap29.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate38);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 0);
        int i45 = defaultedMap42.size();
        java.util.Set set46 = defaultedMap42.keySet();
        boolean b47 = defaultedMap9.containsValue((java.lang.Object) set46);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        boolean b21 = defaultedMap16.isEmpty();
        int i22 = defaultedMap16.size();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 0);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) ' ');
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap24.remove(obj30);
        java.lang.Object obj33 = defaultedMap24.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.util.Set set20 = defaultedMap17.entrySet();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i31 = defaultedMap30.size();
        boolean b32 = defaultedMap28.equals((java.lang.Object) i31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0f);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) "");
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap34.equals(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Set set44 = defaultedMap42.entrySet();
        java.lang.Object obj45 = defaultedMap34.get((java.lang.Object) set44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, obj45);
        boolean b47 = defaultedMap10.containsKey(obj45);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        int i7 = defaultedMap4.size();
        boolean b8 = defaultedMap1.equals((java.lang.Object) i7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap11.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) collection20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        boolean b28 = defaultedMap23.isEmpty();
        int i29 = defaultedMap23.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.lang.Object obj38 = defaultedMap32.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        int i43 = defaultedMap42.size();
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) "hi!");
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b49 = defaultedMap48.isEmpty();
        java.util.Set set50 = defaultedMap48.entrySet();
        java.util.Set set51 = defaultedMap48.keySet();
        java.lang.Object obj52 = defaultedMap32.put(obj45, (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b55 = defaultedMap54.isEmpty();
        java.util.Set set56 = defaultedMap54.entrySet();
        java.util.Set set57 = defaultedMap54.keySet();
        java.util.Set set58 = defaultedMap54.entrySet();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap54);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap54);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) defaultedMap54);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        int i33 = defaultedMap32.size();
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) "hi!");
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = defaultedMap22.put(obj35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b45 = defaultedMap44.isEmpty();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.util.Set set47 = defaultedMap44.keySet();
        java.util.Set set48 = defaultedMap44.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap44);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap44);
        java.util.Set set51 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.util.Set set20 = defaultedMap15.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) defaultedMap14);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        boolean b18 = defaultedMap1.equals((java.lang.Object) predicateUtils17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i7 = defaultedMap6.size();
        defaultedMap6.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate21, predicate22);
        boolean b24 = defaultedMap6.equals((java.lang.Object) predicate21);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        java.util.Collection collection31 = defaultedMap26.values();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate38, predicate43);
        collections.Predicate predicate47 = null;
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate43, predicate47);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b52 = defaultedMap51.isEmpty();
        java.util.Set set53 = defaultedMap51.entrySet();
        boolean b54 = defaultedMap1.containsKey((java.lang.Object) set53);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b9 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i12 = defaultedMap11.size();
        defaultedMap11.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj16 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) predicate15);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap19.containsKey(obj20);
        java.util.Set set22 = defaultedMap19.entrySet();
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) set22);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.util.Set set35 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap30.put((java.lang.Object) defaultedMap32, (java.lang.Object) (short) 10);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap32);
        boolean b39 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        java.util.Collection collection30 = defaultedMap25.values();
        java.util.Set set31 = defaultedMap25.entrySet();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (short) 0);
        java.util.Set set36 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap25.put((java.lang.Object) set36, (java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 0);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) ' ');
        boolean b47 = defaultedMap42.isEmpty();
        java.util.Set set48 = defaultedMap42.keySet();
        boolean b49 = defaultedMap42.isEmpty();
        boolean b51 = defaultedMap42.equals((java.lang.Object) 1L);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap42.remove(obj52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        java.lang.Object obj61 = defaultedMap55.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection64 = defaultedMap63.values();
        java.lang.Object obj65 = defaultedMap55.get((java.lang.Object) collection64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (short) 0);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) ' ');
        boolean b72 = defaultedMap67.isEmpty();
        int i73 = defaultedMap67.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap67);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (short) 0);
        java.lang.Object obj80 = defaultedMap76.get((java.lang.Object) ' ');
        java.util.Collection collection81 = defaultedMap76.values();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) (byte) 10);
        boolean b84 = defaultedMap76.isEmpty();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj87 = null;
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap(obj87);
        int i89 = defaultedMap88.size();
        java.lang.Object obj91 = defaultedMap88.get((java.lang.Object) "hi!");
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap86, obj91);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, obj91);
        boolean b94 = defaultedMap55.containsKey((java.lang.Object) defaultedMap76);
        defaultedMap42.putAll((java.util.Map) defaultedMap76);
        boolean b96 = defaultedMap25.containsKey((java.lang.Object) defaultedMap42);
        defaultedMap1.putAll((java.util.Map) defaultedMap42);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap11.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) collection20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        boolean b28 = defaultedMap23.isEmpty();
        int i29 = defaultedMap23.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.lang.Object obj38 = defaultedMap32.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        int i43 = defaultedMap42.size();
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) "hi!");
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b49 = defaultedMap48.isEmpty();
        java.util.Set set50 = defaultedMap48.entrySet();
        java.util.Set set51 = defaultedMap48.keySet();
        java.lang.Object obj52 = defaultedMap32.put(obj45, (java.lang.Object) defaultedMap48);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (short) 0);
        boolean b58 = defaultedMap54.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (short) 0);
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) ' ');
        java.util.Collection collection66 = defaultedMap61.values();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) (byte) 10);
        boolean b69 = defaultedMap61.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        int i74 = defaultedMap73.size();
        java.lang.Object obj76 = defaultedMap73.get((java.lang.Object) "hi!");
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, obj76);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, obj76);
        boolean b79 = defaultedMap61.isEmpty();
        boolean b80 = defaultedMap59.containsKey((java.lang.Object) defaultedMap61);
        java.lang.Object obj81 = defaultedMap32.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj82 = defaultedMap1.put((java.lang.Object) defaultedMap23, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        int i4 = defaultedMap3.size();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) "hi!");
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 10);
        boolean b30 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        int i35 = defaultedMap34.size();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) "hi!");
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj37);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        boolean b41 = defaultedMap22.isEmpty();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        boolean b48 = defaultedMap43.isEmpty();
        int i49 = defaultedMap43.size();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 0);
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) ' ');
        defaultedMap43.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj57 = defaultedMap22.get((java.lang.Object) defaultedMap51);
        int i58 = defaultedMap22.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 0);
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        defaultedMap8.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        java.util.Collection collection26 = defaultedMap21.values();
        java.util.Set set27 = defaultedMap21.entrySet();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 0);
        java.util.Set set32 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj36 = defaultedMap21.put((java.lang.Object) set32, (java.lang.Object) defaultedMap34);
        java.lang.Object obj37 = defaultedMap8.remove(obj36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.lang.String str39 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap1.isEmpty();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        int i17 = defaultedMap14.size();
        defaultedMap14.clear();
        boolean b19 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap1.clear();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        int i18 = defaultedMap17.size();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) "hi!");
        int i21 = defaultedMap17.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 0);
        boolean b24 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        boolean b26 = defaultedMap1.equals((java.lang.Object) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.util.Set set35 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap30.put((java.lang.Object) defaultedMap32, (java.lang.Object) (short) 10);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap32);
        java.lang.String str39 = defaultedMap32.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap18.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) collection27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        boolean b35 = defaultedMap30.isEmpty();
        int i36 = defaultedMap30.size();
        defaultedMap18.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (short) 0);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) ' ');
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (byte) 10);
        boolean b47 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        int i52 = defaultedMap51.size();
        java.lang.Object obj54 = defaultedMap51.get((java.lang.Object) "hi!");
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, obj54);
        boolean b57 = defaultedMap18.containsKey((java.lang.Object) defaultedMap39);
        java.lang.Object obj58 = defaultedMap15.remove((java.lang.Object) b57);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (short) 0);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        java.lang.Object obj66 = defaultedMap60.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection69 = defaultedMap68.values();
        java.lang.Object obj70 = defaultedMap60.get((java.lang.Object) collection69);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) (short) 0);
        java.lang.Object obj76 = defaultedMap72.get((java.lang.Object) ' ');
        java.util.Collection collection77 = defaultedMap72.values();
        java.lang.Object obj78 = defaultedMap60.remove((java.lang.Object) defaultedMap72);
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) (short) 0);
        int i83 = defaultedMap80.size();
        java.util.Set set84 = defaultedMap80.keySet();
        boolean b85 = defaultedMap72.equals((java.lang.Object) defaultedMap80);
        defaultedMap15.putAll((java.util.Map) defaultedMap72);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        int i33 = defaultedMap32.size();
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) "hi!");
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = defaultedMap22.put(obj35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b45 = defaultedMap44.isEmpty();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.util.Set set47 = defaultedMap44.keySet();
        java.util.Set set48 = defaultedMap44.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap44);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap44);
        boolean b51 = defaultedMap44.isEmpty();
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap53.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap53);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (short) 0);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        java.util.Collection collection65 = defaultedMap60.values();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (byte) 10);
        boolean b68 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        int i73 = defaultedMap72.size();
        java.lang.Object obj75 = defaultedMap72.get((java.lang.Object) "hi!");
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, obj75);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, obj75);
        boolean b78 = defaultedMap60.isEmpty();
        boolean b79 = defaultedMap58.containsKey((java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b82 = defaultedMap81.isEmpty();
        java.util.Set set83 = defaultedMap81.entrySet();
        java.util.Set set84 = defaultedMap81.keySet();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b89 = defaultedMap88.isEmpty();
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i92 = defaultedMap91.size();
        defaultedMap91.clear();
        defaultedMap88.putAll((java.util.Map) defaultedMap91);
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj96 = defaultedMap86.put((java.lang.Object) defaultedMap88, (java.lang.Object) predicate95);
        boolean b97 = defaultedMap81.equals((java.lang.Object) defaultedMap88);
        java.lang.Object obj98 = defaultedMap44.put((java.lang.Object) defaultedMap58, (java.lang.Object) defaultedMap81);
        java.util.Collection collection99 = defaultedMap81.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNotNull(collection99);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        java.util.Set set19 = defaultedMap13.keySet();
        boolean b20 = defaultedMap13.isEmpty();
        boolean b22 = defaultedMap13.equals((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap13.entrySet();
        boolean b24 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        int i29 = defaultedMap28.size();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) "hi!");
        int i32 = defaultedMap28.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap26.put((java.lang.Object) defaultedMap28, (java.lang.Object) 10.0f);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap38.containsKey(obj39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 0);
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (short) 0);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (short) 0);
        java.util.Set set58 = defaultedMap55.entrySet();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (short) 0);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap53.putAll((java.util.Map) defaultedMap66);
        boolean b68 = defaultedMap38.equals((java.lang.Object) defaultedMap66);
        boolean b69 = defaultedMap26.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap71.entrySet();
        java.lang.Object obj75 = defaultedMap13.put((java.lang.Object) b69, (java.lang.Object) defaultedMap71);
        boolean b76 = defaultedMap1.containsValue((java.lang.Object) defaultedMap71);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        int i9 = defaultedMap8.size();
        boolean b10 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) b10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 0);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap24.putAll((java.util.Map) defaultedMap37);
        java.lang.String str39 = defaultedMap37.toString();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap41.containsKey(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        boolean b54 = defaultedMap52.containsKey(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate55, predicate56);
        boolean b58 = defaultedMap50.containsKey((java.lang.Object) predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate45, predicate56);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        boolean b13 = defaultedMap11.isEmpty();
        java.util.Set set14 = defaultedMap11.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) set20);
        defaultedMap11.putAll((java.util.Map) defaultedMap21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i29 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) false);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        boolean b39 = defaultedMap35.equals((java.lang.Object) '#');
        java.lang.Object obj40 = defaultedMap25.remove((java.lang.Object) b39);
        defaultedMap11.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        java.lang.Object obj49 = defaultedMap43.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj53 = defaultedMap43.get((java.lang.Object) collection52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        boolean b60 = defaultedMap55.isEmpty();
        int i61 = defaultedMap55.size();
        defaultedMap43.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (short) 0);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) ' ');
        java.util.Collection collection69 = defaultedMap64.values();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) (byte) 10);
        boolean b72 = defaultedMap64.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        int i77 = defaultedMap76.size();
        java.lang.Object obj79 = defaultedMap76.get((java.lang.Object) "hi!");
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, obj79);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, obj79);
        boolean b82 = defaultedMap43.containsKey((java.lang.Object) defaultedMap64);
        defaultedMap11.putAll((java.util.Map) defaultedMap64);
        java.lang.String str84 = defaultedMap11.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.lang.Object obj25 = defaultedMap19.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) collection28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 0);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        boolean b36 = defaultedMap31.isEmpty();
        int i37 = defaultedMap31.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap31);
        boolean b39 = defaultedMap15.containsValue((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsValue(obj7);
        boolean b9 = defaultedMap1.isEmpty();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap1.entrySet();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        int i17 = defaultedMap16.size();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) "hi!");
        int i20 = defaultedMap16.size();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) defaultedMap16, (java.lang.Object) 10.0f);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap26.containsKey(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.util.Set set46 = defaultedMap43.entrySet();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (short) 0);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) ' ');
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap41.putAll((java.util.Map) defaultedMap54);
        boolean b56 = defaultedMap26.equals((java.lang.Object) defaultedMap54);
        boolean b57 = defaultedMap14.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap59.entrySet();
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) b57, (java.lang.Object) defaultedMap59);
        java.util.Set set64 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        int i14 = defaultedMap13.size();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap20.containsKey((java.lang.Object) defaultedMap26);
        java.util.Collection collection29 = defaultedMap20.values();
        boolean b30 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 0);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.lang.Object obj38 = defaultedMap32.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) collection41);
        boolean b43 = defaultedMap20.equals((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        boolean b13 = defaultedMap11.isEmpty();
        java.util.Set set14 = defaultedMap11.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) set20);
        defaultedMap11.putAll((java.util.Map) defaultedMap21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b26 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i29 = defaultedMap28.size();
        defaultedMap28.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) false);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        boolean b39 = defaultedMap35.equals((java.lang.Object) '#');
        java.lang.Object obj40 = defaultedMap25.remove((java.lang.Object) b39);
        defaultedMap11.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 0);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        java.lang.Object obj49 = defaultedMap43.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj53 = defaultedMap43.get((java.lang.Object) collection52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        boolean b60 = defaultedMap55.isEmpty();
        int i61 = defaultedMap55.size();
        defaultedMap43.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (short) 0);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) ' ');
        java.util.Collection collection69 = defaultedMap64.values();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) (byte) 10);
        boolean b72 = defaultedMap64.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        int i77 = defaultedMap76.size();
        java.lang.Object obj79 = defaultedMap76.get((java.lang.Object) "hi!");
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, obj79);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, obj79);
        boolean b82 = defaultedMap43.containsKey((java.lang.Object) defaultedMap64);
        defaultedMap11.putAll((java.util.Map) defaultedMap64);
        collections.Transformer transformer84 = null;
        try {
            java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, transformer84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.String str18 = defaultedMap15.toString();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) "");
        java.util.Set set25 = defaultedMap20.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap20.containsValue(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.util.Set set32 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap15.get((java.lang.Object) defaultedMap33);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.String str18 = defaultedMap15.toString();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) "");
        java.util.Set set25 = defaultedMap20.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap20.containsValue(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.util.Set set32 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap15.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap15.containsValue(obj36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        int i33 = defaultedMap32.size();
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) "hi!");
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = defaultedMap22.put(obj35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b45 = defaultedMap44.isEmpty();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.util.Set set47 = defaultedMap44.keySet();
        java.util.Set set48 = defaultedMap44.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap44);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap44);
        boolean b51 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b54 = defaultedMap53.isEmpty();
        java.util.Set set55 = defaultedMap53.entrySet();
        java.util.Set set56 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i64 = defaultedMap63.size();
        defaultedMap63.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap63);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj68 = defaultedMap58.put((java.lang.Object) defaultedMap60, (java.lang.Object) predicate67);
        boolean b69 = defaultedMap53.equals((java.lang.Object) defaultedMap60);
        java.util.Collection collection70 = defaultedMap60.values();
        boolean b71 = defaultedMap44.equals((java.lang.Object) defaultedMap60);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj2 = null;
        java.lang.Object obj4 = defaultedMap1.put(obj2, (java.lang.Object) ' ');
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) "");
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.util.Set set20 = defaultedMap17.entrySet();
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate22, predicate23);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b4 = defaultedMap3.isEmpty();
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Set set6 = defaultedMap3.keySet();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap3.toString();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        java.lang.String str18 = defaultedMap15.toString();
        java.util.Set set19 = defaultedMap15.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.util.Collection collection18 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0f);
        int i27 = defaultedMap24.size();
        boolean b28 = defaultedMap21.equals((java.lang.Object) i27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i31 = defaultedMap30.size();
        defaultedMap30.clear();
        java.lang.String str33 = defaultedMap30.toString();
        java.lang.Object obj34 = defaultedMap21.remove((java.lang.Object) str33);
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set31 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i13 = defaultedMap12.size();
        defaultedMap12.clear();
        boolean b15 = defaultedMap9.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0f);
        int i23 = defaultedMap20.size();
        boolean b24 = defaultedMap17.equals((java.lang.Object) i23);
        boolean b25 = defaultedMap17.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        java.util.Set set27 = defaultedMap12.entrySet();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        int i35 = defaultedMap34.size();
        boolean b36 = defaultedMap34.isEmpty();
        java.util.Set set37 = defaultedMap34.keySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.util.Set set43 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) set43);
        defaultedMap34.putAll((java.util.Map) defaultedMap44);
        defaultedMap44.clear();
        java.lang.String str47 = defaultedMap44.toString();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) "");
        java.util.Set set54 = defaultedMap49.keySet();
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap49.containsValue(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b59 = defaultedMap58.isEmpty();
        java.util.Set set60 = defaultedMap58.entrySet();
        java.util.Set set61 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) set61);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap62);
        java.lang.Object obj64 = defaultedMap44.get((java.lang.Object) defaultedMap62);
        boolean b65 = defaultedMap12.equals(obj64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap12.equals((java.lang.Object) i15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 0);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.lang.Object obj25 = defaultedMap19.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        int i30 = defaultedMap29.size();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) "hi!");
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap35.isEmpty();
        java.util.Set set37 = defaultedMap35.entrySet();
        java.util.Set set38 = defaultedMap35.keySet();
        java.lang.Object obj39 = defaultedMap19.put(obj32, (java.lang.Object) defaultedMap35);
        defaultedMap19.clear();
        boolean b41 = defaultedMap12.containsKey((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) false);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap11.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) collection20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap11.remove((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0f);
        int i37 = defaultedMap34.size();
        boolean b38 = defaultedMap31.equals((java.lang.Object) i37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i41 = defaultedMap40.size();
        defaultedMap40.clear();
        java.lang.String str43 = defaultedMap40.toString();
        java.lang.Object obj44 = defaultedMap31.remove((java.lang.Object) str43);
        boolean b45 = defaultedMap11.containsKey((java.lang.Object) defaultedMap31);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0d + "'", obj9.equals(100.0d));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 0);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.keySet();
        boolean b17 = defaultedMap10.isEmpty();
        boolean b19 = defaultedMap10.equals((java.lang.Object) 1L);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap10.remove(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        java.lang.Object obj29 = defaultedMap23.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) collection32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        boolean b40 = defaultedMap35.isEmpty();
        int i41 = defaultedMap35.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (short) 0);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        java.util.Collection collection49 = defaultedMap44.values();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (byte) 10);
        boolean b52 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        int i57 = defaultedMap56.size();
        java.lang.Object obj59 = defaultedMap56.get((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, obj59);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, obj59);
        boolean b62 = defaultedMap23.containsKey((java.lang.Object) defaultedMap44);
        defaultedMap10.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        int i68 = defaultedMap67.size();
        java.lang.Object obj70 = defaultedMap67.get((java.lang.Object) "hi!");
        int i71 = defaultedMap67.size();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap65.put((java.lang.Object) defaultedMap67, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection78 = defaultedMap77.values();
        boolean b79 = defaultedMap65.containsValue((java.lang.Object) defaultedMap77);
        defaultedMap10.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj81 = defaultedMap1.get((java.lang.Object) defaultedMap77);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i5 = defaultedMap4.size();
        defaultedMap4.clear();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        java.util.Collection collection14 = defaultedMap9.values();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (short) 0);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        java.lang.Object obj22 = defaultedMap16.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) collection25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (short) 0);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        boolean b33 = defaultedMap28.isEmpty();
        int i34 = defaultedMap28.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i46 = defaultedMap45.size();
        defaultedMap45.clear();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) defaultedMap42, (java.lang.Object) predicate49);
        java.lang.Object obj51 = defaultedMap16.put(obj38, (java.lang.Object) predicate49);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i10 = defaultedMap9.size();
        defaultedMap9.clear();
        boolean b12 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0f);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) "");
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        int i26 = defaultedMap25.size();
        boolean b27 = defaultedMap25.isEmpty();
        java.util.Set set28 = defaultedMap25.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.util.Set set34 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        defaultedMap25.putAll((java.util.Map) defaultedMap35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap41.containsKey(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        boolean b47 = defaultedMap39.containsKey((java.lang.Object) predicate45);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (short) 0);
        java.util.Set set52 = defaultedMap49.entrySet();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (short) 0);
        java.lang.Object obj58 = defaultedMap54.get((java.lang.Object) ' ');
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (short) 0);
        java.util.Set set65 = defaultedMap62.entrySet();
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (short) 0);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) ' ');
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        defaultedMap60.putAll((java.util.Map) defaultedMap73);
        java.lang.String str75 = defaultedMap73.toString();
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        java.lang.Object obj78 = null;
        boolean b79 = defaultedMap77.containsKey(obj78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate81, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate45, predicate81);
        java.lang.Object obj86 = defaultedMap4.put((java.lang.Object) set13, (java.lang.Object) map85);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) collection23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        boolean b31 = defaultedMap26.isEmpty();
        int i32 = defaultedMap26.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (byte) 10);
        boolean b43 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        int i48 = defaultedMap47.size();
        java.lang.Object obj50 = defaultedMap47.get((java.lang.Object) "hi!");
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, obj50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, obj50);
        boolean b53 = defaultedMap14.containsKey((java.lang.Object) defaultedMap35);
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        int i59 = defaultedMap58.size();
        java.lang.Object obj61 = defaultedMap58.get((java.lang.Object) "hi!");
        int i62 = defaultedMap58.size();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 0);
        java.lang.Object obj66 = defaultedMap56.put((java.lang.Object) defaultedMap58, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection69 = defaultedMap68.values();
        boolean b70 = defaultedMap56.containsValue((java.lang.Object) defaultedMap68);
        defaultedMap1.putAll((java.util.Map) defaultedMap68);
        java.util.Set set72 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) collection23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        boolean b31 = defaultedMap26.isEmpty();
        int i32 = defaultedMap26.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (byte) 10);
        boolean b43 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        int i48 = defaultedMap47.size();
        java.lang.Object obj50 = defaultedMap47.get((java.lang.Object) "hi!");
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, obj50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, obj50);
        boolean b53 = defaultedMap14.containsKey((java.lang.Object) defaultedMap35);
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        defaultedMap35.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        int i7 = defaultedMap4.size();
        boolean b8 = defaultedMap1.equals((java.lang.Object) i7);
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (byte) 10);
        java.util.Set set20 = defaultedMap12.entrySet();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        int i4 = defaultedMap3.size();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) "hi!");
        int i7 = defaultedMap3.size();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) 10.0f);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Set set17 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0f + "'", obj21.equals(10.0f));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj2 = null;
        java.lang.Object obj4 = defaultedMap1.put(obj2, (java.lang.Object) ' ');
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.lang.Object obj21 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap17);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 0);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        boolean b10 = defaultedMap5.isEmpty();
        int i11 = defaultedMap5.size();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap13.remove(obj19);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) '4');
        java.lang.Object obj24 = defaultedMap13.get((java.lang.Object) (short) -1);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap26.containsKey(obj27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i39 = defaultedMap38.size();
        defaultedMap38.clear();
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj43 = defaultedMap33.put((java.lang.Object) defaultedMap35, (java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate30, predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i47 = defaultedMap46.size();
        defaultedMap46.clear();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100.0f);
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) "");
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (short) 0);
        java.util.Set set59 = defaultedMap56.entrySet();
        java.lang.Object obj60 = defaultedMap50.remove((java.lang.Object) defaultedMap56);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate62);
        boolean b64 = defaultedMap46.equals((java.lang.Object) predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate42, predicate61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        boolean b14 = defaultedMap9.isEmpty();
        int i15 = defaultedMap9.size();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) i15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + ' ' + "'", obj16.equals(' '));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) collection10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        int i19 = defaultedMap13.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap22.containsKey(obj23);
        java.lang.Object obj25 = defaultedMap1.get(obj23);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        java.lang.Object obj33 = defaultedMap27.remove((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        int i38 = defaultedMap37.size();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) "hi!");
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Set set45 = defaultedMap43.entrySet();
        java.util.Set set46 = defaultedMap43.keySet();
        java.lang.Object obj47 = defaultedMap27.put(obj40, (java.lang.Object) defaultedMap43);
        java.lang.Object obj48 = defaultedMap1.remove(obj47);
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.isEmpty();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection22 = defaultedMap21.values();
        int i23 = defaultedMap21.size();
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) i23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        java.util.Collection collection18 = defaultedMap13.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b29 = defaultedMap28.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate30);
        java.util.Set set34 = defaultedMap13.keySet();
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) set34);
        defaultedMap1.clear();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (short) 0);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        java.util.Collection collection43 = defaultedMap38.values();
        java.util.Set set44 = defaultedMap38.entrySet();
        int i45 = defaultedMap38.size();
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsValue(obj7);
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        int i7 = defaultedMap4.size();
        boolean b8 = defaultedMap1.equals((java.lang.Object) i7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i11 = defaultedMap10.size();
        defaultedMap10.clear();
        java.lang.String str13 = defaultedMap10.toString();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) str13);
        boolean b15 = defaultedMap1.isEmpty();
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate17);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.containsKey(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 0);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        boolean b10 = defaultedMap5.isEmpty();
        java.util.Set set11 = defaultedMap5.keySet();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Set set6 = defaultedMap4.entrySet();
        java.util.Set set7 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        boolean b17 = defaultedMap12.isEmpty();
        int i18 = defaultedMap12.size();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        boolean b26 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100.0f);
        java.lang.String str32 = defaultedMap29.toString();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0f);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) "");
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (short) 0);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) ' ');
        boolean b45 = defaultedMap40.isEmpty();
        java.util.Set set46 = defaultedMap40.keySet();
        java.lang.Object obj47 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        boolean b48 = defaultedMap29.equals((java.lang.Object) defaultedMap34);
        java.lang.Object obj49 = defaultedMap12.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        int i6 = defaultedMap5.size();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        java.util.Collection collection23 = defaultedMap18.values();
        java.util.Set set24 = defaultedMap18.entrySet();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 0);
        java.util.Set set29 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) set29, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (short) 0);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) ' ');
        java.util.Collection collection44 = defaultedMap39.values();
        java.util.Set set45 = defaultedMap39.entrySet();
        java.lang.Object obj46 = defaultedMap15.put((java.lang.Object) defaultedMap35, (java.lang.Object) set45);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
    }
}

