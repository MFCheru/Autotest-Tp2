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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) true);
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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap3.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = defaultedMap3.remove((java.lang.Object) defaultedMap12);
        int i15 = defaultedMap12.size();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) b19);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.lang.String str24 = defaultedMap16.toString();
        int i25 = defaultedMap16.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection27 = defaultedMap6.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b24 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap12.get((java.lang.Object) collection26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap7.containsValue(obj9);
        boolean b11 = defaultedMap7.isEmpty();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) b11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap3.equals((java.lang.Object) predicate22);
        boolean b27 = defaultedMap3.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap3.equals((java.lang.Object) predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.String str37 = defaultedMap29.toString();
        int i38 = defaultedMap29.size();
        java.util.Set set39 = defaultedMap29.entrySet();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b46 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap41.get((java.lang.Object) predicate48);
        boolean b51 = defaultedMap29.equals((java.lang.Object) predicate48);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap29);
        java.lang.String str53 = defaultedMap29.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) -1);
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate(map24, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        java.lang.String str24 = defaultedMap6.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{null=[]}" + "'", str24.equals("{null=[]}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b11 = defaultedMap8.equals((java.lang.Object) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        defaultedMap10.clear();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.lang.String str17 = defaultedMap10.toString();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        boolean b20 = defaultedMap15.equals((java.lang.Object) "");
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) "");
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap3.equals((java.lang.Object) predicate22);
        boolean b26 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{null=[]}");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) map29);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b29 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        java.lang.String str36 = defaultedMap28.toString();
        int i37 = defaultedMap28.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap28);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap21.containsValue(obj23);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        boolean b25 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) map29);
        java.util.Set set31 = defaultedMap30.keySet();
        java.util.Set set32 = defaultedMap30.keySet();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b40 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap39.containsValue(obj41);
        defaultedMap34.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b48 = defaultedMap45.equals((java.lang.Object) defaultedMap47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        defaultedMap47.clear();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap47);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b60 = defaultedMap57.equals((java.lang.Object) defaultedMap59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap55.get((java.lang.Object) predicate62);
        java.lang.Object obj66 = defaultedMap55.get((java.lang.Object) 1.0f);
        java.util.Set set67 = defaultedMap55.keySet();
        boolean b68 = defaultedMap39.containsValue((java.lang.Object) set67);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap70.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj74 = null;
        boolean b75 = defaultedMap72.containsValue(obj74);
        boolean b76 = defaultedMap72.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection78 = defaultedMap39.values();
        java.lang.Object obj79 = defaultedMap30.get((java.lang.Object) collection78);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap6.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.lang.String str23 = defaultedMap15.toString();
        int i24 = defaultedMap15.size();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b29 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection36 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap31.remove((java.lang.Object) ' ');
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) predicate43, (java.lang.Object) '#');
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b50 = defaultedMap47.equals((java.lang.Object) defaultedMap49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate52);
        java.lang.Object obj55 = defaultedMap15.get((java.lang.Object) predicate52);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b60 = defaultedMap57.equals((java.lang.Object) defaultedMap59);
        java.lang.Object obj62 = defaultedMap57.remove((java.lang.Object) 10);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b67 = defaultedMap64.equals((java.lang.Object) defaultedMap66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate68, predicate69);
        defaultedMap66.clear();
        boolean b72 = defaultedMap57.containsKey((java.lang.Object) defaultedMap66);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        boolean b77 = defaultedMap74.equals((java.lang.Object) defaultedMap76);
        java.lang.Object obj79 = defaultedMap74.remove((java.lang.Object) 10);
        java.lang.String str80 = defaultedMap74.toString();
        java.util.Collection collection81 = defaultedMap74.values();
        java.lang.Object obj82 = null;
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj82);
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        boolean b86 = defaultedMap83.equals((java.lang.Object) defaultedMap85);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate87, predicate88);
        java.lang.Object obj91 = defaultedMap74.put((java.lang.Object) predicate88, (java.lang.Object) 0L);
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate88, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate52, predicate88);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Set set25 = defaultedMap24.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj27 = defaultedMap6.remove((java.lang.Object) defaultedMap24);
        java.util.Set set28 = defaultedMap24.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap6.toString();
        boolean b13 = defaultedMap6.equals((java.lang.Object) 10);
        java.util.Set set14 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) 10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        defaultedMap19.clear();
        boolean b25 = defaultedMap10.containsKey((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) 10);
        java.lang.String str33 = defaultedMap27.toString();
        java.util.Collection collection34 = defaultedMap27.values();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b39 = defaultedMap36.equals((java.lang.Object) defaultedMap38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        java.lang.Object obj44 = defaultedMap27.put((java.lang.Object) predicate41, (java.lang.Object) 0L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate41, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate47);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        defaultedMap8.clear();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap17);
        int i20 = defaultedMap17.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) predicate30);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b42 = defaultedMap39.equals((java.lang.Object) defaultedMap41);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        java.util.Collection collection44 = defaultedMap39.values();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b51 = defaultedMap48.equals((java.lang.Object) defaultedMap50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        java.lang.Object obj55 = defaultedMap46.get((java.lang.Object) predicate53);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.util.Set set58 = defaultedMap57.entrySet();
        defaultedMap46.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj60 = defaultedMap39.remove((java.lang.Object) defaultedMap57);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        boolean b65 = defaultedMap62.equals((java.lang.Object) defaultedMap64);
        java.lang.Object obj67 = defaultedMap62.remove((java.lang.Object) 10);
        java.lang.String str68 = defaultedMap62.toString();
        java.util.Collection collection69 = defaultedMap62.values();
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b74 = defaultedMap71.equals((java.lang.Object) defaultedMap73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate75, predicate76);
        java.lang.Object obj79 = defaultedMap62.put((java.lang.Object) predicate76, (java.lang.Object) 0L);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate76, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate30, predicate80);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsValue(obj5);
        java.util.Set set7 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) 10);
        java.lang.String str31 = defaultedMap25.toString();
        java.util.Collection collection32 = defaultedMap25.values();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b39 = defaultedMap36.equals((java.lang.Object) defaultedMap38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) predicate41);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj48 = defaultedMap25.get((java.lang.Object) defaultedMap34);
        boolean b49 = defaultedMap13.containsKey(obj48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b54 = defaultedMap51.equals((java.lang.Object) defaultedMap53);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b59 = defaultedMap56.equals((java.lang.Object) defaultedMap58);
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection61 = defaultedMap56.values();
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b68 = defaultedMap65.equals((java.lang.Object) defaultedMap67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        java.lang.Object obj72 = defaultedMap63.get((java.lang.Object) predicate70);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.util.Set set75 = defaultedMap74.entrySet();
        defaultedMap63.putAll((java.util.Map) defaultedMap74);
        java.lang.Object obj77 = defaultedMap56.remove((java.lang.Object) defaultedMap74);
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        java.lang.Object obj80 = null;
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj80);
        boolean b82 = defaultedMap79.equals((java.lang.Object) defaultedMap81);
        java.lang.Object obj84 = defaultedMap79.remove((java.lang.Object) 10);
        java.lang.String str85 = defaultedMap79.toString();
        java.util.Collection collection86 = defaultedMap79.values();
        java.lang.Object obj87 = null;
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap(obj87);
        java.lang.Object obj89 = null;
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap(obj89);
        boolean b91 = defaultedMap88.equals((java.lang.Object) defaultedMap90);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap90, predicate92, predicate93);
        java.lang.Object obj96 = defaultedMap79.put((java.lang.Object) predicate93, (java.lang.Object) 0L);
        collections.Predicate predicate97 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate93, predicate97);
        boolean b99 = defaultedMap13.containsValue((java.lang.Object) predicate93);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap3.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = defaultedMap3.remove((java.lang.Object) defaultedMap12);
        int i15 = defaultedMap12.size();
        java.util.Set set16 = defaultedMap12.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsValue(obj5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.lang.String str24 = defaultedMap16.toString();
        int i25 = defaultedMap16.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) 100);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (-1.0f));
        boolean b31 = defaultedMap18.containsKey((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Set set29 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj31 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap28);
        java.util.Set set32 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        defaultedMap27.clear();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap27.remove((java.lang.Object) defaultedMap36);
        int i39 = defaultedMap36.size();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) b43);
        boolean b45 = defaultedMap6.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b24 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap12.get((java.lang.Object) collection26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b39 = defaultedMap36.equals((java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = defaultedMap36.remove((java.lang.Object) 10);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b46 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        defaultedMap45.clear();
        boolean b51 = defaultedMap36.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b56 = defaultedMap53.equals((java.lang.Object) defaultedMap55);
        java.lang.Object obj58 = defaultedMap53.remove((java.lang.Object) 10);
        java.lang.String str59 = defaultedMap53.toString();
        java.util.Collection collection60 = defaultedMap53.values();
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        boolean b65 = defaultedMap62.equals((java.lang.Object) defaultedMap64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate66, predicate67);
        java.lang.Object obj70 = defaultedMap53.put((java.lang.Object) predicate67, (java.lang.Object) 0L);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate67, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate71);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate71, predicate74);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap6.toString();
        boolean b13 = defaultedMap6.equals((java.lang.Object) 10);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap3.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) 10);
        java.lang.String str16 = defaultedMap10.toString();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b26 = defaultedMap23.equals((java.lang.Object) defaultedMap25);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        java.lang.String str28 = defaultedMap20.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) predicate37);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap10.get((java.lang.Object) map44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        boolean b51 = defaultedMap47.equals((java.lang.Object) (-1.0d));
        boolean b52 = defaultedMap47.isEmpty();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) b52);
        boolean b54 = defaultedMap3.containsValue((java.lang.Object) map53);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) predicate28, (java.lang.Object) '#');
        java.util.Collection collection31 = defaultedMap25.values();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) collection31);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "");
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b12 = defaultedMap9.equals((java.lang.Object) defaultedMap11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap11.toString();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b26 = defaultedMap23.equals((java.lang.Object) defaultedMap25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) predicate28);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Set set33 = defaultedMap32.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) map35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        boolean b42 = defaultedMap38.equals((java.lang.Object) (-1.0d));
        boolean b43 = defaultedMap38.isEmpty();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b43);
        boolean b45 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) map29);
        java.util.Set set31 = defaultedMap30.keySet();
        java.lang.String str32 = defaultedMap30.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.util.Set set13 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        defaultedMap12.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        int i24 = defaultedMap21.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        boolean b27 = defaultedMap3.containsValue((java.lang.Object) defaultedMap21);
        java.lang.String str28 = defaultedMap21.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap3.equals((java.lang.Object) predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.String str37 = defaultedMap29.toString();
        int i38 = defaultedMap29.size();
        java.util.Set set39 = defaultedMap29.entrySet();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b46 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap41.get((java.lang.Object) predicate48);
        boolean b51 = defaultedMap29.equals((java.lang.Object) predicate48);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap29);
        boolean b53 = defaultedMap29.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.lang.String str24 = defaultedMap16.toString();
        int i25 = defaultedMap16.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b33 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) predicate35);
        boolean b39 = defaultedMap28.equals((java.lang.Object) '4');
        java.lang.Object obj40 = defaultedMap6.remove((java.lang.Object) '4');
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1.0f);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b49 = defaultedMap46.equals((java.lang.Object) defaultedMap48);
        java.lang.Object obj51 = defaultedMap46.remove((java.lang.Object) 10);
        defaultedMap42.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Set set55 = defaultedMap54.entrySet();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b60 = defaultedMap57.equals((java.lang.Object) defaultedMap59);
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap59.containsValue(obj61);
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        defaultedMap42.putAll((java.util.Map) defaultedMap54);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) (-1.0f));
        java.util.Set set69 = defaultedMap66.keySet();
        java.util.Collection collection70 = defaultedMap66.values();
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        java.util.Set set73 = defaultedMap72.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) set73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) predicate75);
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) defaultedMap66, (java.lang.Object) b76);
        boolean b78 = defaultedMap6.equals((java.lang.Object) b76);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.String str37 = defaultedMap29.toString();
        int i38 = defaultedMap29.size();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b43 = defaultedMap40.equals((java.lang.Object) defaultedMap42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b48 = defaultedMap45.equals((java.lang.Object) defaultedMap47);
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection50 = defaultedMap45.values();
        java.lang.Object obj52 = defaultedMap45.remove((java.lang.Object) ' ');
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) predicate57, (java.lang.Object) '#');
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        boolean b64 = defaultedMap61.equals((java.lang.Object) defaultedMap63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate66);
        java.lang.Object obj69 = defaultedMap29.get((java.lang.Object) predicate66);
        java.lang.Object obj70 = defaultedMap19.put((java.lang.Object) (byte) 0, (java.lang.Object) predicate66);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Set set29 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj31 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b36 = defaultedMap33.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b41 = defaultedMap38.equals((java.lang.Object) defaultedMap40);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection43 = defaultedMap38.values();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b50 = defaultedMap47.equals((java.lang.Object) defaultedMap49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap45.get((java.lang.Object) predicate52);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.util.Set set57 = defaultedMap56.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj59 = defaultedMap38.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        boolean b64 = defaultedMap61.equals((java.lang.Object) defaultedMap63);
        java.lang.Object obj66 = defaultedMap61.remove((java.lang.Object) 10);
        java.lang.String str67 = defaultedMap61.toString();
        java.util.Collection collection68 = defaultedMap61.values();
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap70.equals((java.lang.Object) defaultedMap72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate74, predicate75);
        java.lang.Object obj78 = defaultedMap61.put((java.lang.Object) predicate75, (java.lang.Object) 0L);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate75, predicate79);
        java.lang.Object obj81 = defaultedMap28.remove((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        defaultedMap12.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        int i24 = defaultedMap21.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        boolean b27 = defaultedMap3.containsValue((java.lang.Object) defaultedMap21);
        java.util.Set set28 = defaultedMap21.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Set set29 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj31 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) (-1.0f));
        boolean b37 = defaultedMap14.containsKey((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsValue(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Set set9 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) predicate11);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) 10);
        java.lang.String str31 = defaultedMap25.toString();
        java.util.Collection collection32 = defaultedMap25.values();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b39 = defaultedMap36.equals((java.lang.Object) defaultedMap38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) predicate41);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj48 = defaultedMap25.get((java.lang.Object) defaultedMap34);
        boolean b49 = defaultedMap13.containsKey(obj48);
        java.lang.String str50 = defaultedMap13.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.lang.String str20 = defaultedMap12.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) predicate29);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Set set34 = defaultedMap33.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b44 = defaultedMap41.equals((java.lang.Object) defaultedMap43);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap43.containsValue(obj45);
        defaultedMap38.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map36, (java.lang.Object) defaultedMap38);
        boolean b50 = defaultedMap1.equals((java.lang.Object) map36);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate(map36, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj24 = defaultedMap13.get((java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap13.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1.0f);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) set25, (java.lang.Object) 0L);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap14.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap14);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) predicate29);
        java.lang.Object obj33 = defaultedMap22.get((java.lang.Object) 1.0f);
        java.util.Set set34 = defaultedMap22.keySet();
        boolean b35 = defaultedMap6.containsValue((java.lang.Object) set34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b40 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap39.containsValue(obj41);
        boolean b43 = defaultedMap39.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj46 = defaultedMap6.get((java.lang.Object) 'a');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b53 = defaultedMap50.equals((java.lang.Object) defaultedMap52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) predicate55);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Set set60 = defaultedMap59.entrySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap59);
        defaultedMap6.putAll((java.util.Map) defaultedMap48);
        java.util.Set set63 = defaultedMap6.entrySet();
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap19.get(obj25);
        java.util.Set set27 = defaultedMap19.entrySet();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsValue(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b11 = defaultedMap8.equals((java.lang.Object) defaultedMap10);
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) 10);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        defaultedMap17.clear();
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) 10);
        java.lang.String str31 = defaultedMap25.toString();
        java.util.Collection collection32 = defaultedMap25.values();
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.lang.Object obj42 = defaultedMap25.put((java.lang.Object) predicate39, (java.lang.Object) 0L);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate39, predicate43);
        defaultedMap3.putAll(map44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b50 = defaultedMap47.equals((java.lang.Object) defaultedMap49);
        java.lang.Object obj52 = defaultedMap47.remove((java.lang.Object) 10);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Set set55 = defaultedMap54.entrySet();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b60 = defaultedMap57.equals((java.lang.Object) defaultedMap59);
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap59.containsValue(obj61);
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.util.Set set67 = defaultedMap66.entrySet();
        java.lang.Object obj69 = defaultedMap66.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b74 = defaultedMap71.equals((java.lang.Object) defaultedMap73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate75, predicate76);
        defaultedMap73.clear();
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        boolean b83 = defaultedMap80.equals((java.lang.Object) defaultedMap82);
        java.lang.Object obj84 = defaultedMap73.remove((java.lang.Object) defaultedMap82);
        int i85 = defaultedMap82.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap82);
        boolean b87 = defaultedMap64.containsKey((java.lang.Object) defaultedMap82);
        java.lang.Object obj88 = null;
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap(obj88);
        java.lang.Object obj90 = null;
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap(obj90);
        boolean b92 = defaultedMap89.equals((java.lang.Object) defaultedMap91);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate93, predicate94);
        boolean b96 = defaultedMap64.equals((java.lang.Object) predicate93);
        java.lang.Object obj97 = null;
        java.lang.Object obj98 = defaultedMap47.put((java.lang.Object) predicate93, obj97);
        java.lang.Object obj99 = defaultedMap3.remove(obj97);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap3.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.lang.String str20 = defaultedMap12.toString();
        int i21 = defaultedMap12.size();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b26 = defaultedMap23.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b31 = defaultedMap28.equals((java.lang.Object) defaultedMap30);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection33 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap28.remove((java.lang.Object) ' ');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) predicate40, (java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b47 = defaultedMap44.equals((java.lang.Object) defaultedMap46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate49);
        java.lang.Object obj52 = defaultedMap12.get((java.lang.Object) predicate49);
        boolean b53 = defaultedMap3.equals(obj52);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        defaultedMap8.clear();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap17);
        int i20 = defaultedMap17.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        boolean b22 = defaultedMap17.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b24 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection26 = defaultedMap21.values();
        int i27 = defaultedMap21.size();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) predicate39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Set set44 = defaultedMap43.entrySet();
        defaultedMap32.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj46 = defaultedMap21.put((java.lang.Object) defaultedMap29, (java.lang.Object) defaultedMap43);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap43);
        java.util.Collection collection48 = defaultedMap43.values();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        defaultedMap6.clear();
        defaultedMap6.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        int i12 = defaultedMap6.size();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Set set29 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj31 = defaultedMap6.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap28);
        int i32 = defaultedMap14.size();
        int i33 = defaultedMap14.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap3.equals((java.lang.Object) predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.String str37 = defaultedMap29.toString();
        int i38 = defaultedMap29.size();
        java.util.Set set39 = defaultedMap29.entrySet();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b46 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap41.get((java.lang.Object) predicate48);
        boolean b51 = defaultedMap29.equals((java.lang.Object) predicate48);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap29);
        java.util.Collection collection53 = defaultedMap29.values();
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b60 = defaultedMap57.equals((java.lang.Object) defaultedMap59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap55.get((java.lang.Object) predicate62);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.util.Set set67 = defaultedMap66.entrySet();
        defaultedMap55.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.util.Set set71 = defaultedMap70.entrySet();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj74 = null;
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap(obj74);
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b78 = defaultedMap75.equals((java.lang.Object) defaultedMap77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate79, predicate80);
        defaultedMap77.clear();
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        boolean b87 = defaultedMap84.equals((java.lang.Object) defaultedMap86);
        java.lang.Object obj88 = defaultedMap77.remove((java.lang.Object) defaultedMap86);
        int i89 = defaultedMap86.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap86);
        java.lang.Object obj91 = defaultedMap29.put((java.lang.Object) defaultedMap66, (java.lang.Object) defaultedMap86);
        boolean b93 = defaultedMap29.containsKey((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set17 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap14.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap14);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) predicate29);
        java.lang.Object obj33 = defaultedMap22.get((java.lang.Object) 1.0f);
        java.util.Set set34 = defaultedMap22.keySet();
        boolean b35 = defaultedMap6.containsValue((java.lang.Object) set34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b40 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap39.containsValue(obj41);
        boolean b43 = defaultedMap39.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj46 = defaultedMap6.get((java.lang.Object) 'a');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b53 = defaultedMap50.equals((java.lang.Object) defaultedMap52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) predicate55);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Set set60 = defaultedMap59.entrySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap59);
        defaultedMap6.putAll((java.util.Map) defaultedMap48);
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Set set25 = defaultedMap24.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap24);
        java.util.Collection collection28 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsValue(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Set set9 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) predicate11);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) predicate11);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 100L);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        java.lang.String str22 = defaultedMap14.toString();
        int i23 = defaultedMap14.size();
        java.util.Set set24 = defaultedMap14.entrySet();
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) set24);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) predicate17);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Set set22 = defaultedMap21.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.lang.String str25 = defaultedMap1.toString();
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap20.clear();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b30 = defaultedMap27.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = defaultedMap20.remove((java.lang.Object) defaultedMap29);
        int i32 = defaultedMap29.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap29);
        boolean b34 = defaultedMap11.containsKey((java.lang.Object) defaultedMap29);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b41 = defaultedMap38.equals((java.lang.Object) defaultedMap40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap36.get((java.lang.Object) predicate43);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Set set48 = defaultedMap47.entrySet();
        defaultedMap36.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b54 = defaultedMap51.equals((java.lang.Object) defaultedMap53);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b59 = defaultedMap56.equals((java.lang.Object) defaultedMap58);
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection61 = defaultedMap56.values();
        java.lang.Object obj62 = defaultedMap47.get((java.lang.Object) collection61);
        boolean b63 = defaultedMap29.containsKey(obj62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.lang.String str23 = defaultedMap15.toString();
        int i24 = defaultedMap15.size();
        java.util.Set set25 = defaultedMap15.entrySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b32 = defaultedMap29.equals((java.lang.Object) defaultedMap31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) predicate34);
        boolean b37 = defaultedMap15.equals((java.lang.Object) predicate34);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) b37);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        java.util.Collection collection24 = defaultedMap6.values();
        java.util.Set set25 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set15 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        int i15 = defaultedMap1.size();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap16.containsValue(obj18);
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap24.clear();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap24);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) predicate39);
        java.lang.Object obj43 = defaultedMap32.get((java.lang.Object) 1.0f);
        java.util.Set set44 = defaultedMap32.keySet();
        boolean b45 = defaultedMap16.containsValue((java.lang.Object) set44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b50 = defaultedMap47.equals((java.lang.Object) defaultedMap49);
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap49.containsValue(obj51);
        boolean b53 = defaultedMap49.isEmpty();
        defaultedMap16.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj56 = defaultedMap16.get((java.lang.Object) 'a');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b63 = defaultedMap60.equals((java.lang.Object) defaultedMap62);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) predicate65);
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        java.util.Set set70 = defaultedMap69.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap69);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        boolean b73 = defaultedMap16.isEmpty();
        boolean b74 = defaultedMap3.equals((java.lang.Object) b73);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate27);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) predicateUtils31);
        java.lang.String str33 = defaultedMap6.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b24 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection26 = defaultedMap21.values();
        java.util.Collection collection27 = defaultedMap21.values();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b32 = defaultedMap29.equals((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap31.toString();
        int i40 = defaultedMap31.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) (short) 100);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap31);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b49 = defaultedMap46.equals((java.lang.Object) defaultedMap48);
        java.lang.Object obj50 = null;
        boolean b51 = defaultedMap48.containsValue(obj50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Set set54 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) set54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        boolean b57 = defaultedMap55.containsValue((java.lang.Object) predicate56);
        java.lang.Object obj58 = defaultedMap48.get((java.lang.Object) predicate56);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b63 = defaultedMap60.equals((java.lang.Object) defaultedMap62);
        java.lang.Object obj65 = defaultedMap60.remove((java.lang.Object) 10);
        java.lang.String str66 = defaultedMap60.toString();
        java.util.Collection collection67 = defaultedMap60.values();
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        boolean b72 = defaultedMap69.equals((java.lang.Object) defaultedMap71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate73, predicate74);
        java.lang.Object obj77 = defaultedMap60.put((java.lang.Object) predicate74, (java.lang.Object) 0L);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate56, predicate74);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set12 = defaultedMap1.entrySet();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) predicate17, (java.lang.Object) '#');
        java.util.Collection collection20 = defaultedMap14.values();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1.0f);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b29 = defaultedMap26.equals((java.lang.Object) defaultedMap28);
        java.lang.Object obj31 = defaultedMap26.remove((java.lang.Object) 10);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b37 = defaultedMap34.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b42 = defaultedMap39.equals((java.lang.Object) defaultedMap41);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        java.util.Collection collection44 = defaultedMap39.values();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj51 = defaultedMap46.put((java.lang.Object) predicate49, (java.lang.Object) '#');
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Set set54 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) set54);
        java.lang.Object obj56 = defaultedMap39.put(obj51, (java.lang.Object) set54);
        java.util.Collection collection57 = defaultedMap39.values();
        boolean b58 = defaultedMap22.containsValue((java.lang.Object) defaultedMap39);
        java.lang.Object obj59 = defaultedMap14.get((java.lang.Object) b58);
        boolean b60 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        boolean b11 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) predicate15, (java.lang.Object) 0L);
        java.util.Set set19 = defaultedMap1.entrySet();
        java.lang.String str20 = defaultedMap1.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap24.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) defaultedMap33);
        int i36 = defaultedMap33.size();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) b40);
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b49 = defaultedMap46.equals((java.lang.Object) defaultedMap48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) predicate51);
        java.lang.Object obj55 = defaultedMap44.get((java.lang.Object) 1.0f);
        java.util.Set set56 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap44);
        java.lang.Object obj58 = defaultedMap33.get((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap14.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap14);
        java.lang.String str21 = defaultedMap14.toString();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (-1.0f));
        java.util.Set set28 = defaultedMap25.keySet();
        java.util.Collection collection29 = defaultedMap25.values();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Set set32 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) predicate34);
        java.lang.Object obj36 = defaultedMap13.put((java.lang.Object) defaultedMap25, (java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b35);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        defaultedMap8.clear();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap17);
        int i20 = defaultedMap17.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Set set25 = defaultedMap24.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap34.containsValue(obj36);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.util.Map map40 = collections.map.DefaultedMap.decorate(map27, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) map40);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        defaultedMap6.clear();
        java.util.Set set25 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap3.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) predicate20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Set set25 = defaultedMap24.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap24);
        java.lang.String str28 = defaultedMap24.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) predicate22);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Set set27 = defaultedMap26.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b33 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b38 = defaultedMap35.equals((java.lang.Object) defaultedMap37);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Collection collection41 = defaultedMap35.values();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b46 = defaultedMap43.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b51 = defaultedMap48.equals((java.lang.Object) defaultedMap50);
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        java.lang.String str53 = defaultedMap45.toString();
        int i54 = defaultedMap45.size();
        defaultedMap35.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj57 = defaultedMap45.get((java.lang.Object) (short) 100);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap45);
        java.lang.Object obj59 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        int i60 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 100L);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Set set21 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap6.put(obj18, (java.lang.Object) set21);
        defaultedMap6.clear();
        int i25 = defaultedMap6.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        defaultedMap8.clear();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b18 = defaultedMap15.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap17);
        int i20 = defaultedMap17.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b26 = defaultedMap23.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b31 = defaultedMap28.equals((java.lang.Object) defaultedMap30);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        java.lang.String str33 = defaultedMap25.toString();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b40 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) predicate42);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Set set47 = defaultedMap46.entrySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap46);
        java.util.Collection collection50 = defaultedMap46.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap46);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) predicate15, (java.lang.Object) 0L);
        java.util.Set set19 = defaultedMap1.entrySet();
        java.lang.String str20 = defaultedMap1.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap24.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) defaultedMap33);
        int i36 = defaultedMap33.size();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) b40);
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        java.lang.String str43 = defaultedMap33.toString();
        boolean b44 = defaultedMap33.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b33 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) predicate35);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Set set40 = defaultedMap39.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj42 = defaultedMap18.get((java.lang.Object) defaultedMap39);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Set set46 = defaultedMap45.entrySet();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b51 = defaultedMap48.equals((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap50.containsValue(obj52);
        defaultedMap45.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b59 = defaultedMap56.equals((java.lang.Object) defaultedMap58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate60, predicate61);
        defaultedMap58.clear();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) defaultedMap58);
        defaultedMap39.putAll((java.util.Map) defaultedMap58);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.String str11 = defaultedMap6.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap24.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap31.equals((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) defaultedMap33);
        int i36 = defaultedMap33.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        defaultedMap33.clear();
        boolean b39 = defaultedMap15.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b47 = defaultedMap44.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap46.containsValue(obj48);
        defaultedMap41.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b55 = defaultedMap52.equals((java.lang.Object) defaultedMap54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate56, predicate57);
        defaultedMap54.clear();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap54);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b67 = defaultedMap64.equals((java.lang.Object) defaultedMap66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate68, predicate69);
        java.lang.Object obj71 = defaultedMap62.get((java.lang.Object) predicate69);
        java.lang.Object obj73 = defaultedMap62.get((java.lang.Object) 1.0f);
        java.util.Set set74 = defaultedMap62.keySet();
        boolean b75 = defaultedMap46.containsValue((java.lang.Object) set74);
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        boolean b80 = defaultedMap77.equals((java.lang.Object) defaultedMap79);
        java.lang.Object obj81 = null;
        boolean b82 = defaultedMap79.containsValue(obj81);
        boolean b83 = defaultedMap79.isEmpty();
        defaultedMap46.putAll((java.util.Map) defaultedMap79);
        java.util.Collection collection85 = defaultedMap46.values();
        boolean b86 = defaultedMap15.equals((java.lang.Object) collection85);
        java.lang.Object obj87 = null;
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap(obj87);
        java.lang.Object obj89 = null;
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap(obj89);
        boolean b91 = defaultedMap88.equals((java.lang.Object) defaultedMap90);
        boolean b93 = defaultedMap88.containsKey((java.lang.Object) 10L);
        java.lang.Object obj94 = defaultedMap6.put((java.lang.Object) defaultedMap15, (java.lang.Object) defaultedMap88);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b17 = defaultedMap14.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        java.lang.String str24 = defaultedMap16.toString();
        int i25 = defaultedMap16.size();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Set set28 = defaultedMap27.entrySet();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b33 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap32.containsValue(obj34);
        defaultedMap27.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b41 = defaultedMap38.equals((java.lang.Object) defaultedMap40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        defaultedMap40.clear();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap40);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b53 = defaultedMap50.equals((java.lang.Object) defaultedMap52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) predicate55);
        java.lang.Object obj59 = defaultedMap48.get((java.lang.Object) 1.0f);
        java.util.Set set60 = defaultedMap48.keySet();
        boolean b61 = defaultedMap32.containsValue((java.lang.Object) set60);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b66 = defaultedMap63.equals((java.lang.Object) defaultedMap65);
        java.lang.Object obj67 = null;
        boolean b68 = defaultedMap65.containsValue(obj67);
        boolean b69 = defaultedMap65.isEmpty();
        defaultedMap32.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj72 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        boolean b79 = defaultedMap76.equals((java.lang.Object) defaultedMap78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate80, predicate81);
        java.lang.Object obj83 = defaultedMap74.get((java.lang.Object) predicate81);
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        java.util.Set set86 = defaultedMap85.entrySet();
        defaultedMap74.putAll((java.util.Map) defaultedMap85);
        defaultedMap32.putAll((java.util.Map) defaultedMap74);
        defaultedMap16.putAll((java.util.Map) defaultedMap32);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (-1.0f));
        java.util.Set set28 = defaultedMap25.keySet();
        java.util.Collection collection29 = defaultedMap25.values();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Set set32 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) set32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) predicate34);
        java.lang.Object obj36 = defaultedMap13.put((java.lang.Object) defaultedMap25, (java.lang.Object) b35);
        java.util.Set set37 = defaultedMap25.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap17.equals((java.lang.Object) defaultedMap19);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap19.containsValue(obj21);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        defaultedMap27.clear();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap27);
        defaultedMap6.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) 100L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) predicate15, (java.lang.Object) 0L);
        java.util.Set set19 = defaultedMap1.entrySet();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        int i15 = defaultedMap12.size();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) predicate28, (java.lang.Object) '#');
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Set set33 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        java.lang.Object obj35 = defaultedMap18.put(obj30, (java.lang.Object) set33);
        java.util.Collection collection36 = defaultedMap18.values();
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b42 = defaultedMap39.equals((java.lang.Object) defaultedMap41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b47 = defaultedMap44.equals((java.lang.Object) defaultedMap46);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        java.lang.String str49 = defaultedMap41.toString();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b56 = defaultedMap53.equals((java.lang.Object) defaultedMap55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap51.get((java.lang.Object) predicate58);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.util.Set set63 = defaultedMap62.entrySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap62);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap62);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.util.Set set68 = defaultedMap67.entrySet();
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap70.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj74 = null;
        boolean b75 = defaultedMap72.containsValue(obj74);
        defaultedMap67.putAll((java.util.Map) defaultedMap72);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap67);
        java.util.Map map78 = collections.map.DefaultedMap.decorate(map65, (java.lang.Object) defaultedMap67);
        boolean b79 = defaultedMap18.containsKey((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b7 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsValue(obj8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap14.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap14);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) predicate29);
        java.lang.Object obj33 = defaultedMap22.get((java.lang.Object) 1.0f);
        java.util.Set set34 = defaultedMap22.keySet();
        boolean b35 = defaultedMap6.containsValue((java.lang.Object) set34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b40 = defaultedMap37.equals((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap39.containsValue(obj41);
        boolean b43 = defaultedMap39.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj46 = defaultedMap6.get((java.lang.Object) 'a');
        boolean b47 = defaultedMap6.isEmpty();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b52 = defaultedMap49.equals((java.lang.Object) defaultedMap51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b57 = defaultedMap54.equals((java.lang.Object) defaultedMap56);
        defaultedMap51.putAll((java.util.Map) defaultedMap54);
        java.util.Collection collection59 = defaultedMap54.values();
        java.lang.Object obj61 = defaultedMap54.remove((java.lang.Object) ' ');
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap63.put((java.lang.Object) predicate66, (java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap70.equals((java.lang.Object) defaultedMap72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate66, predicate75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) map77);
        java.util.Set set79 = defaultedMap78.keySet();
        java.util.Set set80 = defaultedMap78.keySet();
        boolean b81 = defaultedMap6.containsValue((java.lang.Object) set80);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap1.keySet();
        boolean b14 = defaultedMap1.isEmpty();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap1.containsKey(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1.0f);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Set set23 = defaultedMap22.entrySet();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b28 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap27.containsValue(obj29);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b36 = defaultedMap33.equals((java.lang.Object) defaultedMap35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        defaultedMap35.clear();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap35);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b48 = defaultedMap45.equals((java.lang.Object) defaultedMap47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) predicate50);
        java.lang.Object obj54 = defaultedMap43.get((java.lang.Object) 1.0f);
        java.util.Set set55 = defaultedMap43.keySet();
        boolean b56 = defaultedMap27.containsValue((java.lang.Object) set55);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        boolean b61 = defaultedMap58.equals((java.lang.Object) defaultedMap60);
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap60.containsValue(obj62);
        boolean b64 = defaultedMap60.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj67 = defaultedMap27.get((java.lang.Object) 10.0d);
        java.lang.Object obj68 = defaultedMap18.get((java.lang.Object) 10.0d);
        boolean b69 = defaultedMap1.equals(obj68);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b9 = defaultedMap6.equals((java.lang.Object) defaultedMap8);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) ' ');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b25 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate18, predicate27);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) predicateUtils31);
        java.util.Set set33 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap1.entrySet();
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        java.lang.String str27 = defaultedMap5.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) 100L);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        int i19 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b19 = defaultedMap16.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.containsValue(obj20);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        boolean b25 = defaultedMap13.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap10.equals((java.lang.Object) defaultedMap12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        defaultedMap12.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        int i24 = defaultedMap21.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        boolean b27 = defaultedMap3.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap34.containsValue(obj36);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b43 = defaultedMap40.equals((java.lang.Object) defaultedMap42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        defaultedMap42.clear();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap42);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b55 = defaultedMap52.equals((java.lang.Object) defaultedMap54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap50.get((java.lang.Object) predicate57);
        java.lang.Object obj61 = defaultedMap50.get((java.lang.Object) 1.0f);
        java.util.Set set62 = defaultedMap50.keySet();
        boolean b63 = defaultedMap34.containsValue((java.lang.Object) set62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b68 = defaultedMap65.equals((java.lang.Object) defaultedMap67);
        java.lang.Object obj69 = null;
        boolean b70 = defaultedMap67.containsValue(obj69);
        boolean b71 = defaultedMap67.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap67);
        java.util.Collection collection73 = defaultedMap34.values();
        boolean b74 = defaultedMap3.equals((java.lang.Object) collection73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        defaultedMap75.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap12.equals((java.lang.Object) defaultedMap14);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap14.containsValue(obj16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b23 = defaultedMap20.equals((java.lang.Object) defaultedMap22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        defaultedMap22.clear();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap22);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b35 = defaultedMap32.equals((java.lang.Object) defaultedMap34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) predicate37);
        java.lang.Object obj41 = defaultedMap30.get((java.lang.Object) 1.0f);
        java.util.Set set42 = defaultedMap30.keySet();
        boolean b43 = defaultedMap14.containsValue((java.lang.Object) set42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b48 = defaultedMap45.equals((java.lang.Object) defaultedMap47);
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) 10);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) predicate55, (java.lang.Object) '#');
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) 1L);
        java.lang.Object obj61 = defaultedMap52.get((java.lang.Object) 100L);
        defaultedMap45.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b6 = defaultedMap3.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate8);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 1.0f);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b23 = defaultedMap20.equals((java.lang.Object) defaultedMap22);
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) 10);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b32 = defaultedMap29.equals((java.lang.Object) defaultedMap31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        defaultedMap31.clear();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b41 = defaultedMap38.equals((java.lang.Object) defaultedMap40);
        java.lang.Object obj42 = defaultedMap31.remove((java.lang.Object) defaultedMap40);
        int i43 = defaultedMap40.size();
        java.util.Set set44 = defaultedMap40.entrySet();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b49 = defaultedMap46.equals((java.lang.Object) defaultedMap48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b54 = defaultedMap51.equals((java.lang.Object) defaultedMap53);
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        java.util.Collection collection56 = defaultedMap51.values();
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) predicate61, (java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Set set66 = defaultedMap65.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) set66);
        java.lang.Object obj68 = defaultedMap51.put(obj63, (java.lang.Object) set66);
        defaultedMap51.clear();
        java.lang.Object obj70 = defaultedMap1.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap51);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b75 = defaultedMap72.equals((java.lang.Object) defaultedMap74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate76, predicate77);
        defaultedMap74.clear();
        defaultedMap74.clear();
        defaultedMap40.putAll((java.util.Map) defaultedMap74);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap5.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b16 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b21 = defaultedMap18.equals((java.lang.Object) defaultedMap20);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        defaultedMap18.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Set set13 = defaultedMap12.entrySet();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap12.entrySet();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) set16);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) '#');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b14 = defaultedMap11.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) 10);
        java.lang.String str17 = defaultedMap11.toString();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b22 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        java.lang.String str29 = defaultedMap21.toString();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b36 = defaultedMap33.equals((java.lang.Object) defaultedMap35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) predicate38);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Set set43 = defaultedMap42.entrySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = defaultedMap11.get((java.lang.Object) map45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        boolean b53 = defaultedMap48.isEmpty();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) b53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }
}

