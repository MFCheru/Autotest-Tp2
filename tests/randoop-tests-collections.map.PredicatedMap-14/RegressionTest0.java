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
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) 10L);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) '4');
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1.0d) + "'", obj11.equals((-1.0d)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap3.isEmpty();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) predicateUtils5, (java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) false);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0f + "'", obj9.equals(0.0f));
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap6.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        boolean b9 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.util.Set set34 = defaultedMap1.entrySet();
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap9.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) defaultedMap9);
        boolean b17 = defaultedMap7.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b20 = defaultedMap19.isEmpty();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) predicateUtils21, (java.lang.Object) 0);
        boolean b24 = defaultedMap7.containsValue((java.lang.Object) defaultedMap19);
        boolean b25 = defaultedMap19.isEmpty();
        java.util.Set set26 = defaultedMap19.entrySet();
        java.lang.Object obj27 = defaultedMap1.put(obj5, (java.lang.Object) set26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 0.0d);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap35);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.util.Set set34 = defaultedMap1.entrySet();
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap11.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) predicate11);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) '4');
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1.0d) + "'", obj11.equals((-1.0d)));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.util.Set set34 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b39 = defaultedMap38.isEmpty();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) predicateUtils40, (java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) false);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) '4');
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0f + "'", obj44.equals(0.0f));
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap3.isEmpty();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) predicateUtils5, (java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) false);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection13 = defaultedMap1.values();
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0f + "'", obj9.equals(0.0f));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap13.isEmpty();
        java.util.Set set20 = defaultedMap13.entrySet();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.lang.String str34 = defaultedMap26.toString();
        defaultedMap26.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b10 = defaultedMap8.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap6.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b19 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) predicateUtils20, (java.lang.Object) 0);
        boolean b23 = defaultedMap6.containsValue((java.lang.Object) defaultedMap18);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap32.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj38 = defaultedMap30.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) '4');
        defaultedMap27.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b44 = defaultedMap43.isEmpty();
        int i45 = defaultedMap43.size();
        int i46 = defaultedMap43.size();
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 10.0d);
        defaultedMap27.putAll((java.util.Map) defaultedMap43);
        boolean b50 = defaultedMap1.equals((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0f + "'", obj25.equals(0.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1.0d) + "'", obj40.equals((-1.0d)));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0.0f + "'", obj48.equals(0.0f));
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection23 = defaultedMap11.values();
        java.lang.Object obj25 = defaultedMap3.put((java.lang.Object) collection23, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap29.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) defaultedMap29);
        boolean b37 = defaultedMap27.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b40 = defaultedMap39.isEmpty();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj43 = defaultedMap39.put((java.lang.Object) predicateUtils41, (java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap39.get((java.lang.Object) false);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) '4');
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) '4');
        java.lang.Object obj49 = defaultedMap3.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0f + "'", obj45.equals(0.0f));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (-1.0d) + "'", obj49.equals((-1.0d)));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0f + "'", obj6.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap13.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i22 = defaultedMap21.size();
        int i23 = defaultedMap21.size();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b29 = defaultedMap28.isEmpty();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) predicateUtils30, (java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) false);
        int i35 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i38 = defaultedMap37.size();
        int i39 = defaultedMap37.size();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        boolean b43 = defaultedMap28.containsKey((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b50 = defaultedMap48.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) defaultedMap48);
        java.util.Set set55 = defaultedMap46.entrySet();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj57 = defaultedMap46.get((java.lang.Object) predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate56);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0.0f + "'", obj34.equals(0.0f));
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0.0f + "'", obj57.equals(0.0f));
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b7 = defaultedMap5.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) defaultedMap5);
        java.util.Set set12 = defaultedMap3.entrySet();
        java.util.Set set13 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap22.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap20.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b33 = defaultedMap32.isEmpty();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) predicateUtils34, (java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) false);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '4');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b47 = defaultedMap45.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj51 = defaultedMap43.remove((java.lang.Object) defaultedMap45);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b55 = defaultedMap54.isEmpty();
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) 0.0d);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap54);
        int i59 = defaultedMap45.size();
        java.lang.Object obj60 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0f + "'", obj38.equals(0.0f));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0.0f + "'", obj52.equals(0.0f));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i4 = defaultedMap3.size();
        int i5 = defaultedMap3.size();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b12 = defaultedMap10.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap10.putAll((java.util.Map) defaultedMap14);
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i19 = defaultedMap18.size();
        int i20 = defaultedMap18.size();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b26 = defaultedMap25.isEmpty();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) predicateUtils27, (java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap25.get((java.lang.Object) false);
        int i32 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i35 = defaultedMap34.size();
        int i36 = defaultedMap34.size();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        boolean b40 = defaultedMap25.containsKey((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate38);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        int i43 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0.0f + "'", obj31.equals(0.0f));
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b10 = defaultedMap8.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap6.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b19 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) predicateUtils20, (java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) '4');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) '4');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0f + "'", obj24.equals(0.0f));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap6.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b19 = defaultedMap17.equals((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0f + "'", obj20.equals(0.0f));
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set7 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap11.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        boolean b18 = defaultedMap5.equals((java.lang.Object) set17);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0f + "'", obj6.equals(0.0f));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap6.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b19 = defaultedMap17.equals((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b25 = defaultedMap23.equals((java.lang.Object) 1);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) b25);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0f + "'", obj20.equals(0.0f));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b3 = defaultedMap1.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set7 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap11.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        boolean b18 = defaultedMap5.equals((java.lang.Object) set17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap3.isEmpty();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) predicateUtils5, (java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) false);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b14 = defaultedMap1.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0f + "'", obj9.equals(0.0f));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap6.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b7 = defaultedMap5.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) defaultedMap5);
        java.util.Set set12 = defaultedMap3.entrySet();
        java.util.Set set13 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap22.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap20.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b33 = defaultedMap32.isEmpty();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) predicateUtils34, (java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) false);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '4');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b47 = defaultedMap45.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj51 = defaultedMap43.remove((java.lang.Object) defaultedMap45);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b55 = defaultedMap54.isEmpty();
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        java.lang.Object obj58 = defaultedMap54.put((java.lang.Object) predicateUtils56, (java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap54.get((java.lang.Object) false);
        int i61 = defaultedMap54.size();
        boolean b62 = defaultedMap45.equals((java.lang.Object) defaultedMap54);
        boolean b63 = defaultedMap16.containsKey((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0f + "'", obj38.equals(0.0f));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0.0f + "'", obj52.equals(0.0f));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0.0f + "'", obj60.equals(0.0f));
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap6.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b18 = defaultedMap17.isEmpty();
        int i19 = defaultedMap17.size();
        int i20 = defaultedMap17.size();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 10.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) i27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i31 = defaultedMap30.size();
        java.util.Set set32 = defaultedMap30.entrySet();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0f + "'", obj22.equals(0.0f));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0f + "'", obj28.equals(0.0f));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b19 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) predicateUtils20, (java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) false);
        boolean b26 = defaultedMap18.equals((java.lang.Object) (short) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        int i28 = defaultedMap18.size();
        java.util.Set set29 = defaultedMap18.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0f + "'", obj24.equals(0.0f));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1.0d) + "'", obj4.equals((-1.0d)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap15.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        java.util.Set set22 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        boolean b34 = defaultedMap24.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b37 = defaultedMap36.isEmpty();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj40 = defaultedMap36.put((java.lang.Object) predicateUtils38, (java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '4');
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '4');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i53 = defaultedMap52.size();
        int i54 = defaultedMap52.size();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b61 = defaultedMap59.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap59.putAll((java.util.Map) defaultedMap63);
        boolean b65 = defaultedMap63.isEmpty();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i68 = defaultedMap67.size();
        int i69 = defaultedMap67.size();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b75 = defaultedMap74.isEmpty();
        collections.PredicateUtils predicateUtils76 = new collections.PredicateUtils();
        java.lang.Object obj78 = defaultedMap74.put((java.lang.Object) predicateUtils76, (java.lang.Object) 0);
        java.lang.Object obj80 = defaultedMap74.get((java.lang.Object) false);
        int i81 = defaultedMap74.size();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i84 = defaultedMap83.size();
        int i85 = defaultedMap83.size();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate86, predicate87);
        boolean b89 = defaultedMap74.containsKey((java.lang.Object) predicate87);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate71, predicate87);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate71);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate55, predicate92);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b96 = defaultedMap95.isEmpty();
        int i97 = defaultedMap95.size();
        int i98 = defaultedMap95.size();
        java.lang.Object obj99 = defaultedMap24.get((java.lang.Object) i98);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0f + "'", obj42.equals(0.0f));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0f + "'", obj80.equals(0.0f));
        org.junit.Assert.assertTrue(i81 == 1);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertTrue(i97 == 0);
        org.junit.Assert.assertTrue(i98 == 0);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + 0.0f + "'", obj99.equals(0.0f));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b18 = defaultedMap16.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj22 = defaultedMap14.remove((java.lang.Object) defaultedMap16);
        java.util.Set set23 = defaultedMap14.entrySet();
        java.util.Set set24 = defaultedMap14.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj28 = defaultedMap14.remove((java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i5 = defaultedMap4.size();
        int i6 = defaultedMap4.size();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        java.util.Collection collection10 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b10 = defaultedMap9.isEmpty();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) predicateUtils11, (java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) false);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '4');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap22.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap20.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b33 = defaultedMap32.isEmpty();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) predicateUtils34, (java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) false);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '4');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b47 = defaultedMap45.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj51 = defaultedMap43.remove((java.lang.Object) defaultedMap45);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj53 = defaultedMap9.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0f + "'", obj15.equals(0.0f));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0f + "'", obj38.equals(0.0f));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0.0f + "'", obj52.equals(0.0f));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0.0f + "'", obj53.equals(0.0f));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0f + "'", obj54.equals(0.0f));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b7 = defaultedMap5.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) defaultedMap5);
        java.util.Set set12 = defaultedMap3.entrySet();
        java.util.Set set13 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap22.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap20.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b33 = defaultedMap32.isEmpty();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) predicateUtils34, (java.lang.Object) 0);
        boolean b37 = defaultedMap20.containsValue((java.lang.Object) defaultedMap32);
        boolean b38 = defaultedMap32.isEmpty();
        java.util.Set set39 = defaultedMap32.entrySet();
        java.util.Set set40 = defaultedMap32.entrySet();
        java.lang.Object obj41 = defaultedMap16.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b50 = defaultedMap48.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) defaultedMap48);
        java.lang.Object obj56 = defaultedMap48.get((java.lang.Object) '4');
        defaultedMap43.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b61 = defaultedMap59.equals((java.lang.Object) 1);
        java.lang.Object obj62 = defaultedMap43.get((java.lang.Object) defaultedMap59);
        int i63 = defaultedMap43.size();
        boolean b64 = defaultedMap43.isEmpty();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) b64);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0.0f + "'", obj41.equals(0.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (-1.0d) + "'", obj56.equals((-1.0d)));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0f + "'", obj62.equals(0.0f));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap3.isEmpty();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) predicateUtils5, (java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) false);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap19.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap17.remove((java.lang.Object) defaultedMap19);
        java.util.Set set26 = defaultedMap17.entrySet();
        java.util.Set set27 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Set set29 = defaultedMap17.entrySet();
        java.lang.Object obj31 = defaultedMap3.put((java.lang.Object) set29, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0f + "'", obj9.equals(0.0f));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap5.isEmpty();
        int i7 = defaultedMap5.size();
        java.util.Set set8 = defaultedMap5.keySet();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap15.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        java.util.Set set22 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        boolean b34 = defaultedMap24.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b37 = defaultedMap36.isEmpty();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj40 = defaultedMap36.put((java.lang.Object) predicateUtils38, (java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '4');
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '4');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap24);
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0f + "'", obj42.equals(0.0f));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) predicate6);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b7 = defaultedMap5.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) defaultedMap5);
        java.util.Set set12 = defaultedMap3.entrySet();
        java.util.Set set13 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b17 = defaultedMap16.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap16);
        java.util.Set set19 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b14 = defaultedMap13.isEmpty();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) predicateUtils15, (java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) false);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '4');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b36 = defaultedMap35.isEmpty();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap35.put((java.lang.Object) predicateUtils37, (java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) false);
        int i42 = defaultedMap35.size();
        boolean b43 = defaultedMap26.equals((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b51 = defaultedMap49.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) defaultedMap49);
        java.util.Set set56 = defaultedMap47.entrySet();
        java.util.Set set57 = defaultedMap47.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b59 = defaultedMap26.containsKey((java.lang.Object) defaultedMap47);
        java.lang.String str60 = defaultedMap26.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0f + "'", obj19.equals(0.0f));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0.0f + "'", obj41.equals(0.0f));
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) predicateUtils3, (java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) false);
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap19.values();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) collection25);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0f + "'", obj7.equals(0.0f));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap15.equals((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b25 = defaultedMap23.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap21.remove((java.lang.Object) defaultedMap23);
        boolean b31 = defaultedMap21.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b34 = defaultedMap33.isEmpty();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap33.put((java.lang.Object) predicateUtils35, (java.lang.Object) 0);
        boolean b38 = defaultedMap21.containsValue((java.lang.Object) defaultedMap33);
        boolean b39 = defaultedMap19.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap43.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj49 = defaultedMap41.remove((java.lang.Object) defaultedMap43);
        boolean b51 = defaultedMap41.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b54 = defaultedMap53.isEmpty();
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        java.lang.Object obj57 = defaultedMap53.put((java.lang.Object) predicateUtils55, (java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap53.get((java.lang.Object) false);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) '4');
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b68 = defaultedMap66.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        java.lang.Object obj72 = defaultedMap64.remove((java.lang.Object) defaultedMap66);
        java.lang.Object obj73 = defaultedMap41.get((java.lang.Object) defaultedMap66);
        java.util.Set set74 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b82 = defaultedMap80.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap80.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj86 = defaultedMap78.remove((java.lang.Object) defaultedMap80);
        java.util.Set set87 = defaultedMap78.entrySet();
        java.util.Set set88 = defaultedMap78.entrySet();
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        java.lang.Object obj90 = defaultedMap19.put((java.lang.Object) set74, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0f + "'", obj59.equals(0.0f));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0.0f + "'", obj73.equals(0.0f));
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap5.isEmpty();
        int i7 = defaultedMap5.size();
        java.util.Set set8 = defaultedMap5.keySet();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b15 = defaultedMap14.isEmpty();
        int i16 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b22 = defaultedMap20.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap18.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b31 = defaultedMap30.isEmpty();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) predicateUtils32, (java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap30.get((java.lang.Object) false);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '4');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap43.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj49 = defaultedMap41.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap18.get((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b53 = defaultedMap52.isEmpty();
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        java.lang.Object obj56 = defaultedMap52.put((java.lang.Object) predicateUtils54, (java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap52.get((java.lang.Object) false);
        int i59 = defaultedMap52.size();
        boolean b60 = defaultedMap43.equals((java.lang.Object) defaultedMap52);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i64 = defaultedMap63.size();
        java.util.Set set65 = defaultedMap63.entrySet();
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj68 = defaultedMap5.put((java.lang.Object) defaultedMap14, obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b74 = defaultedMap72.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap72.putAll((java.util.Map) defaultedMap76);
        java.lang.Object obj78 = defaultedMap70.remove((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b83 = defaultedMap82.isEmpty();
        collections.PredicateUtils predicateUtils84 = new collections.PredicateUtils();
        java.lang.Object obj86 = defaultedMap82.put((java.lang.Object) predicateUtils84, (java.lang.Object) 0);
        java.lang.Object obj88 = defaultedMap82.get((java.lang.Object) false);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) '4');
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        java.util.Collection collection92 = defaultedMap80.values();
        java.lang.Object obj94 = defaultedMap72.put((java.lang.Object) collection92, (java.lang.Object) (short) 1);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap72);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate(map95, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0f + "'", obj36.equals(0.0f));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0f + "'", obj50.equals(0.0f));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0f + "'", obj58.equals(0.0f));
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0.0f + "'", obj88.equals(0.0f));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b10 = defaultedMap8.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap6.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b19 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) predicateUtils20, (java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) false);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) '4');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b33 = defaultedMap31.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = defaultedMap29.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap31);
        java.lang.String str39 = defaultedMap31.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        int i41 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0f + "'", obj24.equals(0.0f));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0f + "'", obj38.equals(0.0f));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap5.isEmpty();
        int i7 = defaultedMap5.size();
        java.util.Set set8 = defaultedMap5.keySet();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap13.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) defaultedMap13);
        java.util.Set set20 = defaultedMap11.entrySet();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        java.util.Set set33 = defaultedMap24.entrySet();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate21, predicate34);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0f + "'", obj22.equals(0.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0f + "'", obj35.equals(0.0f));
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b5 = defaultedMap3.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap15.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        java.util.Set set22 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap26.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        boolean b34 = defaultedMap24.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b37 = defaultedMap36.isEmpty();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj40 = defaultedMap36.put((java.lang.Object) predicateUtils38, (java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) false);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '4');
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '4');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10.0d);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap24);
        java.util.Set set49 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) set49);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0f + "'", obj42.equals(0.0f));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b7 = defaultedMap6.isEmpty();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) predicateUtils8, (java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) false);
        boolean b14 = defaultedMap6.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap1.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b10 = defaultedMap8.equals((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap6.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b19 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) predicateUtils20, (java.lang.Object) 0);
        boolean b23 = defaultedMap6.containsValue((java.lang.Object) defaultedMap18);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        boolean b28 = defaultedMap27.isEmpty();
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj31 = defaultedMap27.put((java.lang.Object) predicateUtils29, (java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) false);
        boolean b35 = defaultedMap27.equals((java.lang.Object) (short) 10);
        int i36 = defaultedMap27.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0f + "'", obj25.equals(0.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0f + "'", obj33.equals(0.0f));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 1);
    }
}

