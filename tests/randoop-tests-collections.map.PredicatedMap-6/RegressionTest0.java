import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils20);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap24.toString();
        java.lang.Object obj29 = defaultedMap19.remove((java.lang.Object) defaultedMap24);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        java.util.Collection collection32 = defaultedMap31.values();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) predicate33);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        java.util.Collection collection37 = defaultedMap36.values();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap36.get((java.lang.Object) predicate38);
        java.lang.Object obj40 = defaultedMap19.put(obj34, obj39);
        java.lang.Object obj41 = defaultedMap6.put((java.lang.Object) str17, obj40);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) false);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) false);
        java.util.Collection collection15 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set17 = defaultedMap11.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap11);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) false);
        java.util.Collection collection26 = defaultedMap22.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        java.util.Set set29 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) false);
        java.util.Collection collection14 = defaultedMap10.values();
        defaultedMap10.clear();
        boolean b16 = defaultedMap3.containsKey((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        java.lang.Object obj20 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate21);
        boolean b24 = defaultedMap15.containsKey((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) (byte) 100);
        boolean b27 = defaultedMap15.isEmpty();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) false);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj17 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) predicate21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap7.put(obj22, obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap1.toString();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Set set10 = defaultedMap5.entrySet();
        java.util.Set set11 = defaultedMap5.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        boolean b7 = defaultedMap3.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) false);
        java.util.Collection collection17 = defaultedMap13.values();
        defaultedMap13.clear();
        java.util.Set set19 = defaultedMap13.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap13);
        java.util.Set set21 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Set set27 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) set27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set27);
        defaultedMap3.putAll(map29);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        java.lang.Object obj42 = defaultedMap32.remove((java.lang.Object) defaultedMap37);
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) predicate46);
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils48);
        java.util.Collection collection50 = defaultedMap49.values();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap49.get((java.lang.Object) predicate51);
        java.lang.Object obj53 = defaultedMap32.put(obj47, obj52);
        java.lang.Object obj54 = defaultedMap3.get(obj47);
        collections.Factory factory55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) predicate15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) predicate20);
        java.lang.Object obj22 = defaultedMap1.put(obj16, obj21);
        java.util.Set set23 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap12.values();
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set20 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) set26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set26);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        java.util.Collection collection30 = defaultedMap6.values();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap1.toString();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) false);
        java.util.Collection collection29 = defaultedMap25.values();
        defaultedMap25.clear();
        java.util.Set set31 = defaultedMap25.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap25);
        java.util.Set set33 = defaultedMap25.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Set set10 = defaultedMap5.entrySet();
        java.util.Set set11 = defaultedMap5.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set13 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Set set7 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        java.lang.Object obj20 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate21);
        boolean b24 = defaultedMap15.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils29);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) false);
        java.util.Collection collection34 = defaultedMap30.values();
        defaultedMap30.clear();
        java.util.Set set36 = defaultedMap30.keySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap30);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) false);
        java.util.Collection collection45 = defaultedMap41.values();
        defaultedMap26.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj47 = defaultedMap15.get((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        boolean b12 = defaultedMap10.equals((java.lang.Object) 0);
        boolean b13 = defaultedMap3.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap3.clear();
        boolean b15 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        defaultedMap3.clear();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap23.toString();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap23);
        java.lang.Object obj29 = defaultedMap3.remove(obj28);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        defaultedMap3.clear();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Set set17 = defaultedMap12.entrySet();
        java.util.Set set18 = defaultedMap12.keySet();
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap12);
        java.util.Collection collection20 = defaultedMap12.values();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap12.values();
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set20 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) set26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set26);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        java.util.Set set30 = defaultedMap6.keySet();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.clear();
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap12.values();
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set20 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) set26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set26);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection35 = defaultedMap31.values();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b41 = defaultedMap37.isEmpty();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils46);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils51);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.String str54 = defaultedMap50.toString();
        java.lang.Object obj55 = defaultedMap45.remove((java.lang.Object) defaultedMap50);
        defaultedMap43.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap37.containsValue((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils60);
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils62);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        collections.PredicateUtils predicateUtils65 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils65);
        collections.PredicateUtils predicateUtils67 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils67);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        java.lang.String str70 = defaultedMap66.toString();
        java.lang.Object obj71 = defaultedMap61.remove((java.lang.Object) defaultedMap66);
        collections.PredicateUtils predicateUtils72 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils72);
        collections.PredicateUtils predicateUtils74 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils74);
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.lang.String str77 = defaultedMap73.toString();
        java.lang.Object obj78 = defaultedMap61.get((java.lang.Object) defaultedMap73);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj80 = defaultedMap59.put((java.lang.Object) defaultedMap73, (java.lang.Object) predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate79, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate81, predicate83);
        java.lang.Object obj85 = defaultedMap6.get((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection20 = defaultedMap16.values();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) false);
        java.util.Collection collection30 = defaultedMap26.values();
        defaultedMap26.clear();
        java.util.Set set32 = defaultedMap26.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap26);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils34);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) false);
        java.util.Collection collection41 = defaultedMap37.values();
        defaultedMap22.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj43 = defaultedMap16.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj44 = defaultedMap1.get(obj43);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap12.values();
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils20);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) false);
        java.util.Collection collection27 = defaultedMap23.values();
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        java.util.Set set29 = defaultedMap8.entrySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set29);
        boolean b32 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        boolean b36 = defaultedMap34.equals((java.lang.Object) 0);
        boolean b37 = defaultedMap34.isEmpty();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) b37);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap14);
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils29);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.String str34 = defaultedMap30.toString();
        java.lang.Object obj35 = defaultedMap25.remove((java.lang.Object) defaultedMap30);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        java.lang.Object obj42 = defaultedMap25.get((java.lang.Object) defaultedMap37);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj44 = defaultedMap23.put((java.lang.Object) defaultedMap37, (java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate43, predicate45);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) false);
        java.util.Collection collection54 = defaultedMap50.values();
        boolean b55 = defaultedMap14.containsKey((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        defaultedMap3.clear();
        boolean b11 = defaultedMap3.isEmpty();
        java.util.Collection collection12 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) collection12);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        boolean b16 = defaultedMap14.isEmpty();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.String str35 = defaultedMap31.toString();
        java.lang.Object obj36 = defaultedMap26.remove((java.lang.Object) defaultedMap31);
        defaultedMap24.putAll((java.util.Map) defaultedMap31);
        boolean b38 = defaultedMap18.containsValue((java.lang.Object) defaultedMap31);
        boolean b39 = defaultedMap14.containsKey((java.lang.Object) b38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) b38);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap23.toString();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap23);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.isEmpty();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection36 = defaultedMap32.values();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b42 = defaultedMap38.isEmpty();
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils45);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils52);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap51.toString();
        java.lang.Object obj56 = defaultedMap46.remove((java.lang.Object) defaultedMap51);
        defaultedMap44.putAll((java.util.Map) defaultedMap51);
        boolean b58 = defaultedMap38.containsValue((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils61 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils61);
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils63);
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils66);
        collections.PredicateUtils predicateUtils68 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils68);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.lang.String str71 = defaultedMap67.toString();
        java.lang.Object obj72 = defaultedMap62.remove((java.lang.Object) defaultedMap67);
        collections.PredicateUtils predicateUtils73 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils73);
        collections.PredicateUtils predicateUtils75 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils75);
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        java.lang.String str78 = defaultedMap74.toString();
        java.lang.Object obj79 = defaultedMap62.get((java.lang.Object) defaultedMap74);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj81 = defaultedMap60.put((java.lang.Object) defaultedMap74, (java.lang.Object) predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate80, predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate82, predicate84);
        java.lang.Object obj86 = defaultedMap23.get((java.lang.Object) map85);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) false);
        java.util.Collection collection15 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set17 = defaultedMap11.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap11);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) false);
        java.util.Collection collection26 = defaultedMap22.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) predicate15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) predicate20);
        java.lang.Object obj22 = defaultedMap1.put(obj16, obj21);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap25.isEmpty();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils34);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.String str42 = defaultedMap38.toString();
        java.lang.Object obj43 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        defaultedMap31.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap25.containsValue((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils48);
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils53);
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils55);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        java.lang.String str58 = defaultedMap54.toString();
        java.lang.Object obj59 = defaultedMap49.remove((java.lang.Object) defaultedMap54);
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils60);
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils62);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.lang.String str65 = defaultedMap61.toString();
        java.lang.Object obj66 = defaultedMap49.get((java.lang.Object) defaultedMap61);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj68 = defaultedMap47.put((java.lang.Object) defaultedMap61, (java.lang.Object) predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate67, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate67, predicate71);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) (-1.0f));
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils20);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.Object obj26 = defaultedMap16.remove((java.lang.Object) defaultedMap21);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        java.util.Collection collection29 = defaultedMap28.values();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) predicate30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        java.util.Collection collection34 = defaultedMap33.values();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) predicate35);
        java.lang.Object obj37 = defaultedMap16.put(obj31, obj36);
        java.util.Collection collection38 = defaultedMap16.values();
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils41);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils46);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        java.lang.Object obj50 = defaultedMap40.remove((java.lang.Object) defaultedMap45);
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils51);
        java.util.Collection collection53 = defaultedMap52.values();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap52.get((java.lang.Object) predicate54);
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils56);
        java.util.Collection collection58 = defaultedMap57.values();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj60 = defaultedMap57.get((java.lang.Object) predicate59);
        java.lang.Object obj61 = defaultedMap40.put(obj55, obj60);
        java.lang.Object obj62 = defaultedMap16.get(obj60);
        boolean b63 = defaultedMap6.containsValue(obj62);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        java.lang.Object obj20 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate21);
        boolean b24 = defaultedMap15.containsKey((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection27 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        java.util.Collection collection32 = defaultedMap31.values();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) predicate33);
        java.util.Collection collection35 = defaultedMap31.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) collection35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        java.util.Collection collection39 = defaultedMap38.values();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) predicate40);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (-1.0d));
        java.lang.Object obj44 = defaultedMap15.put((java.lang.Object) collection35, (java.lang.Object) map43);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) false);
        java.util.Collection collection13 = defaultedMap9.values();
        defaultedMap9.clear();
        java.util.Set set15 = defaultedMap9.keySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) false);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        int i22 = defaultedMap16.size();
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) false);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str22 = defaultedMap1.toString();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) predicate26);
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils34);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) false);
        java.util.Collection collection39 = defaultedMap35.values();
        defaultedMap35.clear();
        java.util.Set set41 = defaultedMap35.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap35);
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils45);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) false);
        java.util.Collection collection50 = defaultedMap46.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap46);
        java.util.Set set52 = defaultedMap31.entrySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) set52);
        boolean b55 = defaultedMap24.equals((java.lang.Object) (short) 10);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils58);
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils60);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils63);
        collections.PredicateUtils predicateUtils65 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils65);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.String str68 = defaultedMap64.toString();
        java.lang.Object obj69 = defaultedMap59.remove((java.lang.Object) defaultedMap64);
        defaultedMap57.putAll((java.util.Map) defaultedMap64);
        boolean b71 = defaultedMap24.containsKey((java.lang.Object) defaultedMap57);
        java.lang.Object obj72 = defaultedMap1.remove((java.lang.Object) b71);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        java.util.Set set19 = defaultedMap14.entrySet();
        java.util.Set set20 = defaultedMap14.keySet();
        boolean b21 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection29 = defaultedMap25.values();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b35 = defaultedMap31.isEmpty();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils45);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.String str48 = defaultedMap44.toString();
        java.lang.Object obj49 = defaultedMap39.remove((java.lang.Object) defaultedMap44);
        defaultedMap37.putAll((java.util.Map) defaultedMap44);
        boolean b51 = defaultedMap31.containsValue((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils54);
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils56);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        collections.PredicateUtils predicateUtils61 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils61);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.String str64 = defaultedMap60.toString();
        java.lang.Object obj65 = defaultedMap55.remove((java.lang.Object) defaultedMap60);
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils66);
        collections.PredicateUtils predicateUtils68 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils68);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.lang.String str71 = defaultedMap67.toString();
        java.lang.Object obj72 = defaultedMap55.get((java.lang.Object) defaultedMap67);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj74 = defaultedMap53.put((java.lang.Object) defaultedMap67, (java.lang.Object) predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate73, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate75, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate77);
        try {
            java.util.Map map80 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap23.toString();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap23);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.isEmpty();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.util.Set set36 = defaultedMap32.entrySet();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.Object obj48 = defaultedMap38.remove((java.lang.Object) defaultedMap43);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        java.util.Collection collection51 = defaultedMap50.values();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap50.get((java.lang.Object) predicate52);
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils54);
        java.util.Collection collection56 = defaultedMap55.values();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap55.get((java.lang.Object) predicate57);
        java.lang.Object obj59 = defaultedMap38.put(obj53, obj58);
        boolean b60 = defaultedMap38.isEmpty();
        java.lang.Object obj61 = defaultedMap23.put((java.lang.Object) defaultedMap32, (java.lang.Object) b60);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.Object obj16 = defaultedMap6.remove((java.lang.Object) defaultedMap11);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.String str22 = defaultedMap18.toString();
        java.lang.Object obj23 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj25 = defaultedMap4.put((java.lang.Object) defaultedMap18, (java.lang.Object) predicate24);
        boolean b26 = defaultedMap1.equals((java.lang.Object) predicate24);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) false);
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.containsKey((java.lang.Object) (short) 10);
        defaultedMap8.clear();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.String str21 = defaultedMap17.toString();
        java.util.Set set22 = defaultedMap17.entrySet();
        java.util.Set set23 = defaultedMap17.keySet();
        boolean b24 = defaultedMap8.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) b24);
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        java.lang.Object obj20 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate21);
        java.util.Set set23 = defaultedMap1.entrySet();
        boolean b24 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) false);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Map map22 = null;
        try {
            defaultedMap16.putAll(map22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        defaultedMap3.clear();
        boolean b11 = defaultedMap3.isEmpty();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) false);
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        defaultedMap15.clear();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Set set29 = defaultedMap24.entrySet();
        java.util.Set set30 = defaultedMap24.keySet();
        boolean b31 = defaultedMap15.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        java.util.Collection collection35 = defaultedMap34.values();
        defaultedMap34.clear();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.String str42 = defaultedMap38.toString();
        java.util.Set set43 = defaultedMap38.entrySet();
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap34.get((java.lang.Object) defaultedMap38);
        boolean b46 = defaultedMap15.containsValue((java.lang.Object) defaultedMap38);
        boolean b47 = defaultedMap3.containsValue((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        boolean b7 = defaultedMap3.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) false);
        java.util.Collection collection17 = defaultedMap13.values();
        defaultedMap13.clear();
        java.util.Set set19 = defaultedMap13.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap13);
        java.util.Set set21 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Set set27 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) set27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set27);
        defaultedMap3.putAll(map29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap3.remove((java.lang.Object) predicate31);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) (short) 10);
        defaultedMap3.clear();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Set set17 = defaultedMap12.entrySet();
        java.util.Set set18 = defaultedMap12.keySet();
        boolean b19 = defaultedMap3.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        java.util.Collection collection23 = defaultedMap22.values();
        defaultedMap22.clear();
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap26.toString();
        java.util.Set set31 = defaultedMap26.entrySet();
        java.util.Set set32 = defaultedMap26.keySet();
        java.lang.Object obj33 = defaultedMap22.get((java.lang.Object) defaultedMap26);
        boolean b34 = defaultedMap3.containsValue((java.lang.Object) defaultedMap26);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Set set12 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) false);
        java.util.Collection collection23 = defaultedMap19.values();
        defaultedMap19.clear();
        java.util.Set set25 = defaultedMap19.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap19);
        java.util.Set set27 = defaultedMap19.keySet();
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.util.Set set33 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) set33);
        java.lang.Object obj36 = defaultedMap13.get((java.lang.Object) defaultedMap19);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Set set42 = defaultedMap38.entrySet();
        java.lang.Object obj43 = defaultedMap1.put(obj36, (java.lang.Object) defaultedMap38);
        java.lang.String str44 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{[]={}}" + "'", str44.equals("{[]={}}"));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap12.toString();
        java.lang.Object obj17 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) predicate21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap7.put(obj22, obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0);
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = defaultedMap7.equals((java.lang.Object) b34);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) 1L);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) defaultedMap22);
        boolean b24 = defaultedMap3.containsKey(obj23);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.String str31 = defaultedMap27.toString();
        java.lang.Object obj32 = defaultedMap22.remove((java.lang.Object) defaultedMap27);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap34.toString();
        java.lang.Object obj39 = defaultedMap22.get((java.lang.Object) defaultedMap34);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, obj39);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.String str12 = defaultedMap8.toString();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        java.util.Collection collection16 = defaultedMap15.values();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) predicate17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        java.util.Collection collection21 = defaultedMap20.values();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) predicate22);
        java.lang.Object obj24 = defaultedMap3.put(obj18, obj23);
        java.util.Collection collection25 = defaultedMap3.values();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) false);
        java.util.Collection collection7 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        boolean b12 = defaultedMap10.equals((java.lang.Object) 0);
        boolean b13 = defaultedMap3.containsValue((java.lang.Object) defaultedMap10);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) false);
        java.util.Collection collection23 = defaultedMap19.values();
        defaultedMap19.clear();
        java.util.Set set25 = defaultedMap19.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap19);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils29);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) false);
        java.util.Collection collection34 = defaultedMap30.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap30);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.util.Set set41 = defaultedMap37.entrySet();
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.lang.String str52 = defaultedMap48.toString();
        java.lang.Object obj53 = defaultedMap43.remove((java.lang.Object) defaultedMap48);
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils54);
        java.util.Collection collection56 = defaultedMap55.values();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap55.get((java.lang.Object) predicate57);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        java.util.Collection collection61 = defaultedMap60.values();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap60.get((java.lang.Object) predicate62);
        java.lang.Object obj64 = defaultedMap43.put(obj58, obj63);
        java.lang.Object obj65 = defaultedMap37.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap37.get(obj66);
        defaultedMap15.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj69 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj69);
    }
}

