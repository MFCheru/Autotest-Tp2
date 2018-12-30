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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map6, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) predicate16);
        boolean b19 = defaultedMap1.equals((java.lang.Object) b18);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap16.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        java.util.Set set22 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) predicate9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) map15);
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) map25);
        java.util.Set set27 = defaultedMap20.keySet();
        int i28 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap20.get((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) 'a', (java.lang.Object) predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate32, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        boolean b54 = defaultedMap48.containsValue((java.lang.Object) map53);
        java.util.Set set55 = defaultedMap48.keySet();
        int i56 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.String str63 = defaultedMap58.toString();
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap58.get((java.lang.Object) 10L);
        boolean b70 = defaultedMap48.equals(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) map77);
        boolean b80 = defaultedMap72.containsValue((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap72.remove((java.lang.Object) 10);
        boolean b83 = defaultedMap48.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) b83);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (-1.0d) + "'", obj69.equals((-1.0d)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) '#');
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.String str17 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap1.equals((java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (-1.0d) + "'", obj21.equals((-1.0d)));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) map18);
        java.util.Set set20 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.String str26 = defaultedMap22.toString();
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap22.clear();
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) defaultedMap22);
        int i31 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        boolean b36 = defaultedMap33.containsValue((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Set set38 = defaultedMap33.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set38);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.String str8 = defaultedMap3.toString();
        java.util.Set set9 = defaultedMap3.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap3.put((java.lang.Object) 'a', (java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate13);
        java.lang.String str15 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.lang.String str21 = defaultedMap17.toString();
        java.lang.String str22 = defaultedMap17.toString();
        java.util.Set set23 = defaultedMap17.entrySet();
        java.util.Set set24 = defaultedMap17.entrySet();
        java.util.Set set25 = defaultedMap17.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap18.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) map40);
        java.util.Set set42 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.lang.String str48 = defaultedMap44.toString();
        boolean b50 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap44.clear();
        java.lang.Object obj52 = defaultedMap35.get((java.lang.Object) defaultedMap44);
        int i53 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        boolean b58 = defaultedMap55.containsValue((java.lang.Object) predicate57);
        java.util.Set set59 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        boolean b67 = defaultedMap61.containsValue((java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.lang.String str73 = defaultedMap69.toString();
        java.lang.String str74 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection77 = defaultedMap76.values();
        java.lang.Object obj78 = defaultedMap69.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj79 = defaultedMap61.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) set59, (java.lang.Object) defaultedMap69);
        java.util.Set set81 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (-1.0d) + "'", obj78.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (-1.0d) + "'", obj79.equals((-1.0d)));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) map15);
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) map25);
        java.util.Set set27 = defaultedMap20.keySet();
        int i28 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap20.get((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) 'a', (java.lang.Object) predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate32, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        boolean b54 = defaultedMap48.containsValue((java.lang.Object) map53);
        java.util.Set set55 = defaultedMap48.keySet();
        int i56 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.String str63 = defaultedMap58.toString();
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap58.get((java.lang.Object) 10L);
        boolean b70 = defaultedMap48.equals(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) map77);
        boolean b80 = defaultedMap72.containsValue((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap72.remove((java.lang.Object) 10);
        boolean b83 = defaultedMap48.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) b83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set87 = defaultedMap86.entrySet();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection90 = defaultedMap89.values();
        java.lang.Object obj91 = defaultedMap86.get((java.lang.Object) collection90);
        java.lang.Object obj92 = defaultedMap10.get(obj91);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (-1.0d) + "'", obj69.equals((-1.0d)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0L + "'", obj91.equals(0L));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 0L + "'", obj92.equals(0L));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.String str21 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap23);
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap28.containsValue((java.lang.Object) map33);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        boolean b44 = defaultedMap38.containsValue((java.lang.Object) map43);
        java.util.Set set45 = defaultedMap38.keySet();
        int i46 = defaultedMap38.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap38.get((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.String str58 = defaultedMap54.toString();
        java.lang.String str59 = defaultedMap54.toString();
        java.util.Set set60 = defaultedMap54.entrySet();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap54.put((java.lang.Object) 'a', (java.lang.Object) predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate50, predicate62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        boolean b72 = defaultedMap66.containsValue((java.lang.Object) predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate(map64, predicate70, predicate76);
        java.lang.Object obj79 = defaultedMap8.get((java.lang.Object) map78);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) map78);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1.0d) + "'", obj26.equals((-1.0d)));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (-1.0d) + "'", obj79.equals((-1.0d)));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.String str10 = defaultedMap6.toString();
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) 'a');
        boolean b13 = defaultedMap1.equals((java.lang.Object) 'a');
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection11 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.String str26 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj31 = defaultedMap13.get((java.lang.Object) defaultedMap21);
        java.util.Set set32 = defaultedMap13.keySet();
        java.lang.Object obj33 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1.0d) + "'", obj30.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0d) + "'", obj31.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.String str13 = defaultedMap9.toString();
        java.lang.String str14 = defaultedMap9.toString();
        java.util.Set set15 = defaultedMap9.entrySet();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap9.put((java.lang.Object) 'a', (java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) 10L);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap23.containsValue((java.lang.Object) map28);
        boolean b31 = defaultedMap23.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap33.containsValue((java.lang.Object) map38);
        java.util.Set set40 = defaultedMap33.keySet();
        int i41 = defaultedMap33.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap33.get((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.lang.String str53 = defaultedMap49.toString();
        java.lang.String str54 = defaultedMap49.toString();
        java.util.Set set55 = defaultedMap49.entrySet();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap49.put((java.lang.Object) 'a', (java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate45, predicate57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        boolean b67 = defaultedMap61.containsValue((java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate(map59, predicate65, predicate71);
        boolean b74 = defaultedMap1.equals((java.lang.Object) predicate71);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0d) + "'", obj20.equals((-1.0d)));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.String str30 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap32);
        java.util.Collection collection35 = defaultedMap32.values();
        boolean b36 = defaultedMap10.equals((java.lang.Object) defaultedMap32);
        java.util.Set set37 = defaultedMap10.entrySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1.0d) + "'", obj34.equals((-1.0d)));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) map16);
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) b19);
        int i21 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) predicate13);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap18.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        boolean b34 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) map15);
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) map25);
        java.util.Set set27 = defaultedMap20.keySet();
        int i28 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap20.get((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) 'a', (java.lang.Object) predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate32, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        boolean b54 = defaultedMap48.containsValue((java.lang.Object) map53);
        java.util.Set set55 = defaultedMap48.keySet();
        int i56 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.String str63 = defaultedMap58.toString();
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap58.get((java.lang.Object) 10L);
        boolean b70 = defaultedMap48.equals(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) map77);
        boolean b80 = defaultedMap72.containsValue((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap72.remove((java.lang.Object) 10);
        boolean b83 = defaultedMap48.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) b83);
        collections.Factory factory85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (-1.0d) + "'", obj69.equals((-1.0d)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) 'a');
        boolean b18 = defaultedMap6.equals((java.lang.Object) 'a');
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) b18);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) "");
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate(map18, predicate19, predicate22);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate(map25, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.String str15 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj20 = defaultedMap1.put(obj8, obj19);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.String str28 = defaultedMap24.toString();
        java.lang.String str29 = defaultedMap24.toString();
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) map37);
        java.util.Set set39 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.String str45 = defaultedMap41.toString();
        boolean b47 = defaultedMap41.containsKey((java.lang.Object) 'a');
        defaultedMap41.clear();
        java.lang.Object obj49 = defaultedMap32.get((java.lang.Object) defaultedMap41);
        int i50 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap41.putAll((java.util.Map) defaultedMap52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) predicate54);
        boolean b56 = defaultedMap24.containsKey((java.lang.Object) defaultedMap52);
        java.lang.Object obj57 = defaultedMap1.remove((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0d) + "'", obj19.equals((-1.0d)));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) map10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Set set19 = defaultedMap13.entrySet();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap13.get((java.lang.Object) 10L);
        java.lang.Object obj25 = defaultedMap5.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) map32);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        boolean b43 = defaultedMap37.containsValue((java.lang.Object) map42);
        java.util.Set set44 = defaultedMap37.keySet();
        int i45 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap37.get((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        java.lang.String str57 = defaultedMap53.toString();
        java.lang.String str58 = defaultedMap53.toString();
        java.util.Set set59 = defaultedMap53.entrySet();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj62 = defaultedMap53.put((java.lang.Object) 'a', (java.lang.Object) predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate49, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        boolean b71 = defaultedMap65.containsValue((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate(map63, predicate69, predicate75);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate69, predicate78);
        boolean b80 = defaultedMap1.equals((java.lang.Object) predicate69);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1.0d) + "'", obj24.equals((-1.0d)));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) "");
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) map9);
        java.util.Set set11 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.String str17 = defaultedMap13.toString();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap13.clear();
        java.lang.Object obj21 = defaultedMap4.get((java.lang.Object) defaultedMap13);
        int i22 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) predicate26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Set set14 = defaultedMap8.entrySet();
        java.util.Set set15 = defaultedMap8.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.String str13 = defaultedMap9.toString();
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0d) + "'", obj19.equals((-1.0d)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) map15);
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) map25);
        java.util.Set set27 = defaultedMap20.keySet();
        int i28 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap20.get((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.lang.String str40 = defaultedMap36.toString();
        java.lang.String str41 = defaultedMap36.toString();
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) 'a', (java.lang.Object) predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate32, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        boolean b54 = defaultedMap48.containsValue((java.lang.Object) map53);
        java.util.Set set55 = defaultedMap48.keySet();
        int i56 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.String str63 = defaultedMap58.toString();
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) 'a', (java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap58.get((java.lang.Object) 10L);
        boolean b70 = defaultedMap48.equals(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) map77);
        boolean b80 = defaultedMap72.containsValue((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap72.remove((java.lang.Object) 10);
        boolean b83 = defaultedMap48.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) b83);
        collections.Transformer transformer85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (-1.0d) + "'", obj69.equals((-1.0d)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.String str13 = defaultedMap9.toString();
        java.lang.String str14 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set20 = defaultedMap9.keySet();
        java.util.Collection collection21 = defaultedMap9.values();
        java.util.Set set22 = defaultedMap9.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0d) + "'", obj19.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) map17);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) 0);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) predicate23);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.String str34 = defaultedMap29.toString();
        java.util.Set set35 = defaultedMap29.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap29.put((java.lang.Object) 'a', (java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate39);
        java.util.Map map42 = null;
        try {
            defaultedMap21.putAll(map42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) map16);
        java.util.Set set18 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.String str24 = defaultedMap20.toString();
        boolean b26 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap20.clear();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap20);
        int i29 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        boolean b33 = defaultedMap20.isEmpty();
        java.util.Set set34 = defaultedMap20.entrySet();
        boolean b35 = defaultedMap1.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b31);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) predicate23);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.String str34 = defaultedMap29.toString();
        java.util.Set set35 = defaultedMap29.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap29.put((java.lang.Object) 'a', (java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate39);
        collections.Factory factory42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate(map41, factory42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        boolean b8 = defaultedMap2.containsValue((java.lang.Object) map7);
        java.util.Set set9 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap11.clear();
        java.lang.Object obj19 = defaultedMap2.get((java.lang.Object) defaultedMap11);
        int i20 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap11.putAll((java.util.Map) defaultedMap22);
        boolean b24 = defaultedMap11.isEmpty();
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.String str34 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap41.containsValue((java.lang.Object) map46);
        boolean b49 = defaultedMap41.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) map56);
        java.util.Set set58 = defaultedMap51.keySet();
        int i59 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        java.lang.Object obj65 = defaultedMap51.get((java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        java.lang.String str71 = defaultedMap67.toString();
        java.lang.String str72 = defaultedMap67.toString();
        java.util.Set set73 = defaultedMap67.entrySet();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj76 = defaultedMap67.put((java.lang.Object) 'a', (java.lang.Object) predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate63, predicate75);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate82, predicate83);
        boolean b85 = defaultedMap79.containsValue((java.lang.Object) predicate83);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate(map77, predicate83, predicate89);
        java.lang.Object obj92 = defaultedMap21.get((java.lang.Object) map91);
        boolean b93 = defaultedMap10.equals(obj92);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (-1.0d) + "'", obj38.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1.0d) + "'", obj39.equals((-1.0d)));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (-1.0d) + "'", obj92.equals((-1.0d)));
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set36 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) collection39);
        boolean b41 = defaultedMap33.equals((java.lang.Object) collection39);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap14.containsValue((java.lang.Object) map19);
        java.util.Set set21 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.lang.String str27 = defaultedMap23.toString();
        boolean b29 = defaultedMap23.containsKey((java.lang.Object) 'a');
        defaultedMap23.clear();
        java.lang.Object obj31 = defaultedMap14.get((java.lang.Object) defaultedMap23);
        int i32 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap23.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap34.containsValue((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap34.keySet();
        java.lang.String str39 = defaultedMap34.toString();
        boolean b40 = defaultedMap8.equals((java.lang.Object) str39);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap18.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) map40);
        java.util.Set set42 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.lang.String str48 = defaultedMap44.toString();
        boolean b50 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap44.clear();
        java.lang.Object obj52 = defaultedMap35.get((java.lang.Object) defaultedMap44);
        int i53 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap55);
        int i57 = defaultedMap55.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap55);
        java.lang.Object obj59 = defaultedMap29.get((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (-1.0d) + "'", obj59.equals((-1.0d)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        int i7 = defaultedMap3.size();
        int i8 = defaultedMap3.size();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) predicate23);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.String str33 = defaultedMap29.toString();
        java.lang.String str34 = defaultedMap29.toString();
        java.util.Set set35 = defaultedMap29.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap29.put((java.lang.Object) 'a', (java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        boolean b49 = defaultedMap43.containsValue((java.lang.Object) map48);
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) 0);
        java.lang.String str52 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.String str58 = defaultedMap54.toString();
        java.lang.String str59 = defaultedMap54.toString();
        java.util.Set set60 = defaultedMap54.entrySet();
        java.util.Set set61 = defaultedMap54.entrySet();
        java.util.Set set62 = defaultedMap54.entrySet();
        boolean b63 = defaultedMap43.containsValue((java.lang.Object) set62);
        java.lang.Object obj64 = defaultedMap21.remove((java.lang.Object) set62);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.lang.String str19 = defaultedMap15.toString();
        java.lang.String str20 = defaultedMap15.toString();
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap23);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) map28);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        boolean b40 = defaultedMap34.containsValue((java.lang.Object) map39);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        boolean b50 = defaultedMap44.containsValue((java.lang.Object) map49);
        java.util.Set set51 = defaultedMap44.keySet();
        int i52 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap44.get((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.lang.String str64 = defaultedMap60.toString();
        java.lang.String str65 = defaultedMap60.toString();
        java.util.Set set66 = defaultedMap60.entrySet();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap60.put((java.lang.Object) 'a', (java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate56, predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) predicate76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate(map70, predicate76, predicate82);
        defaultedMap1.putAll(map70);
        int i86 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.String str10 = defaultedMap6.toString();
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) 'a');
        boolean b13 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap19.containsValue((java.lang.Object) map24);
        java.util.Set set26 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.lang.String str32 = defaultedMap28.toString();
        boolean b34 = defaultedMap28.containsKey((java.lang.Object) 'a');
        defaultedMap28.clear();
        java.lang.Object obj36 = defaultedMap19.get((java.lang.Object) defaultedMap28);
        int i37 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap28.putAll((java.util.Map) defaultedMap39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) predicate41);
        boolean b43 = defaultedMap11.containsKey((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        boolean b51 = defaultedMap45.containsValue((java.lang.Object) map50);
        java.util.Set set52 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.String str58 = defaultedMap54.toString();
        boolean b60 = defaultedMap54.containsKey((java.lang.Object) 'a');
        defaultedMap54.clear();
        java.lang.Object obj62 = defaultedMap45.get((java.lang.Object) defaultedMap54);
        int i63 = defaultedMap54.size();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap54.putAll((java.util.Map) defaultedMap65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        boolean b68 = defaultedMap65.containsValue((java.lang.Object) predicate67);
        java.util.Set set69 = defaultedMap65.keySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate74, predicate75);
        boolean b77 = defaultedMap71.containsValue((java.lang.Object) predicate75);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate80, predicate81);
        java.lang.String str83 = defaultedMap79.toString();
        java.lang.String str84 = defaultedMap79.toString();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection87 = defaultedMap86.values();
        java.lang.Object obj88 = defaultedMap79.get((java.lang.Object) defaultedMap86);
        java.lang.Object obj89 = defaultedMap71.get((java.lang.Object) defaultedMap79);
        java.lang.Object obj90 = defaultedMap11.put((java.lang.Object) set69, (java.lang.Object) defaultedMap79);
        java.lang.Object obj91 = defaultedMap1.put((java.lang.Object) (short) 10, obj90);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (-1.0d) + "'", obj88.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (-1.0d) + "'", obj89.equals((-1.0d)));
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate19, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap24.containsValue((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate28);
        java.util.Set set32 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) map30);
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) 10);
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.lang.String str37 = defaultedMap25.toString();
        java.util.Set set38 = defaultedMap25.entrySet();
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) map16);
        java.util.Set set18 = defaultedMap11.keySet();
        int i19 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.String str31 = defaultedMap27.toString();
        java.lang.String str32 = defaultedMap27.toString();
        java.util.Set set33 = defaultedMap27.entrySet();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap27.put((java.lang.Object) 'a', (java.lang.Object) predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate35);
        boolean b38 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Collection collection11 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        boolean b23 = defaultedMap17.containsValue((java.lang.Object) predicate21);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) (short) 1);
        boolean b26 = defaultedMap10.containsValue((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Set set26 = defaultedMap25.entrySet();
        java.lang.Object obj28 = defaultedMap10.put((java.lang.Object) set26, (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Collection collection11 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap10.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) map15);
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate23, predicate26);
        defaultedMap1.putAll(map27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1.0d) + "'", obj8.equals((-1.0d)));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap18.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) map40);
        java.util.Set set42 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.lang.String str48 = defaultedMap44.toString();
        boolean b50 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap44.clear();
        java.lang.Object obj52 = defaultedMap35.get((java.lang.Object) defaultedMap44);
        int i53 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        boolean b58 = defaultedMap55.containsValue((java.lang.Object) predicate57);
        java.util.Set set59 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        boolean b67 = defaultedMap61.containsValue((java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.lang.String str73 = defaultedMap69.toString();
        java.lang.String str74 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection77 = defaultedMap76.values();
        java.lang.Object obj78 = defaultedMap69.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj79 = defaultedMap61.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) set59, (java.lang.Object) defaultedMap69);
        int i81 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (-1.0d) + "'", obj78.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (-1.0d) + "'", obj79.equals((-1.0d)));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(i81 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.String str35 = defaultedMap31.toString();
        java.lang.String str36 = defaultedMap31.toString();
        java.util.Set set37 = defaultedMap31.entrySet();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap31.put((java.lang.Object) 'a', (java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate39, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        boolean b50 = defaultedMap44.containsValue((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate39, predicate48);
        java.lang.Object obj52 = defaultedMap13.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.String str58 = defaultedMap54.toString();
        java.lang.String str59 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection62 = defaultedMap61.values();
        java.lang.Object obj63 = defaultedMap54.get((java.lang.Object) defaultedMap61);
        java.util.Set set64 = defaultedMap54.keySet();
        boolean b65 = defaultedMap13.equals((java.lang.Object) defaultedMap54);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (-1.0d) + "'", obj63.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        int i7 = defaultedMap3.size();
        int i8 = defaultedMap3.size();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) map30);
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) 10);
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj37 = null;
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.lang.String str44 = defaultedMap40.toString();
        java.lang.String str45 = defaultedMap40.toString();
        java.util.Set set46 = defaultedMap40.entrySet();
        java.util.Set set47 = defaultedMap40.entrySet();
        java.util.Set set48 = defaultedMap40.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map38, (java.lang.Object) set48);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) predicate14);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) map25);
        java.util.Set set27 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.String str33 = defaultedMap29.toString();
        boolean b35 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap29.clear();
        java.lang.Object obj37 = defaultedMap20.get((java.lang.Object) defaultedMap29);
        int i38 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap29.putAll((java.util.Map) defaultedMap40);
        boolean b42 = defaultedMap29.isEmpty();
        java.util.Set set43 = defaultedMap29.entrySet();
        boolean b44 = defaultedMap10.equals((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.String str51 = defaultedMap47.toString();
        java.lang.String str52 = defaultedMap47.toString();
        java.util.Set set53 = defaultedMap47.entrySet();
        boolean b55 = defaultedMap47.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set58 = defaultedMap57.entrySet();
        defaultedMap57.clear();
        java.lang.Object obj60 = defaultedMap45.put((java.lang.Object) defaultedMap47, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        boolean b68 = defaultedMap62.containsValue((java.lang.Object) map67);
        boolean b70 = defaultedMap62.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) map77);
        java.util.Set set79 = defaultedMap72.keySet();
        int i80 = defaultedMap72.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap72.get((java.lang.Object) predicate84);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap88, predicate89, predicate90);
        java.lang.String str92 = defaultedMap88.toString();
        java.lang.String str93 = defaultedMap88.toString();
        java.util.Set set94 = defaultedMap88.entrySet();
        collections.Predicate predicate96 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj97 = defaultedMap88.put((java.lang.Object) 'a', (java.lang.Object) predicate96);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate84, predicate96);
        java.lang.Object obj99 = defaultedMap1.put(obj60, (java.lang.Object) map98);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 0L + "'", obj86.equals(0L));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap16.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.String str15 = defaultedMap10.toString();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) str15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set25 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap27.isEmpty();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        int i17 = defaultedMap9.size();
        boolean b19 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap22.containsValue((java.lang.Object) predicate26);
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.String str35 = defaultedMap31.toString();
        java.lang.String str36 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = defaultedMap22.put(obj29, obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.String str48 = defaultedMap43.toString();
        java.util.Set set49 = defaultedMap43.entrySet();
        java.util.Set set50 = defaultedMap43.entrySet();
        boolean b52 = defaultedMap43.containsKey((java.lang.Object) (short) 100);
        java.lang.String str53 = defaultedMap43.toString();
        java.lang.Object obj54 = defaultedMap1.put(obj40, (java.lang.Object) str53);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1.0d) + "'", obj40.equals((-1.0d)));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        java.lang.String str23 = defaultedMap18.toString();
        boolean b24 = defaultedMap11.containsKey((java.lang.Object) str23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap26.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap26);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1.0d) + "'", obj32.equals((-1.0d)));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        int i30 = defaultedMap26.size();
        int i31 = defaultedMap26.size();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap26.get(obj32);
        boolean b34 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        boolean b35 = defaultedMap10.containsValue((java.lang.Object) defaultedMap24);
        boolean b36 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1.0d) + "'", obj33.equals((-1.0d)));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.String str12 = defaultedMap10.toString();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) str12);
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        defaultedMap10.clear();
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.String str13 = defaultedMap8.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap16.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.lang.String str27 = defaultedMap23.toString();
        java.lang.String str28 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.String str34 = defaultedMap30.toString();
        java.lang.String str35 = defaultedMap30.toString();
        boolean b36 = defaultedMap23.containsKey((java.lang.Object) str35);
        java.lang.Object obj38 = defaultedMap23.remove((java.lang.Object) "");
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0d);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.String str48 = defaultedMap43.toString();
        java.util.Set set49 = defaultedMap43.entrySet();
        java.lang.Object obj51 = defaultedMap43.get((java.lang.Object) (byte) -1);
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (-1.0d) + "'", obj51.equals((-1.0d)));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.lang.String str8 = defaultedMap4.toString();
        java.lang.String str9 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        boolean b17 = defaultedMap4.containsKey((java.lang.Object) str16);
        java.lang.Object obj19 = defaultedMap4.remove((java.lang.Object) "");
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate(map21, predicate22, predicate25);
        boolean b29 = defaultedMap1.equals((java.lang.Object) map28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) map8);
        java.util.Set set10 = defaultedMap3.keySet();
        int i11 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Set set19 = defaultedMap13.entrySet();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 'a', (java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap13.get((java.lang.Object) 10L);
        boolean b25 = defaultedMap3.equals(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) predicate31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        boolean b42 = defaultedMap36.containsValue((java.lang.Object) map41);
        boolean b44 = defaultedMap36.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        boolean b52 = defaultedMap46.containsValue((java.lang.Object) map51);
        java.util.Set set53 = defaultedMap46.keySet();
        int i54 = defaultedMap46.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap46.get((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        java.lang.String str66 = defaultedMap62.toString();
        java.lang.String str67 = defaultedMap62.toString();
        java.util.Set set68 = defaultedMap62.entrySet();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) 'a', (java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate58, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        boolean b80 = defaultedMap74.containsValue((java.lang.Object) predicate78);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map72, predicate78, predicate84);
        defaultedMap3.putAll(map72);
        boolean b88 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1.0d) + "'", obj24.equals((-1.0d)));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) map18);
        boolean b21 = defaultedMap13.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap23.containsValue((java.lang.Object) map28);
        java.util.Set set30 = defaultedMap23.keySet();
        int i31 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap23.get((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.lang.String str43 = defaultedMap39.toString();
        java.lang.String str44 = defaultedMap39.toString();
        java.util.Set set45 = defaultedMap39.entrySet();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap39.put((java.lang.Object) 'a', (java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map49, predicate55, predicate61);
        boolean b64 = defaultedMap8.equals((java.lang.Object) predicate55);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        int i11 = defaultedMap8.size();
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) 'a');
        java.util.Map map14 = null;
        try {
            defaultedMap8.putAll(map14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.String str8 = defaultedMap3.toString();
        java.util.Set set9 = defaultedMap3.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap3.put((java.lang.Object) 'a', (java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate13);
        java.lang.String str15 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.lang.String str21 = defaultedMap17.toString();
        java.lang.String str22 = defaultedMap17.toString();
        java.util.Set set23 = defaultedMap17.entrySet();
        java.util.Set set24 = defaultedMap17.entrySet();
        java.util.Set set25 = defaultedMap17.entrySet();
        boolean b26 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap28.containsValue((java.lang.Object) map33);
        java.util.Set set35 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.lang.String str41 = defaultedMap37.toString();
        boolean b43 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap37.clear();
        java.lang.Object obj45 = defaultedMap28.get((java.lang.Object) defaultedMap37);
        int i46 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap37.putAll((java.util.Map) defaultedMap48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) predicate50);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        java.lang.String str60 = defaultedMap56.toString();
        java.lang.String str61 = defaultedMap56.toString();
        java.util.Set set62 = defaultedMap56.entrySet();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap56.put((java.lang.Object) 'a', (java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate64, predicate66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        java.lang.String str74 = defaultedMap70.toString();
        java.lang.String str75 = defaultedMap70.toString();
        java.lang.Object obj76 = defaultedMap17.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap70);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) map30);
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) 10);
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.lang.String str37 = defaultedMap25.toString();
        java.util.Set set38 = defaultedMap25.entrySet();
        java.util.Collection collection39 = defaultedMap25.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.String str16 = defaultedMap11.toString();
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) 'a', (java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap1.equals(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) map30);
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) 10);
        boolean b36 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        java.lang.String str37 = defaultedMap25.toString();
        java.util.Set set38 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) map43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap25.get(obj45);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        int i23 = defaultedMap21.size();
        java.util.Collection collection24 = defaultedMap21.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) map16);
        java.util.Set set18 = defaultedMap11.keySet();
        int i19 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.lang.String str31 = defaultedMap27.toString();
        java.lang.String str32 = defaultedMap27.toString();
        java.util.Set set33 = defaultedMap27.entrySet();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap27.put((java.lang.Object) 'a', (java.lang.Object) predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate35);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Collection collection20 = defaultedMap13.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.String str12 = defaultedMap10.toString();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) str12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) str12);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.String str11 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.String str18 = defaultedMap13.toString();
        boolean b19 = defaultedMap6.containsKey((java.lang.Object) str18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap21.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap21);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.util.Set set28 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) predicate13);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap18.entrySet();
        java.util.Set set26 = defaultedMap18.keySet();
        java.util.Collection collection27 = defaultedMap18.values();
        boolean b28 = defaultedMap1.equals((java.lang.Object) collection27);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) predicate23);
        java.util.Collection collection25 = defaultedMap21.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.String str8 = defaultedMap3.toString();
        java.util.Set set9 = defaultedMap3.entrySet();
        java.util.Set set10 = defaultedMap3.entrySet();
        boolean b11 = defaultedMap1.equals((java.lang.Object) set10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) map30);
        boolean b33 = defaultedMap25.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate38, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        boolean b50 = defaultedMap44.containsValue((java.lang.Object) map49);
        java.util.Set set51 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        java.lang.String str57 = defaultedMap53.toString();
        boolean b59 = defaultedMap53.containsKey((java.lang.Object) 'a');
        defaultedMap53.clear();
        java.lang.Object obj61 = defaultedMap44.get((java.lang.Object) defaultedMap53);
        boolean b62 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        java.lang.String str68 = defaultedMap64.toString();
        java.lang.String str69 = defaultedMap64.toString();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        java.lang.String str75 = defaultedMap71.toString();
        java.lang.String str76 = defaultedMap71.toString();
        boolean b77 = defaultedMap64.containsKey((java.lang.Object) str76);
        java.lang.Object obj79 = defaultedMap64.remove((java.lang.Object) "");
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) 1.0d);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map81, predicate82, predicate85);
        boolean b89 = defaultedMap53.containsKey((java.lang.Object) predicate82);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate41, predicate82);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0L + "'", obj61.equals(0L));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        java.lang.String str15 = defaultedMap10.toString();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) str15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set25 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap28.containsValue((java.lang.Object) map33);
        java.util.Set set35 = defaultedMap28.keySet();
        int i36 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.String str42 = defaultedMap38.toString();
        java.lang.String str43 = defaultedMap38.toString();
        java.util.Set set44 = defaultedMap38.entrySet();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap38.put((java.lang.Object) 'a', (java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap38.get((java.lang.Object) 10L);
        boolean b50 = defaultedMap28.equals(obj49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) map57);
        boolean b60 = defaultedMap52.containsValue((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap52.remove((java.lang.Object) 10);
        boolean b63 = defaultedMap28.equals((java.lang.Object) defaultedMap52);
        java.lang.String str64 = defaultedMap52.toString();
        java.util.Set set65 = defaultedMap52.entrySet();
        boolean b66 = defaultedMap26.containsValue((java.lang.Object) defaultedMap52);
        java.lang.String str67 = defaultedMap26.toString();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (-1.0d) + "'", obj49.equals((-1.0d)));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) map14);
        java.util.Set set16 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.String str22 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap18.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap18);
        int i27 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        java.lang.String str34 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.String str14 = defaultedMap10.toString();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap10.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        int i19 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap10.isEmpty();
        java.util.Set set24 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) set24);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) map6);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        defaultedMap9.clear();
        java.util.Collection collection11 = defaultedMap9.values();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.keySet();
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) map17);
        java.util.Set set19 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) map26);
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        boolean b37 = defaultedMap31.containsValue((java.lang.Object) map36);
        java.util.Set set38 = defaultedMap31.keySet();
        int i39 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.String str51 = defaultedMap47.toString();
        java.lang.String str52 = defaultedMap47.toString();
        java.util.Set set53 = defaultedMap47.entrySet();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj56 = defaultedMap47.put((java.lang.Object) 'a', (java.lang.Object) predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate43, predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) map64);
        java.util.Set set66 = defaultedMap59.keySet();
        int i67 = defaultedMap59.size();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.lang.String str73 = defaultedMap69.toString();
        java.lang.String str74 = defaultedMap69.toString();
        java.util.Set set75 = defaultedMap69.entrySet();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj78 = defaultedMap69.put((java.lang.Object) 'a', (java.lang.Object) predicate77);
        java.lang.Object obj80 = defaultedMap69.get((java.lang.Object) 10L);
        boolean b81 = defaultedMap59.equals(obj80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        boolean b89 = defaultedMap83.containsValue((java.lang.Object) map88);
        boolean b91 = defaultedMap83.containsValue((java.lang.Object) 0);
        java.lang.Object obj93 = defaultedMap83.remove((java.lang.Object) 10);
        boolean b94 = defaultedMap59.equals((java.lang.Object) defaultedMap83);
        java.lang.Object obj95 = defaultedMap12.put((java.lang.Object) defaultedMap21, (java.lang.Object) b94);
        java.lang.Object obj96 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        int i97 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (-1.0d) + "'", obj80.equals((-1.0d)));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + (-1.0d) + "'", obj96.equals((-1.0d)));
        org.junit.Assert.assertTrue(i97 == 0);
    }
}

