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
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection54 = defaultedMap53.values();
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i70 = defaultedMap66.size();
        java.lang.Object obj71 = defaultedMap61.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap66);
        java.lang.Object obj72 = defaultedMap49.remove((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) predicate75);
        defaultedMap61.putAll(map76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap88.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i92 = defaultedMap88.size();
        java.lang.Object obj93 = defaultedMap83.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap88);
        int i94 = defaultedMap83.size();
        java.lang.Object obj95 = defaultedMap30.put((java.lang.Object) defaultedMap61, (java.lang.Object) i94);
        java.util.Set set96 = defaultedMap30.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(i92 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(i94 == 1);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(set96);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        boolean b31 = defaultedMap25.containsKey((java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap21.remove((java.lang.Object) defaultedMap25);
        java.lang.Object obj34 = defaultedMap1.put(obj32, (java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap2.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i23 = defaultedMap19.size();
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap19);
        java.lang.Object obj25 = defaultedMap2.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) predicate30, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.lang.Object obj40 = defaultedMap34.remove((java.lang.Object) predicate37);
        boolean b41 = defaultedMap14.containsValue((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        boolean b49 = defaultedMap43.containsKey((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i56 = defaultedMap52.size();
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection65 = defaultedMap64.values();
        boolean b66 = defaultedMap60.containsKey((java.lang.Object) defaultedMap64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection73 = defaultedMap72.values();
        boolean b74 = defaultedMap68.containsKey((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap77.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i81 = defaultedMap77.size();
        java.lang.Object obj82 = defaultedMap72.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap77);
        java.lang.Object obj83 = defaultedMap60.remove((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) predicate86);
        defaultedMap72.putAll(map87);
        java.lang.Object obj89 = defaultedMap52.put((java.lang.Object) predicate58, (java.lang.Object) defaultedMap72);
        try {
            java.util.Map map90 = collections.map.PredicatedMap.decorate(map0, predicate37, predicate58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 1);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(i81 == 1);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) predicate9, (java.lang.Object) (short) 100);
        int i13 = defaultedMap6.size();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap6);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i26 = defaultedMap22.size();
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap22);
        java.lang.Object obj28 = defaultedMap5.remove((java.lang.Object) defaultedMap17);
        java.lang.String str29 = defaultedMap5.toString();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 1 + "'", obj30.equals((short) 1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection54 = defaultedMap53.values();
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i70 = defaultedMap66.size();
        java.lang.Object obj71 = defaultedMap61.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap66);
        java.lang.Object obj72 = defaultedMap49.remove((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) predicate75);
        defaultedMap61.putAll(map76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap88.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i92 = defaultedMap88.size();
        java.lang.Object obj93 = defaultedMap83.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap88);
        int i94 = defaultedMap83.size();
        java.lang.Object obj95 = defaultedMap30.put((java.lang.Object) defaultedMap61, (java.lang.Object) i94);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(i92 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(i94 == 1);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        int i16 = defaultedMap5.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = defaultedMap5.get(obj17);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 1 + "'", obj18.equals((short) 1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        boolean b33 = defaultedMap1.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap12.equals((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate25, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap29.remove((java.lang.Object) predicate32);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate18, predicate39);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate(map42, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap8.equals(obj10);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap1.equals((java.lang.Object) "");
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) predicate14, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        boolean b30 = defaultedMap22.equals((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate35);
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) predicate35, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap39.remove((java.lang.Object) predicate42);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate42);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate28, predicate49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 10L);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 10L);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) predicate65);
        java.lang.Object obj68 = defaultedMap62.put((java.lang.Object) predicate65, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.lang.Object obj75 = defaultedMap69.remove((java.lang.Object) predicate72);
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map59, predicate60, predicate72);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate60);
        collections.Transformer transformer78 = null;
        try {
            java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) predicate14, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i32 = defaultedMap28.size();
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap28);
        int i34 = defaultedMap23.size();
        java.util.Set set35 = defaultedMap23.keySet();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) set35);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i22 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap26.put((java.lang.Object) predicate29, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap33.remove((java.lang.Object) predicate36);
        boolean b40 = defaultedMap13.containsValue((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        java.lang.Object obj48 = defaultedMap42.put((java.lang.Object) predicate45, (java.lang.Object) (short) 100);
        java.lang.Object obj50 = defaultedMap42.get((java.lang.Object) 1);
        defaultedMap13.putAll((java.util.Map) defaultedMap42);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 1 + "'", obj50.equals((short) 1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.util.Set set5 = defaultedMap4.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap27.containsKey((java.lang.Object) defaultedMap36);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b10 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection54 = defaultedMap53.values();
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i70 = defaultedMap66.size();
        java.lang.Object obj71 = defaultedMap61.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap66);
        java.lang.Object obj72 = defaultedMap49.remove((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) predicate75);
        defaultedMap61.putAll(map76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap88.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i92 = defaultedMap88.size();
        java.lang.Object obj93 = defaultedMap83.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap88);
        int i94 = defaultedMap83.size();
        java.lang.Object obj95 = defaultedMap30.put((java.lang.Object) defaultedMap61, (java.lang.Object) i94);
        defaultedMap61.clear();
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(i92 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(i94 == 1);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) (byte) 100);
        boolean b7 = defaultedMap4.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i22 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        defaultedMap13.putAll(map28);
        int i30 = defaultedMap13.size();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        boolean b11 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap12.equals((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) predicate25, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap29.remove((java.lang.Object) predicate32);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate18, predicate39);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = defaultedMap1.equals((java.lang.Object) predicate7);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{100=10.0}" + "'", str10.equals("{100=10.0}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        java.util.Set set32 = defaultedMap29.entrySet();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) (short) 100);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{100=10.0}" + "'", str6.equals("{100=10.0}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b14 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) predicate20, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap24.remove((java.lang.Object) predicate27);
        java.lang.Object obj31 = defaultedMap10.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap24);
        java.util.Set set32 = defaultedMap10.keySet();
        boolean b33 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i30 = defaultedMap26.size();
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i47 = defaultedMap43.size();
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap32.remove((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap52.containsKey((java.lang.Object) defaultedMap56);
        java.lang.Object obj59 = defaultedMap1.put((java.lang.Object) defaultedMap49, (java.lang.Object) b58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) predicate64, (java.lang.Object) (short) 100);
        java.lang.Object obj69 = defaultedMap61.get((java.lang.Object) 1);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj71 = defaultedMap61.get((java.lang.Object) predicate70);
        java.lang.Object obj72 = defaultedMap49.remove(obj71);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) 1 + "'", obj69.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 1 + "'", obj71.equals((short) 1));
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection54 = defaultedMap53.values();
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i70 = defaultedMap66.size();
        java.lang.Object obj71 = defaultedMap61.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap66);
        java.lang.Object obj72 = defaultedMap49.remove((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) predicate75);
        defaultedMap61.putAll(map76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap88.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i92 = defaultedMap88.size();
        java.lang.Object obj93 = defaultedMap83.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap88);
        int i94 = defaultedMap83.size();
        java.lang.Object obj95 = defaultedMap30.put((java.lang.Object) defaultedMap61, (java.lang.Object) i94);
        java.util.Set set96 = defaultedMap30.entrySet();
        collections.Transformer transformer97 = null;
        try {
            java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, transformer97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(i92 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(i94 == 1);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(set96);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i22 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.util.Collection collection25 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b12 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) predicate25);
        java.lang.Object obj29 = defaultedMap8.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        boolean b38 = defaultedMap32.containsKey((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i45 = defaultedMap41.size();
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) (-1L));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 1 + "'", obj51.equals((short) 1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        java.util.Collection collection16 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) collection16);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        int i18 = defaultedMap16.size();
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.String str9 = defaultedMap8.toString();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object obj16 = defaultedMap5.remove((java.lang.Object) defaultedMap9);
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap9.containsValue(obj17);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) predicate9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap17.equals((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) predicate30, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.lang.Object obj40 = defaultedMap34.remove((java.lang.Object) predicate37);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate23, predicate44);
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) map47);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 1 + "'", obj48.equals((short) 1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i26 = defaultedMap22.size();
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap22);
        java.lang.Object obj28 = defaultedMap5.remove((java.lang.Object) defaultedMap17);
        java.lang.String str29 = defaultedMap5.toString();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        int i31 = defaultedMap1.size();
        java.lang.String str32 = defaultedMap1.toString();
        java.util.Set set33 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 1 + "'", obj30.equals((short) 1));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.remove((java.lang.Object) predicate11);
        collections.Predicate predicate15 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap17.equals((java.lang.Object) predicate23);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate23);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        defaultedMap30.clear();
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        int i16 = defaultedMap5.size();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap5.equals(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 10L);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) predicate33, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap37.remove((java.lang.Object) predicate40);
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate40);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) predicate52);
        boolean b54 = defaultedMap46.equals((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate40, predicate52);
        boolean b57 = defaultedMap5.containsValue((java.lang.Object) predicate52);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i22 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        boolean b31 = defaultedMap25.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i38 = defaultedMap34.size();
        java.lang.Object obj39 = defaultedMap29.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap34);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (-1L));
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        boolean b18 = defaultedMap10.equals((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) predicate23, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap27.remove((java.lang.Object) predicate30);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        defaultedMap8.putAll((java.util.Map) defaultedMap36);
        java.util.Set set39 = defaultedMap36.entrySet();
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) 100);
        boolean b42 = defaultedMap4.containsValue((java.lang.Object) b41);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap27.containsKey((java.lang.Object) defaultedMap36);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        java.util.Set set44 = defaultedMap27.entrySet();
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        boolean b31 = defaultedMap25.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i38 = defaultedMap34.size();
        java.lang.Object obj39 = defaultedMap29.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap34);
        java.lang.Object obj40 = defaultedMap17.remove((java.lang.Object) defaultedMap29);
        java.lang.String str41 = defaultedMap17.toString();
        java.lang.Object obj42 = defaultedMap13.get((java.lang.Object) defaultedMap17);
        boolean b43 = defaultedMap3.equals(obj42);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 1 + "'", obj42.equals((short) 1));
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i35 = defaultedMap31.size();
        java.lang.Object obj36 = defaultedMap26.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap31);
        java.lang.Object obj37 = defaultedMap14.remove((java.lang.Object) defaultedMap26);
        java.lang.String str38 = defaultedMap14.toString();
        java.lang.Object obj39 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        boolean b48 = defaultedMap42.containsKey((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i55 = defaultedMap51.size();
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i58 = defaultedMap57.size();
        boolean b59 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap14.containsValue((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 1 + "'", obj39.equals((short) 1));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.remove((java.lang.Object) predicate18);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap15);
        java.util.Set set23 = defaultedMap1.keySet();
        java.lang.String str24 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        int i41 = defaultedMap30.size();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Object obj43 = defaultedMap30.get(obj42);
        java.lang.Object obj44 = defaultedMap1.get(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b50 = defaultedMap46.isEmpty();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b50);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{100=10.0, 100={}}" + "'", str24.equals("{100=10.0, 100={}}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 1 + "'", obj43.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 1 + "'", obj44.equals((short) 1));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.clear();
        defaultedMap1.clear();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) predicate34, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = defaultedMap42.equals((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap52.put((java.lang.Object) predicate55, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) predicate62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.lang.Object obj65 = defaultedMap59.remove((java.lang.Object) predicate62);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate48, predicate62);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate48, predicate69);
        boolean b73 = defaultedMap1.containsKey((java.lang.Object) map72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection84 = defaultedMap83.values();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) defaultedMap83);
        boolean b86 = defaultedMap77.containsKey((java.lang.Object) defaultedMap79);
        boolean b87 = defaultedMap75.containsKey((java.lang.Object) b86);
        boolean b88 = defaultedMap75.isEmpty();
        java.util.Set set89 = defaultedMap75.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap75);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) predicate13, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        boolean b29 = defaultedMap21.equals((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) predicate34, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) predicate41);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate27, predicate48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) predicate56, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        java.lang.Object obj66 = defaultedMap60.remove((java.lang.Object) predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate48, predicate63);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        boolean b13 = defaultedMap5.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) predicate18, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) predicate25);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        defaultedMap3.putAll((java.util.Map) defaultedMap31);
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b36 = defaultedMap31.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b42 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate48, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap52.remove((java.lang.Object) predicate55);
        java.lang.Object obj59 = defaultedMap38.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap52);
        java.util.Set set60 = defaultedMap38.keySet();
        boolean b61 = defaultedMap31.containsValue((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (-1L));
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Set set20 = defaultedMap16.keySet();
        boolean b21 = defaultedMap16.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.remove((java.lang.Object) predicate18);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap15);
        java.util.Set set23 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) defaultedMap31);
        boolean b34 = defaultedMap25.containsKey((java.lang.Object) defaultedMap27);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap25);
        java.util.Collection collection36 = defaultedMap25.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i27 = defaultedMap23.size();
        java.lang.Object obj28 = defaultedMap18.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap23);
        int i29 = defaultedMap18.size();
        java.util.Set set30 = defaultedMap18.keySet();
        boolean b31 = defaultedMap12.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = defaultedMap35.equals((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate48, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap52.remove((java.lang.Object) predicate55);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate41, predicate55);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap61);
        java.util.Set set64 = defaultedMap61.entrySet();
        boolean b65 = defaultedMap12.equals((java.lang.Object) defaultedMap61);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate71);
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) predicate71, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap(obj74);
        java.util.Set set76 = defaultedMap75.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap75);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set76);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        boolean b21 = defaultedMap15.containsKey((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i28 = defaultedMap24.size();
        java.lang.Object obj29 = defaultedMap19.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap24);
        java.lang.Object obj30 = defaultedMap7.remove((java.lang.Object) defaultedMap19);
        java.lang.String str31 = defaultedMap7.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap17.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i17 = defaultedMap16.size();
        java.lang.String str18 = defaultedMap16.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection38 = defaultedMap37.values();
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i46 = defaultedMap42.size();
        java.lang.Object obj47 = defaultedMap37.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap42);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        boolean b56 = defaultedMap50.containsKey((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection63 = defaultedMap62.values();
        boolean b64 = defaultedMap58.containsKey((java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i71 = defaultedMap67.size();
        java.lang.Object obj72 = defaultedMap62.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap67);
        java.lang.Object obj73 = defaultedMap50.remove((java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        defaultedMap62.putAll(map77);
        java.lang.Object obj79 = defaultedMap42.put((java.lang.Object) predicate48, (java.lang.Object) defaultedMap62);
        java.util.Collection collection80 = defaultedMap62.values();
        boolean b81 = defaultedMap1.equals((java.lang.Object) collection80);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(i71 == 1);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        java.util.Set set32 = defaultedMap29.entrySet();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) (short) 100);
        java.util.Set set35 = defaultedMap29.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.remove((java.lang.Object) predicate11);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        boolean b16 = defaultedMap8.containsValue((java.lang.Object) predicateUtils15);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        boolean b45 = defaultedMap39.containsKey((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i52 = defaultedMap48.size();
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap48);
        java.lang.Object obj54 = defaultedMap31.remove((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) predicate59);
        java.lang.Object obj62 = defaultedMap56.put((java.lang.Object) predicate59, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap63.remove((java.lang.Object) predicate66);
        boolean b70 = defaultedMap43.containsValue((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) predicate75);
        java.lang.Object obj78 = defaultedMap72.put((java.lang.Object) predicate75, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) predicate82);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) predicate82);
        java.lang.Object obj85 = defaultedMap79.remove((java.lang.Object) predicate82);
        collections.Predicate predicate86 = null;
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap88.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap93, (java.lang.Object) predicate94);
        boolean b96 = defaultedMap88.equals((java.lang.Object) predicate94);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate86, predicate94);
        java.util.Map map98 = collections.map.PredicatedMap.decorate(map29, predicate66, predicate94);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        boolean b17 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap20.containsKey((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i33 = defaultedMap29.size();
        java.lang.Object obj34 = defaultedMap24.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap29);
        java.lang.Object obj35 = defaultedMap12.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) predicate40, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap44.remove((java.lang.Object) predicate47);
        boolean b51 = defaultedMap24.containsValue((java.lang.Object) predicate47);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) predicate60);
        boolean b62 = defaultedMap54.equals((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        boolean b64 = defaultedMap1.containsKey((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{100=10.0}" + "'", str9.equals("{100=10.0}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection16 = defaultedMap15.values();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i24 = defaultedMap20.size();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        boolean b34 = defaultedMap28.containsKey((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i41 = defaultedMap37.size();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        java.lang.Object obj44 = defaultedMap26.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.util.Set set46 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 1 + "'", obj45.equals((short) 1));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        java.util.Set set48 = defaultedMap10.keySet();
        boolean b49 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection16 = defaultedMap15.values();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i24 = defaultedMap20.size();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        boolean b34 = defaultedMap28.containsKey((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i41 = defaultedMap37.size();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        java.lang.Object obj44 = defaultedMap26.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 1 + "'", obj45.equals((short) 1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        boolean b16 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        boolean b29 = defaultedMap21.equals((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) predicate34, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) predicate41);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap47);
        java.util.Set set50 = defaultedMap47.entrySet();
        boolean b52 = defaultedMap47.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b58 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) predicate64, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        java.lang.Object obj74 = defaultedMap68.remove((java.lang.Object) predicate71);
        java.lang.Object obj75 = defaultedMap54.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap68);
        java.util.Set set76 = defaultedMap54.keySet();
        boolean b77 = defaultedMap47.containsValue((java.lang.Object) set76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        defaultedMap16.putAll((java.util.Map) defaultedMap47);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        int i16 = defaultedMap5.size();
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) 10L);
        java.util.Collection collection19 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap27.containsKey((java.lang.Object) defaultedMap36);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap27.containsValue(obj44);
        java.util.Collection collection46 = defaultedMap27.values();
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i31 = defaultedMap27.size();
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = defaultedMap16.remove((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) predicate39);
        java.lang.Object obj42 = defaultedMap36.put((java.lang.Object) predicate39, (java.lang.Object) (short) 100);
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) predicate49, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection59 = defaultedMap58.values();
        boolean b60 = defaultedMap54.containsKey((java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i67 = defaultedMap63.size();
        java.lang.Object obj68 = defaultedMap58.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap63);
        int i69 = defaultedMap58.size();
        java.util.Set set70 = defaultedMap58.keySet();
        java.lang.Object obj71 = defaultedMap36.put((java.lang.Object) (short) 100, (java.lang.Object) set70);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 1 + "'", obj44.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(i67 == 1);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(i69 == 1);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i17 = defaultedMap16.size();
        java.util.Map map18 = null;
        try {
            defaultedMap16.putAll(map18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        boolean b22 = defaultedMap14.equals((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap24.put((java.lang.Object) predicate27, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap31.remove((java.lang.Object) predicate34);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate20, predicate34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap40);
        java.util.Set set43 = defaultedMap40.entrySet();
        boolean b45 = defaultedMap40.containsKey((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b51 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) predicate57, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        java.lang.Object obj67 = defaultedMap61.remove((java.lang.Object) predicate64);
        java.lang.Object obj68 = defaultedMap47.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap61);
        java.util.Set set69 = defaultedMap47.keySet();
        boolean b70 = defaultedMap40.containsValue((java.lang.Object) set69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        defaultedMap3.putAll((java.util.Map) defaultedMap71);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.String str26 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        boolean b35 = defaultedMap29.containsKey((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection42 = defaultedMap41.values();
        boolean b43 = defaultedMap37.containsKey((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i50 = defaultedMap46.size();
        java.lang.Object obj51 = defaultedMap41.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap46);
        java.lang.Object obj52 = defaultedMap29.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) predicate57, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        java.lang.Object obj67 = defaultedMap61.remove((java.lang.Object) predicate64);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate64);
        java.lang.Object obj69 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) predicate64);
        boolean b70 = defaultedMap16.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{100=10.0}" + "'", str26.equals("{100=10.0}"));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap1.equals((java.lang.Object) "");
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i30 = defaultedMap26.size();
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i47 = defaultedMap43.size();
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap32.remove((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap52.containsKey((java.lang.Object) defaultedMap56);
        java.lang.Object obj59 = defaultedMap1.put((java.lang.Object) defaultedMap49, (java.lang.Object) b58);
        java.util.Set set60 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection71 = defaultedMap70.values();
        boolean b72 = defaultedMap66.containsKey((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection79 = defaultedMap78.values();
        boolean b80 = defaultedMap74.containsKey((java.lang.Object) defaultedMap78);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj86 = defaultedMap83.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i87 = defaultedMap83.size();
        java.lang.Object obj88 = defaultedMap78.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap83);
        java.lang.Object obj89 = defaultedMap66.remove((java.lang.Object) defaultedMap78);
        java.lang.String str90 = defaultedMap66.toString();
        java.lang.Object obj91 = defaultedMap62.get((java.lang.Object) defaultedMap66);
        boolean b92 = defaultedMap49.containsKey((java.lang.Object) defaultedMap66);
        java.util.Set set93 = defaultedMap66.keySet();
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(i87 == 1);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 1 + "'", obj91.equals((short) 1));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.remove((java.lang.Object) predicate18);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b28 = defaultedMap15.containsKey(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i43 = defaultedMap39.size();
        java.lang.Object obj44 = defaultedMap34.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap15.remove(obj50);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        int i16 = defaultedMap5.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = defaultedMap5.get(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap20.containsKey((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i33 = defaultedMap29.size();
        java.lang.Object obj34 = defaultedMap24.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap29);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection42 = defaultedMap41.values();
        boolean b43 = defaultedMap37.containsKey((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection50 = defaultedMap49.values();
        boolean b51 = defaultedMap45.containsKey((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i58 = defaultedMap54.size();
        java.lang.Object obj59 = defaultedMap49.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap54);
        java.lang.Object obj60 = defaultedMap37.remove((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) predicate63);
        defaultedMap49.putAll(map64);
        java.lang.Object obj66 = defaultedMap29.put((java.lang.Object) predicate35, (java.lang.Object) defaultedMap49);
        java.util.Set set67 = defaultedMap29.keySet();
        boolean b68 = defaultedMap5.containsValue((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) predicate78);
        java.lang.Object obj81 = defaultedMap75.put((java.lang.Object) predicate78, (java.lang.Object) (short) 100);
        int i82 = defaultedMap75.size();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) defaultedMap75);
        java.lang.String str84 = defaultedMap73.toString();
        java.util.Set set85 = defaultedMap73.keySet();
        boolean b86 = defaultedMap5.containsValue((java.lang.Object) set85);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 1 + "'", obj18.equals((short) 1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) defaultedMap17);
        boolean b20 = defaultedMap11.containsKey((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap9.containsKey((java.lang.Object) b20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b20);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) defaultedMap22);
        defaultedMap7.clear();
        boolean b25 = defaultedMap4.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap27.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10L);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        boolean b25 = defaultedMap16.containsKey((java.lang.Object) defaultedMap18);
        boolean b26 = defaultedMap14.containsKey((java.lang.Object) b25);
        boolean b27 = defaultedMap14.isEmpty();
        java.util.Set set28 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i43 = defaultedMap39.size();
        java.lang.Object obj44 = defaultedMap34.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap47.containsKey((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i60 = defaultedMap56.size();
        java.lang.Object obj61 = defaultedMap51.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap56);
        java.lang.Object obj63 = defaultedMap45.remove((java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection70 = defaultedMap69.values();
        boolean b71 = defaultedMap65.containsKey((java.lang.Object) defaultedMap69);
        java.lang.Object obj72 = defaultedMap14.put((java.lang.Object) defaultedMap62, (java.lang.Object) b71);
        int i73 = defaultedMap62.size();
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) i73);
        java.lang.Object obj75 = defaultedMap4.remove((java.lang.Object) i73);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 1 + "'", obj74.equals((short) 1));
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) defaultedMap17);
        boolean b20 = defaultedMap11.containsKey((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap9.containsKey((java.lang.Object) b20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b20);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) defaultedMap22);
        defaultedMap7.clear();
        boolean b25 = defaultedMap4.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) predicate30, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.lang.Object obj40 = defaultedMap34.remove((java.lang.Object) predicate37);
        collections.Predicate predicate41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        boolean b51 = defaultedMap43.equals((java.lang.Object) predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate49);
        java.util.Set set53 = defaultedMap34.entrySet();
        boolean b54 = defaultedMap4.containsKey((java.lang.Object) set53);
        int i55 = defaultedMap4.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap7.containsKey((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        boolean b15 = defaultedMap3.containsKey((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b25 = defaultedMap20.containsValue((java.lang.Object) (short) 0);
        boolean b27 = defaultedMap20.equals((java.lang.Object) "");
        java.lang.String str28 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i43 = defaultedMap39.size();
        java.lang.Object obj44 = defaultedMap34.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) predicate48);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{100=10.0}" + "'", str28.equals("{100=10.0}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) predicate11, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap15.remove((java.lang.Object) predicate18);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection29 = defaultedMap28.values();
        boolean b30 = defaultedMap24.containsKey((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        boolean b38 = defaultedMap32.containsKey((java.lang.Object) defaultedMap36);
        java.lang.Object obj39 = defaultedMap28.remove((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b46 = defaultedMap41.containsValue((java.lang.Object) (short) 0);
        boolean b48 = defaultedMap41.equals((java.lang.Object) "");
        java.lang.String str49 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap52.put((java.lang.Object) predicate55, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) predicate62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.lang.Object obj65 = defaultedMap59.remove((java.lang.Object) predicate62);
        collections.Predicate predicate66 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj71 = defaultedMap68.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) predicate74);
        boolean b76 = defaultedMap68.equals((java.lang.Object) predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate66, predicate74);
        java.lang.Object obj78 = defaultedMap32.put((java.lang.Object) defaultedMap41, (java.lang.Object) map77);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj78);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{100=10.0}" + "'", str49.equals("{100=10.0}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap20.containsKey((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i33 = defaultedMap29.size();
        java.lang.Object obj34 = defaultedMap24.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap29);
        java.lang.Object obj35 = defaultedMap12.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) predicate40, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap44.remove((java.lang.Object) predicate47);
        boolean b51 = defaultedMap24.containsValue((java.lang.Object) predicate47);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) predicate47);
        collections.Transformer transformer53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{100=10.0}" + "'", str9.equals("{100=10.0}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.remove((java.lang.Object) predicate11);
        collections.Predicate predicate15 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap17.equals((java.lang.Object) predicate23);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) predicate31, (java.lang.Object) (short) 100);
        int i35 = defaultedMap28.size();
        java.util.Set set36 = defaultedMap28.keySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 10L);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap18.containsKey(obj24);
        boolean b26 = defaultedMap16.containsValue((java.lang.Object) b25);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) predicate16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) predicate23);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        java.util.Set set32 = defaultedMap29.entrySet();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) (short) 100);
        defaultedMap29.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i22 = defaultedMap18.size();
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        defaultedMap13.putAll(map28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) map31);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) predicate4, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap8.remove((java.lang.Object) predicate11);
        collections.Predicate predicate15 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap17.equals((java.lang.Object) predicate23);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate23);
        java.util.Set set27 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) defaultedMap5);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i30 = defaultedMap26.size();
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i47 = defaultedMap43.size();
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap32.remove((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap52.containsKey((java.lang.Object) defaultedMap56);
        java.lang.Object obj59 = defaultedMap1.put((java.lang.Object) defaultedMap49, (java.lang.Object) b58);
        java.lang.String str60 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{{}=false}" + "'", str60.equals("{{}=false}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i35 = defaultedMap31.size();
        java.lang.Object obj36 = defaultedMap26.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap31);
        java.lang.Object obj37 = defaultedMap14.remove((java.lang.Object) defaultedMap26);
        java.lang.String str38 = defaultedMap14.toString();
        java.lang.Object obj39 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        java.lang.String str41 = defaultedMap14.toString();
        boolean b42 = defaultedMap14.isEmpty();
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 1 + "'", obj39.equals((short) 1));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap30.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        defaultedMap30.putAll(map45);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i27 = defaultedMap23.size();
        java.lang.Object obj28 = defaultedMap18.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap23);
        int i29 = defaultedMap18.size();
        java.util.Set set30 = defaultedMap18.keySet();
        boolean b31 = defaultedMap12.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = defaultedMap35.equals((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) predicate48, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap52.remove((java.lang.Object) predicate55);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate41, predicate55);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap61);
        java.util.Set set64 = defaultedMap61.entrySet();
        boolean b65 = defaultedMap12.equals((java.lang.Object) defaultedMap61);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate71);
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) predicate71, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap(obj74);
        java.lang.Object obj76 = null;
        java.lang.Object obj77 = defaultedMap75.get(obj76);
        boolean b78 = defaultedMap12.containsKey((java.lang.Object) defaultedMap75);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap10);
        java.lang.String str16 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection29 = defaultedMap28.values();
        boolean b30 = defaultedMap24.containsKey((java.lang.Object) defaultedMap28);
        boolean b31 = defaultedMap22.containsKey((java.lang.Object) defaultedMap24);
        boolean b32 = defaultedMap20.containsKey((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b31);
        boolean b34 = defaultedMap18.containsValue((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        boolean b42 = defaultedMap36.containsKey((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection49 = defaultedMap48.values();
        boolean b50 = defaultedMap44.containsKey((java.lang.Object) defaultedMap48);
        java.lang.Object obj51 = defaultedMap40.remove((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 100, (java.lang.Object) 10.0f);
        boolean b58 = defaultedMap53.containsValue((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap44.containsKey((java.lang.Object) defaultedMap53);
        boolean b60 = defaultedMap18.equals((java.lang.Object) defaultedMap44);
        java.util.Collection collection61 = defaultedMap44.values();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap44);
        int i63 = defaultedMap44.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{1={100=10.0}}" + "'", str16.equals("{1={100=10.0}}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(i63 == 0);
    }
}

