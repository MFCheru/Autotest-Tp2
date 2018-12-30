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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0.0f);
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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map7 = null;
        try {
            defaultedMap1.putAll(map7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b25 = defaultedMap1.isEmpty();
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap27);
        java.lang.String str31 = defaultedMap1.toString();
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{false={}, {false={}}={}}" + "'", str31.equals("{false={}, {false={}}={}}"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 0 + "'", obj3.equals((short) 0));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        java.util.Set set12 = defaultedMap9.entrySet();
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap9.containsKey((java.lang.Object) 1L);
        boolean b19 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap9.entrySet();
        boolean b21 = defaultedMap9.isEmpty();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap24.toString();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b49 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        java.util.Set set51 = defaultedMap48.entrySet();
        java.util.Set set52 = defaultedMap48.keySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1.0f));
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b62 = defaultedMap61.isEmpty();
        defaultedMap61.clear();
        java.util.Set set64 = defaultedMap61.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b67 = defaultedMap66.isEmpty();
        defaultedMap66.clear();
        java.util.Set set69 = defaultedMap66.entrySet();
        java.util.Set set70 = defaultedMap66.keySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) (-1.0f));
        boolean b74 = defaultedMap66.containsKey((java.lang.Object) 1L);
        java.lang.Object obj75 = defaultedMap61.remove((java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b78 = defaultedMap77.isEmpty();
        defaultedMap77.clear();
        java.util.Set set80 = defaultedMap77.entrySet();
        java.util.Set set81 = defaultedMap77.keySet();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) (-1.0f));
        boolean b85 = defaultedMap77.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate87, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate89);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{false={}}" + "'", str30.equals("{false={}}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.util.Collection collection12 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (-1.0f));
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) 1L);
        boolean b27 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap17.entrySet();
        boolean b29 = defaultedMap17.isEmpty();
        java.util.Set set30 = defaultedMap17.entrySet();
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) set30);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) (short) 1);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) b40);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        boolean b35 = defaultedMap19.containsKey((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) set12);
        int i15 = defaultedMap1.size();
        int i16 = defaultedMap1.size();
        boolean b18 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 0 + "'", obj14.equals((short) 0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b30 = defaultedMap27.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        java.util.Set set35 = defaultedMap32.entrySet();
        java.util.Set set36 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap16.get((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b43 = defaultedMap42.isEmpty();
        defaultedMap42.clear();
        java.lang.Object obj45 = defaultedMap16.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap42);
        java.lang.String str46 = defaultedMap16.toString();
        java.util.Set set47 = defaultedMap16.entrySet();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) set47);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) 10L);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10L + "'", obj39.equals(10L));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{false={}, {false={}}={}}" + "'", str46.equals("{false={}, {false={}}={}}"));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 10L + "'", obj48.equals(10L));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 10L + "'", obj50.equals(10L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        java.util.Set set25 = defaultedMap22.entrySet();
        java.util.Set set26 = defaultedMap22.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) (-1.0d));
        java.lang.String str30 = defaultedMap17.toString();
        boolean b31 = defaultedMap6.containsValue((java.lang.Object) str30);
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap6.containsKey(obj32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10L + "'", obj27.equals(10L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "{false={}}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10L + "'", obj7.equals(10L));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b26 = defaultedMap16.containsValue((java.lang.Object) (short) -1);
        java.util.Set set27 = defaultedMap16.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b11 = defaultedMap10.isEmpty();
        defaultedMap10.clear();
        java.util.Set set13 = defaultedMap10.entrySet();
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1.0f));
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 1L);
        boolean b20 = defaultedMap10.equals((java.lang.Object) (byte) 0);
        java.util.Set set21 = defaultedMap10.entrySet();
        boolean b22 = defaultedMap10.isEmpty();
        java.util.Set set23 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b31 = defaultedMap30.isEmpty();
        defaultedMap30.clear();
        java.util.Set set33 = defaultedMap30.entrySet();
        java.util.Set set34 = defaultedMap30.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap25.remove((java.lang.Object) (-1.0d));
        java.util.Set set38 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap43.clear();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) false, (java.lang.Object) defaultedMap43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) ' ');
        java.lang.Object obj48 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        boolean b49 = defaultedMap25.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) false, (java.lang.Object) defaultedMap55);
        java.lang.String str58 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b61 = defaultedMap60.isEmpty();
        defaultedMap60.clear();
        java.util.Set set63 = defaultedMap60.entrySet();
        java.util.Set set64 = defaultedMap60.keySet();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (-1.0f));
        boolean b68 = defaultedMap60.containsKey((java.lang.Object) 1L);
        boolean b70 = defaultedMap60.equals((java.lang.Object) (byte) 0);
        java.util.Set set71 = defaultedMap60.entrySet();
        boolean b72 = defaultedMap60.isEmpty();
        java.lang.Object obj73 = defaultedMap52.remove((java.lang.Object) b72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap78.clear();
        java.lang.Object obj80 = defaultedMap75.put((java.lang.Object) false, (java.lang.Object) defaultedMap78);
        java.lang.String str81 = defaultedMap75.toString();
        java.lang.Object obj83 = defaultedMap52.put((java.lang.Object) defaultedMap75, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b86 = defaultedMap85.isEmpty();
        defaultedMap85.clear();
        java.util.Set set88 = defaultedMap85.entrySet();
        java.util.Set set89 = defaultedMap85.keySet();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) (-1.0f));
        boolean b93 = defaultedMap85.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate94, predicate95);
        java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) predicate95);
        java.lang.Object obj98 = defaultedMap10.remove((java.lang.Object) map97);
        java.lang.Object obj99 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10L + "'", obj7.equals(10L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10L + "'", obj35.equals(10L));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{false={}}" + "'", str58.equals("{false={}}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{false={}}" + "'", str81.equals("{false={}}"));
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + 10L + "'", obj99.equals(10L));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b26 = defaultedMap16.containsValue((java.lang.Object) (short) -1);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.lang.String str14 = defaultedMap1.toString();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap1.equals(obj15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        defaultedMap19.clear();
        java.util.Set set22 = defaultedMap19.entrySet();
        java.util.Set set23 = defaultedMap19.keySet();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1.0f));
        boolean b27 = defaultedMap19.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap1.put(obj17, (java.lang.Object) predicate28);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        boolean b51 = defaultedMap43.containsKey((java.lang.Object) 1L);
        boolean b53 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        int i54 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) (short) 1);
        java.util.Collection collection60 = defaultedMap56.values();
        java.lang.Object obj61 = defaultedMap16.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap56);
        java.util.Collection collection62 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) '#');
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        boolean b16 = defaultedMap6.equals((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap6.entrySet();
        boolean b18 = defaultedMap6.isEmpty();
        java.util.Set set19 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        java.util.Set set29 = defaultedMap26.entrySet();
        java.util.Set set30 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) set30);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) (-1.0d));
        java.util.Set set34 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap39.clear();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) false, (java.lang.Object) defaultedMap39);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) ' ');
        java.lang.Object obj44 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        boolean b45 = defaultedMap21.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b49 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        java.util.Set set51 = defaultedMap48.entrySet();
        java.util.Set set52 = defaultedMap48.keySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1.0f));
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) 1L);
        boolean b58 = defaultedMap48.equals((java.lang.Object) (byte) 0);
        int i59 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) (short) 1);
        java.util.Collection collection65 = defaultedMap61.values();
        java.lang.Object obj66 = defaultedMap21.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap61);
        boolean b67 = defaultedMap1.containsValue(obj66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10L + "'", obj31.equals(10L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        int i25 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        java.util.Set set30 = defaultedMap27.entrySet();
        java.util.Set set31 = defaultedMap27.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        boolean b35 = defaultedMap27.containsKey((java.lang.Object) 1L);
        boolean b37 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap27.entrySet();
        boolean b39 = defaultedMap27.isEmpty();
        java.util.Set set40 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b45 = defaultedMap42.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b48 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.util.Set set51 = defaultedMap47.keySet();
        java.lang.Object obj52 = defaultedMap42.get((java.lang.Object) set51);
        java.lang.Object obj54 = defaultedMap42.remove((java.lang.Object) (-1.0d));
        java.util.Set set55 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap60.clear();
        java.lang.Object obj62 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) defaultedMap60);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) ' ');
        java.lang.Object obj65 = defaultedMap42.remove((java.lang.Object) defaultedMap57);
        boolean b66 = defaultedMap42.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b70 = defaultedMap69.isEmpty();
        defaultedMap69.clear();
        java.util.Set set72 = defaultedMap69.entrySet();
        java.util.Set set73 = defaultedMap69.keySet();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (-1.0f));
        boolean b77 = defaultedMap69.containsKey((java.lang.Object) 1L);
        boolean b79 = defaultedMap69.equals((java.lang.Object) (byte) 0);
        int i80 = defaultedMap69.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b85 = defaultedMap82.equals((java.lang.Object) (short) 1);
        java.util.Collection collection86 = defaultedMap82.values();
        java.lang.Object obj87 = defaultedMap42.put((java.lang.Object) defaultedMap69, (java.lang.Object) defaultedMap82);
        defaultedMap1.putAll((java.util.Map) defaultedMap82);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 10L + "'", obj52.equals(10L));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) false, (java.lang.Object) defaultedMap41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b48 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj51 = defaultedMap35.put((java.lang.Object) map45, (java.lang.Object) set50);
        defaultedMap1.putAll(map45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap57.clear();
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) false, (java.lang.Object) defaultedMap57);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b66 = defaultedMap65.isEmpty();
        boolean b68 = defaultedMap65.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b71 = defaultedMap70.isEmpty();
        defaultedMap70.clear();
        java.util.Set set73 = defaultedMap70.entrySet();
        java.util.Set set74 = defaultedMap70.keySet();
        java.lang.Object obj75 = defaultedMap65.get((java.lang.Object) set74);
        java.lang.Object obj76 = defaultedMap63.get((java.lang.Object) set74);
        java.lang.Object obj77 = defaultedMap54.get((java.lang.Object) set74);
        boolean b79 = defaultedMap54.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        defaultedMap54.clear();
        java.util.Map map81 = collections.map.DefaultedMap.decorate(map45, (java.lang.Object) defaultedMap54);
        collections.Transformer transformer82 = null;
        try {
            java.util.Map map83 = collections.map.DefaultedMap.decorate(map81, transformer82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 10L + "'", obj75.equals(10L));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) 0 + "'", obj76.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 10L + "'", obj77.equals(10L));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b30 = defaultedMap27.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        java.util.Set set35 = defaultedMap32.entrySet();
        java.util.Set set36 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap16.get((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10L + "'", obj39.equals(10L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        java.util.Set set29 = defaultedMap26.entrySet();
        java.util.Set set30 = defaultedMap26.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (-1.0f));
        boolean b33 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set34 = defaultedMap19.keySet();
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.lang.String str10 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Set set16 = defaultedMap12.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1.0f));
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) 1L);
        boolean b22 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap12.entrySet();
        boolean b24 = defaultedMap12.isEmpty();
        java.lang.Object obj25 = defaultedMap4.remove((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap30.clear();
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) false, (java.lang.Object) defaultedMap30);
        java.lang.String str33 = defaultedMap27.toString();
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) defaultedMap27, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b38 = defaultedMap37.isEmpty();
        defaultedMap37.clear();
        java.util.Set set40 = defaultedMap37.entrySet();
        java.util.Set set41 = defaultedMap37.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1.0f));
        boolean b45 = defaultedMap37.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate46, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap52);
        defaultedMap1.putAll((java.util.Map) defaultedMap53);
        java.util.Set set55 = defaultedMap53.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{false={}}" + "'", str10.equals("{false={}}"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{false={}}" + "'", str33.equals("{false={}}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 0 + "'", obj50.equals((short) 0));
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        int i13 = defaultedMap1.size();
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap27);
        java.lang.String str31 = defaultedMap1.toString();
        java.util.Set set32 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsKey((java.lang.Object) 1L);
        boolean b44 = defaultedMap34.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = defaultedMap34.toString();
        java.util.Set set46 = defaultedMap34.keySet();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) set46, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{false={}, {false={}}={}}" + "'", str31.equals("{false={}, {false={}}={}}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b16 = defaultedMap15.isEmpty();
        defaultedMap15.clear();
        java.util.Set set18 = defaultedMap15.entrySet();
        java.util.Set set19 = defaultedMap15.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        boolean b23 = defaultedMap15.containsKey((java.lang.Object) 1L);
        boolean b25 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap15.entrySet();
        boolean b27 = defaultedMap15.isEmpty();
        java.util.Set set28 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b36 = defaultedMap35.isEmpty();
        defaultedMap35.clear();
        java.util.Set set38 = defaultedMap35.entrySet();
        java.util.Set set39 = defaultedMap35.keySet();
        java.lang.Object obj40 = defaultedMap30.get((java.lang.Object) set39);
        java.lang.Object obj42 = defaultedMap30.remove((java.lang.Object) (-1.0d));
        java.util.Set set43 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap48.clear();
        java.lang.Object obj50 = defaultedMap45.put((java.lang.Object) false, (java.lang.Object) defaultedMap48);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) ' ');
        java.lang.Object obj53 = defaultedMap30.remove((java.lang.Object) defaultedMap45);
        boolean b54 = defaultedMap30.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b58 = defaultedMap57.isEmpty();
        defaultedMap57.clear();
        java.util.Set set60 = defaultedMap57.entrySet();
        java.util.Set set61 = defaultedMap57.keySet();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) (-1.0f));
        boolean b65 = defaultedMap57.containsKey((java.lang.Object) 1L);
        boolean b67 = defaultedMap57.equals((java.lang.Object) (byte) 0);
        int i68 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b71 = defaultedMap70.isEmpty();
        boolean b73 = defaultedMap70.equals((java.lang.Object) (short) 1);
        java.util.Collection collection74 = defaultedMap70.values();
        java.lang.Object obj75 = defaultedMap30.put((java.lang.Object) defaultedMap57, (java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b78 = defaultedMap77.isEmpty();
        defaultedMap77.clear();
        java.util.Set set80 = defaultedMap77.entrySet();
        java.util.Set set81 = defaultedMap77.keySet();
        java.lang.Object obj82 = null;
        java.lang.Object obj83 = defaultedMap77.get(obj82);
        java.util.Collection collection84 = defaultedMap77.values();
        java.util.Set set85 = defaultedMap77.entrySet();
        boolean b86 = defaultedMap57.equals((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap91.clear();
        java.lang.Object obj93 = defaultedMap88.put((java.lang.Object) false, (java.lang.Object) defaultedMap91);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) ' ');
        boolean b96 = defaultedMap77.containsValue((java.lang.Object) defaultedMap88);
        boolean b97 = defaultedMap1.equals((java.lang.Object) b96);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10L + "'", obj40.equals(10L));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 10L + "'", obj83.equals(10L));
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        int i7 = defaultedMap4.size();
        java.util.Set set8 = defaultedMap4.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.util.Collection collection16 = defaultedMap6.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        java.util.Set set12 = defaultedMap9.entrySet();
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap9.containsKey((java.lang.Object) 1L);
        boolean b19 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap9.entrySet();
        boolean b21 = defaultedMap9.isEmpty();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap24.toString();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsKey((java.lang.Object) 1L);
        java.lang.Object obj43 = defaultedMap24.get((java.lang.Object) b42);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{false={}}" + "'", str30.equals("{false={}}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        boolean b51 = defaultedMap43.containsKey((java.lang.Object) 1L);
        boolean b53 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        int i54 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) (short) 1);
        java.util.Collection collection60 = defaultedMap56.values();
        java.lang.Object obj61 = defaultedMap16.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap66.clear();
        java.lang.Object obj68 = defaultedMap63.put((java.lang.Object) false, (java.lang.Object) defaultedMap66);
        java.lang.String str69 = defaultedMap63.toString();
        java.lang.Object obj71 = defaultedMap63.get((java.lang.Object) (-1.0d));
        java.lang.Object obj72 = defaultedMap43.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b75 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        java.util.Set set77 = defaultedMap74.entrySet();
        java.util.Set set78 = defaultedMap74.keySet();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) (-1.0f));
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) 1L);
        boolean b84 = defaultedMap74.equals((java.lang.Object) (byte) 0);
        java.lang.String str85 = defaultedMap74.toString();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Collection collection89 = defaultedMap88.values();
        defaultedMap74.putAll((java.util.Map) defaultedMap88);
        java.util.Set set91 = defaultedMap74.entrySet();
        java.lang.Object obj92 = defaultedMap43.get((java.lang.Object) defaultedMap74);
        boolean b93 = defaultedMap43.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{false={}}" + "'", str69.equals("{false={}}"));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 10L + "'", obj71.equals(10L));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 10L + "'", obj92.equals(10L));
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Set set26 = defaultedMap23.entrySet();
        java.util.Set set27 = defaultedMap23.keySet();
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) set27);
        java.lang.Object obj29 = defaultedMap16.remove((java.lang.Object) set27);
        java.lang.Object obj30 = defaultedMap1.get(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap1.equals((java.lang.Object) set33);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10L + "'", obj28.equals(10L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b16 = defaultedMap15.isEmpty();
        defaultedMap15.clear();
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 'a');
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Map map25 = null;
        try {
            defaultedMap15.putAll(map25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10L + "'", obj20.equals(10L));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) 10);
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj30 = defaultedMap23.get((java.lang.Object) 10);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b34 = defaultedMap33.isEmpty();
        defaultedMap33.clear();
        java.util.Set set36 = defaultedMap33.entrySet();
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.lang.Object obj51 = defaultedMap41.get((java.lang.Object) set50);
        java.lang.Object obj53 = defaultedMap41.remove((java.lang.Object) (-1.0d));
        java.util.Set set54 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap59.clear();
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) false, (java.lang.Object) defaultedMap59);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) ' ');
        java.lang.Object obj64 = defaultedMap41.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj65 = defaultedMap33.get((java.lang.Object) defaultedMap56);
        java.util.Set set66 = defaultedMap33.entrySet();
        boolean b67 = defaultedMap23.containsKey((java.lang.Object) set66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10L + "'", obj18.equals(10L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10L + "'", obj20.equals(10L));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10L + "'", obj28.equals(10L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 10L + "'", obj51.equals(10L));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 10L + "'", obj65.equals(10L));
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        defaultedMap1.clear();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        int i25 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b30 = defaultedMap27.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        java.util.Set set35 = defaultedMap32.entrySet();
        java.util.Set set36 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap27.remove((java.lang.Object) (-1.0d));
        java.util.Set set40 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap45.clear();
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) defaultedMap45);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) ' ');
        java.lang.Object obj50 = defaultedMap27.remove((java.lang.Object) defaultedMap42);
        int i51 = defaultedMap27.size();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.Transformer transformer57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) 10);
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj30 = defaultedMap23.get((java.lang.Object) 10);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap23);
        defaultedMap13.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10L + "'", obj18.equals(10L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10L + "'", obj20.equals(10L));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10L + "'", obj28.equals(10L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b23 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        java.util.Set set25 = defaultedMap22.entrySet();
        java.util.Set set26 = defaultedMap22.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        java.lang.Object obj29 = defaultedMap17.remove((java.lang.Object) (-1.0d));
        java.lang.String str30 = defaultedMap17.toString();
        boolean b31 = defaultedMap6.containsValue((java.lang.Object) str30);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10L + "'", obj27.equals(10L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        defaultedMap3.clear();
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 'a');
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) map11);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10L + "'", obj8.equals(10L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 10);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L + "'", obj6.equals(10L));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10L + "'", obj8.equals(10L));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Set set16 = defaultedMap12.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10L + "'", obj9.equals(10L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L + "'", obj19.equals(10L));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap58);
        boolean b60 = defaultedMap1.equals((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        int i7 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) false, (java.lang.Object) defaultedMap15);
        java.lang.String str18 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap20.clear();
        java.util.Set set23 = defaultedMap20.entrySet();
        java.util.Set set24 = defaultedMap20.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1.0f));
        boolean b28 = defaultedMap20.containsKey((java.lang.Object) 1L);
        boolean b30 = defaultedMap20.equals((java.lang.Object) (byte) 0);
        java.util.Set set31 = defaultedMap20.entrySet();
        boolean b32 = defaultedMap20.isEmpty();
        java.lang.Object obj33 = defaultedMap12.remove((java.lang.Object) b32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap38.clear();
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) false, (java.lang.Object) defaultedMap38);
        java.lang.String str41 = defaultedMap35.toString();
        java.lang.Object obj43 = defaultedMap12.put((java.lang.Object) defaultedMap35, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b46 = defaultedMap45.isEmpty();
        defaultedMap45.clear();
        java.util.Set set48 = defaultedMap45.entrySet();
        java.util.Set set49 = defaultedMap45.keySet();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (-1.0f));
        boolean b53 = defaultedMap45.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap9.get((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b61 = defaultedMap60.isEmpty();
        defaultedMap60.clear();
        java.util.Set set63 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b66 = defaultedMap65.isEmpty();
        defaultedMap65.clear();
        java.util.Set set68 = defaultedMap65.entrySet();
        java.util.Set set69 = defaultedMap65.keySet();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) (-1.0f));
        boolean b73 = defaultedMap65.containsKey((java.lang.Object) 1L);
        java.lang.Object obj74 = defaultedMap60.remove((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b77 = defaultedMap76.isEmpty();
        defaultedMap76.clear();
        java.util.Set set79 = defaultedMap76.entrySet();
        java.util.Set set80 = defaultedMap76.keySet();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) (-1.0f));
        boolean b84 = defaultedMap76.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate86, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate55, predicate88);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{false={}}" + "'", str18.equals("{false={}}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{false={}}" + "'", str41.equals("{false={}}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10L + "'", obj10.equals(10L));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str26 = defaultedMap25.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap32.clear();
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) false, (java.lang.Object) defaultedMap32);
        java.lang.String str35 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b38 = defaultedMap37.isEmpty();
        defaultedMap37.clear();
        java.util.Set set40 = defaultedMap37.entrySet();
        java.util.Set set41 = defaultedMap37.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1.0f));
        boolean b45 = defaultedMap37.containsKey((java.lang.Object) 1L);
        boolean b47 = defaultedMap37.equals((java.lang.Object) (byte) 0);
        java.util.Set set48 = defaultedMap37.entrySet();
        boolean b49 = defaultedMap37.isEmpty();
        java.lang.Object obj50 = defaultedMap29.remove((java.lang.Object) b49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) false, (java.lang.Object) defaultedMap55);
        java.lang.String str58 = defaultedMap52.toString();
        java.lang.Object obj60 = defaultedMap29.put((java.lang.Object) defaultedMap52, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b63 = defaultedMap62.isEmpty();
        defaultedMap62.clear();
        java.util.Set set65 = defaultedMap62.entrySet();
        java.util.Set set66 = defaultedMap62.keySet();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) (-1.0f));
        boolean b70 = defaultedMap62.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate71, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate72);
        boolean b75 = defaultedMap1.equals((java.lang.Object) predicate72);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10L + "'", obj27.equals(10L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{false={}}" + "'", str35.equals("{false={}}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{false={}}" + "'", str58.equals("{false={}}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        boolean b51 = defaultedMap43.containsKey((java.lang.Object) 1L);
        boolean b53 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        int i54 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) (short) 1);
        java.util.Collection collection60 = defaultedMap56.values();
        java.lang.Object obj61 = defaultedMap16.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap63.get(obj68);
        java.util.Collection collection70 = defaultedMap63.values();
        java.util.Set set71 = defaultedMap63.entrySet();
        boolean b72 = defaultedMap43.equals((java.lang.Object) defaultedMap63);
        defaultedMap43.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10L + "'", obj69.equals(10L));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) false, (java.lang.Object) defaultedMap41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b48 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj51 = defaultedMap35.put((java.lang.Object) map45, (java.lang.Object) set50);
        defaultedMap1.putAll(map45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap57.clear();
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) false, (java.lang.Object) defaultedMap57);
        java.lang.String str60 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b63 = defaultedMap62.isEmpty();
        defaultedMap62.clear();
        java.util.Set set65 = defaultedMap62.entrySet();
        java.util.Set set66 = defaultedMap62.keySet();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) (-1.0f));
        boolean b70 = defaultedMap62.containsKey((java.lang.Object) 1L);
        boolean b72 = defaultedMap62.equals((java.lang.Object) (byte) 0);
        java.util.Set set73 = defaultedMap62.entrySet();
        boolean b74 = defaultedMap62.isEmpty();
        java.lang.Object obj75 = defaultedMap54.remove((java.lang.Object) b74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap80.clear();
        java.lang.Object obj82 = defaultedMap77.put((java.lang.Object) false, (java.lang.Object) defaultedMap80);
        java.lang.String str83 = defaultedMap77.toString();
        java.lang.Object obj85 = defaultedMap54.put((java.lang.Object) defaultedMap77, (java.lang.Object) (short) 0);
        collections.PredicateUtils predicateUtils86 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils86);
        boolean b88 = defaultedMap77.equals((java.lang.Object) predicateUtils86);
        java.util.Map map89 = collections.map.DefaultedMap.decorate(map45, (java.lang.Object) predicateUtils86);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{false={}}" + "'", str60.equals("{false={}}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{false={}}" + "'", str83.equals("{false={}}"));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap46.clear();
        java.lang.Object obj48 = defaultedMap43.put((java.lang.Object) false, (java.lang.Object) defaultedMap46);
        java.lang.String str49 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b52 = defaultedMap51.isEmpty();
        defaultedMap51.clear();
        java.util.Set set54 = defaultedMap51.entrySet();
        java.util.Set set55 = defaultedMap51.keySet();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1.0f));
        boolean b59 = defaultedMap51.containsKey((java.lang.Object) 1L);
        boolean b61 = defaultedMap51.equals((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap51.entrySet();
        boolean b63 = defaultedMap51.isEmpty();
        java.lang.Object obj64 = defaultedMap43.remove((java.lang.Object) b63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap69.clear();
        java.lang.Object obj71 = defaultedMap66.put((java.lang.Object) false, (java.lang.Object) defaultedMap69);
        java.lang.String str72 = defaultedMap66.toString();
        java.lang.Object obj74 = defaultedMap43.put((java.lang.Object) defaultedMap66, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b77 = defaultedMap76.isEmpty();
        defaultedMap76.clear();
        java.util.Set set79 = defaultedMap76.entrySet();
        java.util.Set set80 = defaultedMap76.keySet();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) (-1.0f));
        boolean b84 = defaultedMap76.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate85, predicate86);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate86);
        java.lang.Object obj89 = defaultedMap1.remove((java.lang.Object) map88);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b92 = defaultedMap91.isEmpty();
        defaultedMap91.clear();
        java.util.Set set94 = defaultedMap91.entrySet();
        java.util.Set set95 = defaultedMap91.keySet();
        java.lang.Object obj96 = null;
        java.lang.Object obj97 = defaultedMap91.get(obj96);
        java.lang.Object obj98 = defaultedMap1.get((java.lang.Object) defaultedMap91);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{false={}}" + "'", str49.equals("{false={}}"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{false={}}" + "'", str72.equals("{false={}}"));
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + 10L + "'", obj97.equals(10L));
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + 10L + "'", obj98.equals(10L));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap33.clear();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) defaultedMap33);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b40 = defaultedMap39.isEmpty();
        defaultedMap39.clear();
        java.util.Set set42 = defaultedMap39.entrySet();
        java.lang.Object obj43 = defaultedMap27.put((java.lang.Object) map37, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b48 = defaultedMap45.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b51 = defaultedMap50.isEmpty();
        defaultedMap50.clear();
        java.util.Set set53 = defaultedMap50.entrySet();
        java.util.Set set54 = defaultedMap50.keySet();
        java.lang.Object obj55 = defaultedMap45.get((java.lang.Object) set54);
        java.lang.Object obj57 = defaultedMap45.remove((java.lang.Object) (-1.0d));
        java.lang.String str58 = defaultedMap45.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap61.clear();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap67.clear();
        java.lang.Object obj69 = defaultedMap64.put((java.lang.Object) false, (java.lang.Object) defaultedMap67);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b74 = defaultedMap73.isEmpty();
        defaultedMap73.clear();
        java.util.Set set76 = defaultedMap73.entrySet();
        java.lang.Object obj77 = defaultedMap61.put((java.lang.Object) map71, (java.lang.Object) set76);
        defaultedMap27.putAll(map71);
        defaultedMap25.putAll(map71);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 10L + "'", obj55.equals(10L));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b25 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap33.clear();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) defaultedMap33);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b40 = defaultedMap39.isEmpty();
        defaultedMap39.clear();
        java.util.Set set42 = defaultedMap39.entrySet();
        java.lang.Object obj43 = defaultedMap27.put((java.lang.Object) map37, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Map map46 = collections.map.DefaultedMap.decorate(map37, (java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        java.util.Set set52 = defaultedMap49.entrySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b55 = defaultedMap54.isEmpty();
        defaultedMap54.clear();
        java.util.Set set57 = defaultedMap54.entrySet();
        java.util.Set set58 = defaultedMap54.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) (-1.0f));
        boolean b62 = defaultedMap54.containsKey((java.lang.Object) 1L);
        java.lang.Object obj63 = defaultedMap49.remove((java.lang.Object) defaultedMap54);
        java.lang.Object obj64 = defaultedMap1.get(obj63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b67 = defaultedMap66.isEmpty();
        defaultedMap66.clear();
        java.util.Set set69 = defaultedMap66.entrySet();
        java.util.Set set70 = defaultedMap66.keySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b80 = defaultedMap79.isEmpty();
        defaultedMap79.clear();
        java.util.Set set82 = defaultedMap79.entrySet();
        java.util.Set set83 = defaultedMap79.keySet();
        java.lang.Object obj84 = defaultedMap74.get((java.lang.Object) set83);
        java.lang.Object obj86 = defaultedMap74.remove((java.lang.Object) (-1.0d));
        java.util.Set set87 = defaultedMap74.entrySet();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap92.clear();
        java.lang.Object obj94 = defaultedMap89.put((java.lang.Object) false, (java.lang.Object) defaultedMap92);
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap89, (java.lang.Object) ' ');
        java.lang.Object obj97 = defaultedMap74.remove((java.lang.Object) defaultedMap89);
        java.lang.Object obj98 = defaultedMap66.get((java.lang.Object) defaultedMap89);
        defaultedMap1.putAll((java.util.Map) defaultedMap66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 10L + "'", obj47.equals(10L));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 10L + "'", obj64.equals(10L));
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 10L + "'", obj84.equals(10L));
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + 10L + "'", obj98.equals(10L));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap27);
        java.lang.String str31 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap36.clear();
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) false, (java.lang.Object) defaultedMap36);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b47 = defaultedMap44.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        java.util.Set set52 = defaultedMap49.entrySet();
        java.util.Set set53 = defaultedMap49.keySet();
        java.lang.Object obj54 = defaultedMap44.get((java.lang.Object) set53);
        java.lang.Object obj55 = defaultedMap42.get((java.lang.Object) set53);
        java.lang.Object obj56 = defaultedMap33.get((java.lang.Object) set53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b60 = defaultedMap59.isEmpty();
        defaultedMap59.clear();
        java.lang.Object obj62 = defaultedMap33.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap59);
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{false={}, {false={}}={}}" + "'", str31.equals("{false={}, {false={}}={}}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 10L + "'", obj54.equals(10L));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) 0 + "'", obj55.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 10L + "'", obj56.equals(10L));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 10L + "'", obj63.equals(10L));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap18.clear();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) false, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap15.toString();
        boolean b23 = defaultedMap15.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap28.clear();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) false, (java.lang.Object) defaultedMap28);
        java.util.Set set31 = defaultedMap25.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) set31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{false={}}" + "'", str21.equals("{false={}}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap6.clear();
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) defaultedMap6);
        java.lang.String str9 = defaultedMap3.toString();
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set12 = defaultedMap3.keySet();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = defaultedMap1.remove(obj14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{false={}}" + "'", str9.equals("{false={}}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        java.util.Set set14 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        defaultedMap25.clear();
        java.util.Set set28 = defaultedMap25.entrySet();
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) set29);
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) (-1.0d));
        java.lang.String str33 = defaultedMap20.toString();
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) str33);
        boolean b35 = defaultedMap11.containsValue((java.lang.Object) str33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        java.lang.Object obj37 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        boolean b38 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b48 = defaultedMap45.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b51 = defaultedMap50.isEmpty();
        defaultedMap50.clear();
        java.util.Set set53 = defaultedMap50.entrySet();
        java.util.Set set54 = defaultedMap50.keySet();
        java.lang.Object obj55 = defaultedMap45.get((java.lang.Object) set54);
        java.lang.Object obj56 = defaultedMap43.get((java.lang.Object) set54);
        int i57 = defaultedMap43.size();
        int i58 = defaultedMap43.size();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 10L + "'", obj55.equals(10L));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 0 + "'", obj56.equals((short) 0));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        boolean b51 = defaultedMap43.containsKey((java.lang.Object) 1L);
        boolean b53 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        int i54 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) (short) 1);
        java.util.Collection collection60 = defaultedMap56.values();
        java.lang.Object obj61 = defaultedMap16.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap63.get(obj68);
        java.util.Collection collection70 = defaultedMap63.values();
        java.util.Set set71 = defaultedMap63.entrySet();
        boolean b72 = defaultedMap43.equals((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap77.clear();
        java.lang.Object obj79 = defaultedMap74.put((java.lang.Object) false, (java.lang.Object) defaultedMap77);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) ' ');
        boolean b82 = defaultedMap63.containsValue((java.lang.Object) defaultedMap74);
        java.util.Set set83 = defaultedMap63.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10L + "'", obj69.equals(10L));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b63 = defaultedMap60.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b66 = defaultedMap65.isEmpty();
        defaultedMap65.clear();
        java.util.Set set68 = defaultedMap65.entrySet();
        java.util.Set set69 = defaultedMap65.keySet();
        java.lang.Object obj70 = defaultedMap60.get((java.lang.Object) set69);
        java.lang.Object obj71 = defaultedMap58.get((java.lang.Object) set69);
        java.util.Collection collection72 = defaultedMap58.values();
        boolean b73 = defaultedMap1.equals((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 10L + "'", obj70.equals(10L));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 0 + "'", obj71.equals((short) 0));
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b30 = defaultedMap27.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b33 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        java.util.Set set35 = defaultedMap32.entrySet();
        java.util.Set set36 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap16.get((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b43 = defaultedMap42.isEmpty();
        defaultedMap42.clear();
        java.lang.Object obj45 = defaultedMap16.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap42);
        java.lang.String str46 = defaultedMap16.toString();
        java.util.Set set47 = defaultedMap16.entrySet();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) set47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) set47);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10L + "'", obj39.equals(10L));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{false={}, {false={}}={}}" + "'", str46.equals("{false={}, {false={}}={}}"));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 10L + "'", obj48.equals(10L));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.Factory factory57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        java.util.Set set7 = defaultedMap4.entrySet();
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b19 = defaultedMap18.isEmpty();
        defaultedMap18.clear();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) set22);
        java.lang.Object obj25 = defaultedMap13.remove((java.lang.Object) (-1.0d));
        java.lang.String str26 = defaultedMap13.toString();
        boolean b27 = defaultedMap10.containsKey((java.lang.Object) str26);
        boolean b28 = defaultedMap4.containsValue((java.lang.Object) str26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10L + "'", obj23.equals(10L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        java.util.Set set12 = defaultedMap9.entrySet();
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap9.containsKey((java.lang.Object) 1L);
        boolean b19 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap9.entrySet();
        boolean b21 = defaultedMap9.isEmpty();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap24.toString();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b45 = defaultedMap42.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b48 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.util.Set set51 = defaultedMap47.keySet();
        java.lang.Object obj52 = defaultedMap42.get((java.lang.Object) set51);
        java.lang.Object obj54 = defaultedMap42.remove((java.lang.Object) (-1.0d));
        java.util.Set set55 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap60.clear();
        java.lang.Object obj62 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) defaultedMap60);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) ' ');
        java.lang.Object obj65 = defaultedMap42.remove((java.lang.Object) defaultedMap57);
        java.lang.Object obj66 = defaultedMap34.get((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b69 = defaultedMap68.isEmpty();
        defaultedMap68.clear();
        java.util.Set set71 = defaultedMap68.entrySet();
        java.util.Set set72 = defaultedMap68.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) (-1.0f));
        boolean b76 = defaultedMap68.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b79 = defaultedMap78.isEmpty();
        defaultedMap78.clear();
        java.util.Set set81 = defaultedMap78.entrySet();
        java.util.Set set82 = defaultedMap78.keySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) (-1.0f));
        boolean b86 = defaultedMap78.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate87, predicate88);
        boolean b90 = defaultedMap68.equals((java.lang.Object) predicate87);
        java.lang.Object obj91 = defaultedMap57.get((java.lang.Object) b90);
        java.lang.Object obj92 = defaultedMap24.get(obj91);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{false={}}" + "'", str30.equals("{false={}}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 10L + "'", obj52.equals(10L));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 10L + "'", obj66.equals(10L));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 10L + "'", obj92.equals(10L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        java.util.Set set14 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        defaultedMap25.clear();
        java.util.Set set28 = defaultedMap25.entrySet();
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) set29);
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) (-1.0d));
        java.lang.String str33 = defaultedMap20.toString();
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) str33);
        boolean b35 = defaultedMap11.containsValue((java.lang.Object) str33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        java.lang.Object obj37 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str40 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b43 = defaultedMap42.isEmpty();
        defaultedMap42.clear();
        java.util.Set set45 = defaultedMap42.entrySet();
        java.util.Set set46 = defaultedMap42.keySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (-1.0f));
        boolean b50 = defaultedMap42.containsKey((java.lang.Object) 1L);
        boolean b52 = defaultedMap42.equals((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap42.entrySet();
        boolean b54 = defaultedMap42.isEmpty();
        java.util.Set set55 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b62 = defaultedMap59.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b65 = defaultedMap64.isEmpty();
        defaultedMap64.clear();
        java.util.Set set67 = defaultedMap64.entrySet();
        java.util.Set set68 = defaultedMap64.keySet();
        java.lang.Object obj69 = defaultedMap59.get((java.lang.Object) set68);
        java.lang.Object obj70 = defaultedMap57.remove((java.lang.Object) set68);
        java.lang.Object obj71 = defaultedMap42.get(obj70);
        boolean b72 = defaultedMap39.containsKey((java.lang.Object) defaultedMap42);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b72);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10L + "'", obj69.equals(10L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 10L + "'", obj71.equals(10L));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) set12);
        java.util.Collection collection15 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap20.clear();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) false, (java.lang.Object) defaultedMap20);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b34 = defaultedMap33.isEmpty();
        defaultedMap33.clear();
        java.util.Set set36 = defaultedMap33.entrySet();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap28.get((java.lang.Object) set37);
        java.lang.Object obj39 = defaultedMap26.get((java.lang.Object) set37);
        java.lang.Object obj40 = defaultedMap17.get((java.lang.Object) set37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.lang.Object obj46 = defaultedMap17.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap43);
        java.lang.String str47 = defaultedMap17.toString();
        java.util.Set set48 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) false, (java.lang.Object) defaultedMap55);
        java.lang.String str58 = defaultedMap52.toString();
        boolean b60 = defaultedMap52.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set61 = defaultedMap52.keySet();
        boolean b62 = defaultedMap50.containsValue((java.lang.Object) defaultedMap52);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) set48, (java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 0 + "'", obj14.equals((short) 0));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 10L + "'", obj38.equals(10L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10L + "'", obj40.equals(10L));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{false={}, {false={}}={}}" + "'", str47.equals("{false={}, {false={}}={}}"));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{false={}}" + "'", str58.equals("{false={}}"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        java.util.Set set19 = defaultedMap16.entrySet();
        java.util.Set set20 = defaultedMap16.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (-1.0f));
        boolean b32 = defaultedMap24.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate44);
        boolean b46 = defaultedMap24.equals((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b49 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        java.util.Set set51 = defaultedMap48.entrySet();
        java.util.Set set52 = defaultedMap48.keySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1.0f));
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate43, predicate57);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b65 = defaultedMap64.isEmpty();
        defaultedMap64.clear();
        java.util.Set set67 = defaultedMap64.entrySet();
        java.lang.Object obj69 = defaultedMap64.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap64.get((java.lang.Object) 10);
        boolean b72 = defaultedMap16.equals((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10L + "'", obj69.equals(10L));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 10L + "'", obj71.equals(10L));
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        java.util.Set set14 = defaultedMap11.entrySet();
        java.util.Set set15 = defaultedMap11.keySet();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) set15);
        java.lang.Object obj18 = defaultedMap6.remove((java.lang.Object) (-1.0d));
        java.lang.String str19 = defaultedMap6.toString();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10L + "'", obj16.equals(10L));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) false, (java.lang.Object) defaultedMap17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b31 = defaultedMap30.isEmpty();
        defaultedMap30.clear();
        java.util.Set set33 = defaultedMap30.entrySet();
        java.util.Set set34 = defaultedMap30.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap23.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap14.get((java.lang.Object) set34);
        java.lang.Object obj38 = defaultedMap1.get(obj37);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) "{false={}, {false={}}={}}");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10L + "'", obj35.equals(10L));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 10L + "'", obj38.equals(10L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10L + "'", obj40.equals(10L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) set67);
        java.lang.Object obj70 = defaultedMap58.remove((java.lang.Object) (-1.0d));
        java.util.Set set71 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap76.clear();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) false, (java.lang.Object) defaultedMap76);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) ' ');
        java.lang.Object obj81 = defaultedMap58.remove((java.lang.Object) defaultedMap73);
        java.lang.Object obj82 = defaultedMap28.get((java.lang.Object) defaultedMap73);
        java.util.Set set83 = defaultedMap28.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 10L + "'", obj68.equals(10L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 10L + "'", obj82.equals(10L));
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) set67);
        java.lang.Object obj70 = defaultedMap58.remove((java.lang.Object) (-1.0d));
        java.util.Set set71 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap76.clear();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) false, (java.lang.Object) defaultedMap76);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) ' ');
        java.lang.Object obj81 = defaultedMap58.remove((java.lang.Object) defaultedMap73);
        java.lang.Object obj82 = defaultedMap28.get((java.lang.Object) defaultedMap73);
        collections.Transformer transformer83 = null;
        try {
            java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, transformer83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 10L + "'", obj68.equals(10L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 10L + "'", obj82.equals(10L));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap61.clear();
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) false, (java.lang.Object) defaultedMap61);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b70 = defaultedMap69.isEmpty();
        boolean b72 = defaultedMap69.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b75 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        java.util.Set set77 = defaultedMap74.entrySet();
        java.util.Set set78 = defaultedMap74.keySet();
        java.lang.Object obj79 = defaultedMap69.get((java.lang.Object) set78);
        java.lang.Object obj80 = defaultedMap67.get((java.lang.Object) set78);
        java.lang.Object obj81 = defaultedMap58.get((java.lang.Object) set78);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap58);
        java.util.Set set83 = defaultedMap82.entrySet();
        java.lang.Object obj84 = defaultedMap28.get((java.lang.Object) set83);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 10L + "'", obj79.equals(10L));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 0 + "'", obj80.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 10L + "'", obj81.equals(10L));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 10L + "'", obj84.equals(10L));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap4.clear();
        java.util.Set set7 = defaultedMap4.entrySet();
        java.util.Set set8 = defaultedMap4.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) (-1.0d));
        java.util.Set set25 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap30.clear();
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) false, (java.lang.Object) defaultedMap30);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) ' ');
        java.lang.Object obj35 = defaultedMap12.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj36 = defaultedMap4.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b46 = defaultedMap45.isEmpty();
        defaultedMap45.clear();
        java.util.Set set48 = defaultedMap45.entrySet();
        java.util.Set set49 = defaultedMap45.keySet();
        java.lang.Object obj50 = defaultedMap40.get((java.lang.Object) set49);
        java.lang.Object obj51 = defaultedMap38.get((java.lang.Object) set49);
        int i52 = defaultedMap38.size();
        int i53 = defaultedMap38.size();
        java.lang.Object obj54 = defaultedMap4.remove((java.lang.Object) i53);
        boolean b55 = defaultedMap4.isEmpty();
        boolean b56 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 10L + "'", obj36.equals(10L));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 10L + "'", obj50.equals(10L));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 0 + "'", obj51.equals((short) 0));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap22.clear();
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) false, (java.lang.Object) defaultedMap22);
        java.lang.String str25 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{false={}}" + "'", str25.equals("{false={}}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b15 = defaultedMap14.isEmpty();
        defaultedMap14.clear();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.util.Set set18 = defaultedMap14.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1.0f));
        boolean b22 = defaultedMap14.containsKey((java.lang.Object) 1L);
        boolean b24 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap14.entrySet();
        boolean b26 = defaultedMap14.isEmpty();
        java.util.Set set27 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.lang.Object obj39 = defaultedMap29.get((java.lang.Object) set38);
        java.lang.Object obj41 = defaultedMap29.remove((java.lang.Object) (-1.0d));
        java.util.Set set42 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap47.clear();
        java.lang.Object obj49 = defaultedMap44.put((java.lang.Object) false, (java.lang.Object) defaultedMap47);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) ' ');
        java.lang.Object obj52 = defaultedMap29.remove((java.lang.Object) defaultedMap44);
        boolean b53 = defaultedMap29.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        defaultedMap56.clear();
        java.util.Set set59 = defaultedMap56.entrySet();
        java.util.Set set60 = defaultedMap56.keySet();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) (-1.0f));
        boolean b64 = defaultedMap56.containsKey((java.lang.Object) 1L);
        boolean b66 = defaultedMap56.equals((java.lang.Object) (byte) 0);
        int i67 = defaultedMap56.size();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b70 = defaultedMap69.isEmpty();
        boolean b72 = defaultedMap69.equals((java.lang.Object) (short) 1);
        java.util.Collection collection73 = defaultedMap69.values();
        java.lang.Object obj74 = defaultedMap29.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b77 = defaultedMap76.isEmpty();
        boolean b79 = defaultedMap76.equals((java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap1.put((java.lang.Object) defaultedMap56, (java.lang.Object) (short) 1);
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b84 = defaultedMap83.isEmpty();
        boolean b86 = defaultedMap83.equals((java.lang.Object) (short) 1);
        boolean b88 = defaultedMap83.equals((java.lang.Object) "{}");
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10L + "'", obj39.equals(10L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b12 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        java.util.Set set14 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        defaultedMap25.clear();
        java.util.Set set28 = defaultedMap25.entrySet();
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) set29);
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) (-1.0d));
        java.lang.String str33 = defaultedMap20.toString();
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) str33);
        boolean b35 = defaultedMap11.containsValue((java.lang.Object) str33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        java.lang.Object obj37 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        int i38 = defaultedMap9.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        java.util.Collection collection8 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap16.clear();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) false, (java.lang.Object) defaultedMap16);
        java.lang.String str19 = defaultedMap13.toString();
        boolean b21 = defaultedMap13.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set22 = defaultedMap13.keySet();
        boolean b23 = defaultedMap11.containsValue((java.lang.Object) defaultedMap13);
        java.util.Collection collection24 = defaultedMap13.values();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) collection24);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10L + "'", obj7.equals(10L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{false={}}" + "'", str19.equals("{false={}}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10L + "'", obj25.equals(10L));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) false, (java.lang.Object) defaultedMap34);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap16.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        boolean b51 = defaultedMap43.containsKey((java.lang.Object) 1L);
        boolean b53 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        int i54 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) (short) 1);
        java.util.Collection collection60 = defaultedMap56.values();
        java.lang.Object obj61 = defaultedMap16.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap63.get(obj68);
        java.util.Collection collection70 = defaultedMap63.values();
        java.util.Set set71 = defaultedMap63.entrySet();
        boolean b72 = defaultedMap43.equals((java.lang.Object) defaultedMap63);
        collections.Transformer transformer73 = null;
        try {
            java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, transformer73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10L + "'", obj69.equals(10L));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{false={}}" + "'", str8.equals("{false={}}"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) set10);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        defaultedMap25.clear();
        java.util.Set set28 = defaultedMap25.entrySet();
        java.util.Set set29 = defaultedMap25.keySet();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) set29);
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) (-1.0d));
        java.lang.String str33 = defaultedMap20.toString();
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) str33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) '4', (java.lang.Object) defaultedMap17);
        java.util.Set set36 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) false, (java.lang.Object) defaultedMap41);
        java.lang.String str44 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        boolean b56 = defaultedMap46.equals((java.lang.Object) (byte) 0);
        java.util.Set set57 = defaultedMap46.entrySet();
        boolean b58 = defaultedMap46.isEmpty();
        java.lang.Object obj59 = defaultedMap38.remove((java.lang.Object) b58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap64.clear();
        java.lang.Object obj66 = defaultedMap61.put((java.lang.Object) false, (java.lang.Object) defaultedMap64);
        java.lang.String str67 = defaultedMap61.toString();
        java.lang.Object obj69 = defaultedMap38.put((java.lang.Object) defaultedMap61, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b72 = defaultedMap71.isEmpty();
        defaultedMap71.clear();
        java.util.Set set74 = defaultedMap71.entrySet();
        java.util.Set set75 = defaultedMap71.keySet();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) (-1.0f));
        boolean b79 = defaultedMap71.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate80, predicate81);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) predicate81);
        java.lang.Object obj84 = null;
        java.util.Map map85 = collections.map.DefaultedMap.decorate(map83, obj84);
        boolean b86 = defaultedMap1.equals((java.lang.Object) map83);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10L + "'", obj11.equals(10L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{false={}}" + "'", str44.equals("{false={}}"));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{false={}}" + "'", str67.equals("{false={}}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap6.clear();
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) defaultedMap6);
        java.lang.String str9 = defaultedMap3.toString();
        boolean b11 = defaultedMap3.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set12 = defaultedMap3.keySet();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        java.util.Collection collection14 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        java.util.Set set19 = defaultedMap16.entrySet();
        java.util.Set set20 = defaultedMap16.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap16.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        java.util.Set set29 = defaultedMap26.entrySet();
        java.util.Set set30 = defaultedMap26.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (-1.0f));
        boolean b34 = defaultedMap26.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate35, predicate36);
        boolean b38 = defaultedMap16.equals((java.lang.Object) predicate35);
        boolean b39 = defaultedMap3.containsKey((java.lang.Object) b38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) (short) 1);
        java.util.Collection collection45 = defaultedMap41.values();
        java.lang.String str46 = defaultedMap41.toString();
        java.lang.Object obj47 = defaultedMap3.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{false={}}" + "'", str9.equals("{false={}}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 10L + "'", obj47.equals(10L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (-1.0f));
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.equals((java.lang.Object) (short) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        defaultedMap9.clear();
        java.util.Set set12 = defaultedMap9.entrySet();
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap9.containsKey((java.lang.Object) 1L);
        boolean b19 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap9.entrySet();
        boolean b21 = defaultedMap9.isEmpty();
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap24.toString();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0f));
        boolean b42 = defaultedMap34.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate44);
        boolean b47 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        java.util.Set set52 = defaultedMap49.entrySet();
        java.util.Set set53 = defaultedMap49.keySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1.0f));
        boolean b57 = defaultedMap49.containsKey((java.lang.Object) 1L);
        boolean b59 = defaultedMap49.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b62 = defaultedMap61.isEmpty();
        defaultedMap61.clear();
        java.util.Set set64 = defaultedMap61.entrySet();
        java.lang.Object obj66 = defaultedMap61.get((java.lang.Object) 'a');
        java.lang.Object obj68 = defaultedMap61.get((java.lang.Object) 10);
        boolean b69 = defaultedMap49.equals((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b72 = defaultedMap71.isEmpty();
        defaultedMap71.clear();
        java.util.Set set74 = defaultedMap71.entrySet();
        java.lang.Object obj76 = defaultedMap71.get((java.lang.Object) 'a');
        java.lang.Object obj78 = defaultedMap71.get((java.lang.Object) 10);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap71);
        boolean b80 = defaultedMap1.containsValue((java.lang.Object) defaultedMap61);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{false={}}" + "'", str30.equals("{false={}}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 10L + "'", obj66.equals(10L));
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 10L + "'", obj68.equals(10L));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 10L + "'", obj76.equals(10L));
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 10L + "'", obj78.equals(10L));
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap7.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) false, (java.lang.Object) defaultedMap17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b31 = defaultedMap30.isEmpty();
        defaultedMap30.clear();
        java.util.Set set33 = defaultedMap30.entrySet();
        java.util.Set set34 = defaultedMap30.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap23.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap14.get((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b41 = defaultedMap40.isEmpty();
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap40);
        defaultedMap7.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10L + "'", obj35.equals(10L));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10L + "'", obj45.equals(10L));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap9.clear();
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) false, (java.lang.Object) defaultedMap9);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b16 = defaultedMap15.isEmpty();
        defaultedMap15.clear();
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.Object obj19 = defaultedMap3.put((java.lang.Object) map13, (java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b27 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        java.util.Set set29 = defaultedMap26.entrySet();
        java.util.Set set30 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) set30);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) (-1.0d));
        java.lang.String str34 = defaultedMap21.toString();
        defaultedMap3.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b44 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Set set46 = defaultedMap43.entrySet();
        java.util.Set set47 = defaultedMap43.keySet();
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) set47);
        java.lang.Object obj50 = defaultedMap38.remove((java.lang.Object) (-1.0d));
        java.util.Set set51 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap56.clear();
        java.lang.Object obj58 = defaultedMap53.put((java.lang.Object) false, (java.lang.Object) defaultedMap56);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) ' ');
        java.lang.Object obj61 = defaultedMap38.remove((java.lang.Object) defaultedMap53);
        java.lang.Object obj62 = defaultedMap21.remove((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10L + "'", obj31.equals(10L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 10L + "'", obj48.equals(10L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap17.clear();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) false, (java.lang.Object) defaultedMap17);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b31 = defaultedMap30.isEmpty();
        defaultedMap30.clear();
        java.util.Set set33 = defaultedMap30.entrySet();
        java.util.Set set34 = defaultedMap30.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap23.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap14.get((java.lang.Object) set34);
        boolean b39 = defaultedMap14.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) "{false={}, {false={}}={}}");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10L + "'", obj35.equals(10L));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10L + "'", obj37.equals(10L));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10L + "'", obj40.equals(10L));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b8 = defaultedMap1.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) set12);
        int i15 = defaultedMap1.size();
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 0 + "'", obj14.equals((short) 0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) false, (java.lang.Object) defaultedMap11);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b35 = defaultedMap34.isEmpty();
        defaultedMap34.clear();
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) "{false={}}", (java.lang.Object) defaultedMap34);
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10L + "'", obj31.equals(10L));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b15 = defaultedMap14.isEmpty();
        defaultedMap14.clear();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.util.Set set18 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) set18);
        java.lang.Object obj21 = defaultedMap9.remove((java.lang.Object) (-1.0d));
        java.util.Set set22 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap9.remove((java.lang.Object) defaultedMap24);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap24);
        java.lang.String str34 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b37 = defaultedMap36.isEmpty();
        defaultedMap36.clear();
        java.util.Set set39 = defaultedMap36.entrySet();
        java.util.Set set40 = defaultedMap36.keySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) set40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L + "'", obj19.equals(10L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10L + "'", obj33.equals(10L));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{false={}}" + "'", str34.equals("{false={}}"));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) (-1.0d));
        java.util.Set set25 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b37 = defaultedMap36.isEmpty();
        defaultedMap36.clear();
        java.util.Set set39 = defaultedMap36.entrySet();
        java.util.Set set40 = defaultedMap36.keySet();
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) set40);
        java.lang.Object obj43 = defaultedMap31.remove((java.lang.Object) (-1.0d));
        java.lang.String str44 = defaultedMap31.toString();
        boolean b45 = defaultedMap28.containsKey((java.lang.Object) str44);
        java.lang.Object obj46 = defaultedMap12.put((java.lang.Object) '4', (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b49 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        java.util.Set set51 = defaultedMap48.entrySet();
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 'a');
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b59 = defaultedMap58.isEmpty();
        defaultedMap58.clear();
        java.util.Set set61 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (-1.0f));
        boolean b71 = defaultedMap63.containsKey((java.lang.Object) 1L);
        java.lang.Object obj72 = defaultedMap58.remove((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b75 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        java.util.Set set77 = defaultedMap74.entrySet();
        java.util.Set set78 = defaultedMap74.keySet();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) (-1.0f));
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate83, predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate84, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate55, predicate84);
        boolean b89 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{false={}}" + "'", str7.equals("{false={}}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10L + "'", obj41.equals(10L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 10L + "'", obj53.equals(10L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) set67);
        java.lang.Object obj70 = defaultedMap58.remove((java.lang.Object) (-1.0d));
        java.util.Set set71 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap76.clear();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) false, (java.lang.Object) defaultedMap76);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) ' ');
        java.lang.Object obj81 = defaultedMap58.remove((java.lang.Object) defaultedMap73);
        java.lang.Object obj82 = defaultedMap28.get((java.lang.Object) defaultedMap73);
        collections.Factory factory83 = null;
        try {
            java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, factory83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 10L + "'", obj68.equals(10L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 10L + "'", obj82.equals(10L));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 1L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b24 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Set set26 = defaultedMap23.entrySet();
        java.util.Set set27 = defaultedMap23.keySet();
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) set27);
        java.lang.Object obj29 = defaultedMap16.remove((java.lang.Object) set27);
        java.lang.Object obj30 = defaultedMap1.get(obj29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = defaultedMap1.remove(obj31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10L + "'", obj28.equals(10L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10L + "'", obj30.equals(10L));
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b7 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.util.Set set16 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) '#');
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) false, (java.lang.Object) defaultedMap4);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b18 = defaultedMap17.isEmpty();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set21);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) "{false={}, {false={}}={}}");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b29 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (-1.0f));
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) 1L);
        boolean b38 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b42 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b47 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.util.Set set50 = defaultedMap46.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0f));
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap28, obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) set67);
        java.lang.Object obj70 = defaultedMap58.remove((java.lang.Object) (-1.0d));
        java.util.Set set71 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap76.clear();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) false, (java.lang.Object) defaultedMap76);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) ' ');
        java.lang.Object obj81 = defaultedMap58.remove((java.lang.Object) defaultedMap73);
        java.lang.Object obj82 = defaultedMap28.get((java.lang.Object) defaultedMap73);
        defaultedMap73.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L + "'", obj22.equals(10L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10L + "'", obj24.equals(10L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 10L + "'", obj68.equals(10L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 10L + "'", obj82.equals(10L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b9 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Set set11 = defaultedMap8.entrySet();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) set12);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b22 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) (-1.0d));
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b32 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        java.util.Set set35 = defaultedMap31.keySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b40 = defaultedMap39.isEmpty();
        defaultedMap39.clear();
        java.util.Set set42 = defaultedMap39.entrySet();
        java.util.Set set43 = defaultedMap39.keySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1.0f));
        boolean b47 = defaultedMap39.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b50 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        java.util.Set set52 = defaultedMap49.entrySet();
        java.util.Set set53 = defaultedMap49.keySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (-1.0f));
        boolean b57 = defaultedMap49.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate58, predicate59);
        boolean b61 = defaultedMap39.equals((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b64 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        java.util.Set set66 = defaultedMap63.entrySet();
        java.util.Set set67 = defaultedMap63.keySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (-1.0f));
        boolean b71 = defaultedMap63.containsKey((java.lang.Object) 1L);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate58, predicate72);
        java.lang.Object obj76 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        defaultedMap31.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10L + "'", obj13.equals(10L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 0 + "'", obj14.equals((short) 0));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10L + "'", obj26.equals(10L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) '#');
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b15 = defaultedMap14.isEmpty();
        defaultedMap14.clear();
        java.util.Set set17 = defaultedMap14.entrySet();
        java.util.Set set18 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) set18);
        java.lang.Object obj21 = defaultedMap9.remove((java.lang.Object) (-1.0d));
        java.util.Set set22 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap9.remove((java.lang.Object) defaultedMap24);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap24);
        java.lang.String str34 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b37 = defaultedMap36.isEmpty();
        defaultedMap36.clear();
        java.util.Set set39 = defaultedMap36.entrySet();
        java.lang.Object obj41 = defaultedMap36.get((java.lang.Object) 'a');
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        boolean b45 = defaultedMap24.equals((java.lang.Object) predicate42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L + "'", obj19.equals(10L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10L + "'", obj33.equals(10L));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{false={}}" + "'", str34.equals("{false={}}"));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10L + "'", obj41.equals(10L));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) defaultedMap7);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b14 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) map11, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b25 = defaultedMap24.isEmpty();
        defaultedMap24.clear();
        java.util.Set set27 = defaultedMap24.entrySet();
        java.util.Set set28 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap19.get((java.lang.Object) set28);
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) (-1.0d));
        java.lang.String str32 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        defaultedMap41.clear();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) false, (java.lang.Object) defaultedMap41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        boolean b48 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj51 = defaultedMap35.put((java.lang.Object) map45, (java.lang.Object) set50);
        defaultedMap1.putAll(map45);
        collections.Transformer transformer53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
    }
}

