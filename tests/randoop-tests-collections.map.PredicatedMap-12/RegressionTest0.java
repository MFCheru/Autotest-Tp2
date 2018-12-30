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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Set set8 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        int i14 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate19, predicate22);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        int i14 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        boolean b20 = defaultedMap16.equals((java.lang.Object) predicate19);
        boolean b21 = defaultedMap11.containsKey((java.lang.Object) defaultedMap16);
        java.lang.Object obj24 = defaultedMap11.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        int i5 = defaultedMap4.size();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.equals((java.lang.Object) '4');
        java.util.Set set13 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        int i16 = defaultedMap15.size();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) defaultedMap18, (java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap15.keySet();
        java.lang.Object obj22 = defaultedMap10.remove((java.lang.Object) set21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj22);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) predicate21);
        java.util.Collection collection23 = defaultedMap17.values();
        java.util.Set set24 = defaultedMap17.keySet();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        int i32 = defaultedMap31.size();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) defaultedMap34, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.equals((java.lang.Object) '4');
        java.util.Set set40 = defaultedMap37.keySet();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils41);
        int i43 = defaultedMap42.size();
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) defaultedMap45, (java.lang.Object) 0.0f);
        java.util.Set set48 = defaultedMap42.keySet();
        java.lang.Object obj49 = defaultedMap37.remove((java.lang.Object) set48);
        java.lang.Object obj50 = defaultedMap28.remove((java.lang.Object) set48);
        boolean b51 = defaultedMap1.equals((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.equals((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap4.entrySet();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        int i12 = defaultedMap11.size();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) defaultedMap14, (java.lang.Object) 0.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        boolean b21 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        int i24 = defaultedMap23.size();
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) defaultedMap26, (java.lang.Object) 0.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap11.get((java.lang.Object) map31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        int i35 = defaultedMap34.size();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) defaultedMap37, (java.lang.Object) 0.0f);
        java.util.Set set40 = defaultedMap34.keySet();
        boolean b41 = defaultedMap11.containsValue((java.lang.Object) defaultedMap34);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        int i44 = defaultedMap43.size();
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils45);
        java.lang.Object obj48 = defaultedMap43.put((java.lang.Object) defaultedMap46, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.equals((java.lang.Object) '4');
        java.util.Set set52 = defaultedMap49.keySet();
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils53);
        int i55 = defaultedMap54.size();
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils56);
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) defaultedMap57, (java.lang.Object) 0.0f);
        java.util.Set set60 = defaultedMap54.keySet();
        java.lang.Object obj61 = defaultedMap49.remove((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap1.put((java.lang.Object) defaultedMap11, obj61);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate18);
        boolean b20 = defaultedMap1.isEmpty();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        int i15 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) predicate21);
        java.util.Collection collection23 = defaultedMap17.values();
        java.util.Set set24 = defaultedMap17.keySet();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) "hi!", (java.lang.Object) predicate35);
        java.util.Collection collection37 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap28.remove((java.lang.Object) defaultedMap31);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate39, predicate45);
        boolean b48 = defaultedMap1.containsValue((java.lang.Object) map47);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) "{}");
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) "hi!", (java.lang.Object) predicate16);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        int i20 = defaultedMap19.size();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.equals((java.lang.Object) predicate25);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        int i29 = defaultedMap28.size();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) defaultedMap31, (java.lang.Object) 0.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        int i39 = defaultedMap38.size();
        java.lang.Object obj40 = defaultedMap28.remove((java.lang.Object) i39);
        java.lang.Object obj42 = defaultedMap28.get((java.lang.Object) "hi!");
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap28);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put((java.lang.Object) "hi!", (java.lang.Object) predicate49);
        java.util.Collection collection51 = defaultedMap45.values();
        java.util.Set set52 = defaultedMap45.keySet();
        java.lang.Object obj54 = defaultedMap45.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils55);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils58);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj64 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) predicate63);
        java.util.Collection collection65 = defaultedMap59.values();
        java.lang.Object obj66 = defaultedMap56.remove((java.lang.Object) defaultedMap59);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils68 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils68);
        boolean b71 = defaultedMap69.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj74 = defaultedMap69.put((java.lang.Object) "hi!", (java.lang.Object) predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate67, predicate73);
        java.util.Set set76 = defaultedMap59.keySet();
        collections.PredicateUtils predicateUtils77 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils77);
        int i79 = defaultedMap78.size();
        collections.PredicateUtils predicateUtils80 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils80);
        java.lang.Object obj83 = defaultedMap78.put((java.lang.Object) defaultedMap81, (java.lang.Object) 0.0f);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate84, predicate85);
        collections.Predicate predicate87 = null;
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate84, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map43, predicate84, predicate89);
        java.lang.Object obj91 = defaultedMap12.get((java.lang.Object) predicate89);
        java.lang.Object obj92 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj92);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        int i17 = defaultedMap16.size();
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) defaultedMap19, (java.lang.Object) 0.0f);
        java.util.Set set22 = defaultedMap16.keySet();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.equals((java.lang.Object) predicate7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        int i11 = defaultedMap10.size();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) defaultedMap13, (java.lang.Object) 0.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        java.lang.String str19 = defaultedMap10.toString();
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.lang.String str21 = defaultedMap10.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{{}=0.0}" + "'", str19.equals("{{}=0.0}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{{}=0.0}" + "'", str21.equals("{{}=0.0}"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        int i17 = defaultedMap16.size();
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) defaultedMap19, (java.lang.Object) 0.0f);
        java.util.Set set22 = defaultedMap16.keySet();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) predicate29);
        java.util.Collection collection31 = defaultedMap25.values();
        java.util.Set set32 = defaultedMap25.keySet();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        defaultedMap25.putAll((java.util.Map) defaultedMap36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate29);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        int i34 = defaultedMap33.size();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) defaultedMap36, (java.lang.Object) 0.0f);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        int i44 = defaultedMap43.size();
        java.lang.Object obj45 = defaultedMap33.remove((java.lang.Object) i44);
        boolean b46 = defaultedMap15.containsKey((java.lang.Object) defaultedMap33);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) predicate52);
        java.util.Collection collection54 = defaultedMap48.values();
        java.util.Set set55 = defaultedMap48.keySet();
        java.lang.Object obj56 = defaultedMap33.get((java.lang.Object) defaultedMap48);
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils57);
        int i59 = defaultedMap58.size();
        java.util.Set set60 = defaultedMap58.keySet();
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) set60, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        int i25 = defaultedMap24.size();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) defaultedMap27, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        boolean b34 = defaultedMap24.containsKey((java.lang.Object) (byte) 1);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        int i37 = defaultedMap36.size();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) defaultedMap39, (java.lang.Object) 0.0f);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap24.get((java.lang.Object) map44);
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils46);
        int i48 = defaultedMap47.size();
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) defaultedMap50, (java.lang.Object) 0.0f);
        java.util.Set set53 = defaultedMap47.keySet();
        boolean b54 = defaultedMap24.containsValue((java.lang.Object) defaultedMap47);
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils55);
        boolean b57 = defaultedMap56.isEmpty();
        java.lang.Object obj58 = defaultedMap12.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap56);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap5.containsKey(obj14);
        java.lang.String str16 = defaultedMap5.toString();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        int i21 = defaultedMap20.size();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) defaultedMap23, (java.lang.Object) 0.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.equals((java.lang.Object) predicate26);
        boolean b28 = defaultedMap18.containsKey((java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = defaultedMap18.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        int i32 = defaultedMap18.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        int i9 = defaultedMap8.size();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) defaultedMap11, (java.lang.Object) 0.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        int i19 = defaultedMap18.size();
        java.lang.Object obj20 = defaultedMap8.remove((java.lang.Object) i19);
        java.lang.Object obj22 = defaultedMap8.get((java.lang.Object) "hi!");
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        int i25 = defaultedMap24.size();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) defaultedMap27, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.equals((java.lang.Object) predicate30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        int i34 = defaultedMap33.size();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) defaultedMap36, (java.lang.Object) 0.0f);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap36.equals((java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate30, predicate39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap8);
        java.lang.String str43 = defaultedMap8.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{{}=0.0}" + "'", str43.equals("{{}=0.0}"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        int i12 = defaultedMap11.size();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) defaultedMap14, (java.lang.Object) 0.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        boolean b21 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        java.lang.String str22 = defaultedMap11.toString();
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) 100.0f, (java.lang.Object) defaultedMap11);
        java.util.Collection collection24 = defaultedMap11.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{{}=0.0}" + "'", str22.equals("{{}=0.0}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        int i14 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) map21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        int i25 = defaultedMap24.size();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) defaultedMap27, (java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap24.keySet();
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) defaultedMap24);
        defaultedMap1.clear();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) predicate38);
        java.util.Collection collection40 = defaultedMap34.values();
        java.util.Set set41 = defaultedMap34.keySet();
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) predicate52);
        java.util.Collection collection54 = defaultedMap48.values();
        java.lang.Object obj55 = defaultedMap45.remove((java.lang.Object) defaultedMap48);
        boolean b57 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) defaultedMap48);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        collections.PredicateUtils predicateUtils61 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils61);
        int i63 = defaultedMap62.size();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils64);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) defaultedMap65, (java.lang.Object) 0.0f);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        boolean b69 = defaultedMap65.equals((java.lang.Object) predicate68);
        boolean b70 = defaultedMap60.containsKey((java.lang.Object) defaultedMap65);
        java.lang.Object obj73 = defaultedMap60.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils74 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils74);
        int i76 = defaultedMap75.size();
        collections.PredicateUtils predicateUtils77 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils77);
        java.lang.Object obj80 = defaultedMap75.put((java.lang.Object) defaultedMap78, (java.lang.Object) 0.0f);
        java.util.Set set81 = defaultedMap75.keySet();
        java.lang.Object obj82 = defaultedMap60.remove((java.lang.Object) defaultedMap75);
        boolean b83 = defaultedMap1.containsKey((java.lang.Object) defaultedMap75);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.equals((java.lang.Object) '4');
        java.util.Set set10 = defaultedMap7.keySet();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        int i14 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.remove((java.lang.Object) map21);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        int i14 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) defaultedMap16, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) map21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        int i25 = defaultedMap24.size();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) defaultedMap27, (java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap24.keySet();
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) defaultedMap24);
        java.util.Set set32 = defaultedMap24.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        int i5 = defaultedMap4.size();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) defaultedMap7, (java.lang.Object) 0.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate11);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) (byte) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        int i20 = defaultedMap19.size();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.equals((java.lang.Object) predicate25);
        boolean b27 = defaultedMap17.containsKey((java.lang.Object) defaultedMap22);
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        int i30 = defaultedMap29.size();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) defaultedMap32, (java.lang.Object) 0.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate35, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate35);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate41);
        java.util.Set set43 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.equals((java.lang.Object) predicate7);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        int i11 = defaultedMap10.size();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils12);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) defaultedMap13, (java.lang.Object) 0.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        int i21 = defaultedMap20.size();
        java.lang.Object obj22 = defaultedMap10.remove((java.lang.Object) i21);
        java.lang.Object obj24 = defaultedMap10.get((java.lang.Object) "hi!");
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap10);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) "hi!", (java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap27.values();
        java.util.Set set34 = defaultedMap27.keySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) predicate45);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap38.remove((java.lang.Object) defaultedMap41);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) "hi!", (java.lang.Object) predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate55);
        java.util.Set set58 = defaultedMap41.keySet();
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        int i61 = defaultedMap60.size();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils62);
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) defaultedMap63, (java.lang.Object) 0.0f);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        collections.Predicate predicate69 = null;
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate66, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map25, predicate66, predicate71);
        collections.Transformer transformer73 = null;
        try {
            java.util.Map map74 = collections.map.DefaultedMap.decorate(map72, transformer73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) predicate28);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        int i35 = defaultedMap34.size();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) defaultedMap37, (java.lang.Object) 0.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.equals((java.lang.Object) predicate40);
        boolean b42 = defaultedMap32.containsKey((java.lang.Object) defaultedMap37);
        boolean b43 = defaultedMap24.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj44 = defaultedMap12.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap15.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.String str12 = defaultedMap6.toString();
        java.lang.String str13 = defaultedMap6.toString();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap6.containsValue(obj14);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) i12);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) i12);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        int i18 = defaultedMap17.size();
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) defaultedMap20, (java.lang.Object) 0.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.equals((java.lang.Object) predicate23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        int i27 = defaultedMap26.size();
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) defaultedMap29, (java.lang.Object) 0.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        boolean b33 = defaultedMap29.equals((java.lang.Object) predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate32);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        int i39 = defaultedMap38.size();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) defaultedMap41, (java.lang.Object) 0.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.equals((java.lang.Object) predicate44);
        boolean b46 = defaultedMap36.containsKey((java.lang.Object) defaultedMap41);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        int i49 = defaultedMap48.size();
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) defaultedMap51, (java.lang.Object) 0.0f);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap41.remove((java.lang.Object) map56);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0f + "'", obj58.equals(0.0f));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        int i27 = defaultedMap26.size();
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) defaultedMap29, (java.lang.Object) 0.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        boolean b33 = defaultedMap29.equals((java.lang.Object) predicate32);
        boolean b34 = defaultedMap24.containsKey((java.lang.Object) defaultedMap29);
        defaultedMap15.putAll((java.util.Map) defaultedMap24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.equals((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap4.entrySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        int i12 = defaultedMap11.size();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils13);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) defaultedMap14, (java.lang.Object) 0.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.equals((java.lang.Object) predicate17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        int i21 = defaultedMap20.size();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) defaultedMap23, (java.lang.Object) 0.0f);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate27);
        java.lang.String str29 = defaultedMap20.toString();
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b31 = defaultedMap4.equals((java.lang.Object) defaultedMap14);
        java.util.Collection collection32 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils41);
        int i43 = defaultedMap42.size();
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils44);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) defaultedMap45, (java.lang.Object) 0.0f);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap45.equals((java.lang.Object) predicate48);
        boolean b50 = defaultedMap40.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj53 = defaultedMap40.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils54);
        int i56 = defaultedMap55.size();
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils57);
        java.lang.Object obj60 = defaultedMap55.put((java.lang.Object) defaultedMap58, (java.lang.Object) 0.0f);
        java.util.Set set61 = defaultedMap55.keySet();
        java.lang.Object obj62 = defaultedMap40.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj63 = defaultedMap34.put((java.lang.Object) defaultedMap36, obj62);
        defaultedMap4.putAll((java.util.Map) defaultedMap34);
        defaultedMap34.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{{}=0.0}" + "'", str29.equals("{{}=0.0}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap5.containsKey(obj14);
        java.lang.String str16 = defaultedMap5.toString();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b25 = defaultedMap5.equals((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap5.containsKey(obj14);
        java.lang.String str16 = defaultedMap5.toString();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b25 = defaultedMap5.equals((java.lang.Object) defaultedMap18);
        java.util.Set set26 = defaultedMap18.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100.0d);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        int i13 = defaultedMap12.size();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) defaultedMap15, (java.lang.Object) 0.0f);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        boolean b19 = defaultedMap15.equals((java.lang.Object) predicate18);
        boolean b20 = defaultedMap10.containsKey((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        int i23 = defaultedMap22.size();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) defaultedMap25, (java.lang.Object) 0.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate28, predicate31);
        java.util.Set set33 = defaultedMap15.entrySet();
        boolean b34 = defaultedMap4.containsValue((java.lang.Object) set33);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        int i39 = defaultedMap38.size();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) defaultedMap41, (java.lang.Object) 0.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.equals((java.lang.Object) predicate44);
        boolean b46 = defaultedMap36.containsKey((java.lang.Object) defaultedMap41);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils47);
        int i49 = defaultedMap48.size();
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) defaultedMap51, (java.lang.Object) 0.0f);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate54, predicate57);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) "hi!", (java.lang.Object) predicate64);
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils66);
        collections.PredicateUtils predicateUtils68 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils68);
        int i70 = defaultedMap69.size();
        collections.PredicateUtils predicateUtils71 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils71);
        java.lang.Object obj74 = defaultedMap69.put((java.lang.Object) defaultedMap72, (java.lang.Object) 0.0f);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        boolean b76 = defaultedMap72.equals((java.lang.Object) predicate75);
        boolean b77 = defaultedMap67.containsKey((java.lang.Object) defaultedMap72);
        collections.PredicateUtils predicateUtils78 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils78);
        int i80 = defaultedMap79.size();
        collections.PredicateUtils predicateUtils81 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils81);
        java.lang.Object obj84 = defaultedMap79.put((java.lang.Object) defaultedMap82, (java.lang.Object) 0.0f);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate85, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map58, predicate64, predicate85);
        collections.PredicateUtils predicateUtils91 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils91);
        boolean b94 = defaultedMap92.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate96 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj97 = defaultedMap92.put((java.lang.Object) "hi!", (java.lang.Object) predicate96);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate85, predicate96);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b15 = defaultedMap5.containsKey(obj14);
        java.lang.String str16 = defaultedMap5.toString();
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        int i17 = defaultedMap16.size();
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) defaultedMap19, (java.lang.Object) 0.0f);
        java.util.Set set22 = defaultedMap16.keySet();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) 0.0f);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) "hi!", (java.lang.Object) predicate13);
        java.util.Collection collection15 = defaultedMap9.values();
        java.util.Set set16 = defaultedMap9.keySet();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils19);
        defaultedMap9.putAll((java.util.Map) defaultedMap20);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) predicate27);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) "hi!", (java.lang.Object) predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate37);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        int i42 = defaultedMap41.size();
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) defaultedMap44, (java.lang.Object) 0.0f);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate47, predicate48);
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        int i52 = defaultedMap51.size();
        java.lang.Object obj53 = defaultedMap41.remove((java.lang.Object) i52);
        boolean b54 = defaultedMap23.containsKey((java.lang.Object) defaultedMap41);
        defaultedMap1.putAll((java.util.Map) defaultedMap41);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate29);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        int i34 = defaultedMap33.size();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils35);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) defaultedMap36, (java.lang.Object) 0.0f);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        int i44 = defaultedMap43.size();
        java.lang.Object obj45 = defaultedMap33.remove((java.lang.Object) i44);
        boolean b46 = defaultedMap15.containsKey((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) 0.0f);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) predicate21);
        java.util.Collection collection23 = defaultedMap17.values();
        java.util.Set set24 = defaultedMap17.keySet();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        int i29 = defaultedMap28.size();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils30);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) defaultedMap31, (java.lang.Object) 0.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils37);
        int i39 = defaultedMap38.size();
        java.lang.Object obj40 = defaultedMap28.remove((java.lang.Object) i39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap17.put((java.lang.Object) defaultedMap28, obj41);
        boolean b43 = defaultedMap5.containsValue(obj41);
        java.util.Collection collection44 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        int i6 = defaultedMap5.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.equals((java.lang.Object) predicate15);
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object obj20 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        int i21 = defaultedMap7.size();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils22);
        int i24 = defaultedMap23.size();
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils25);
        int i27 = defaultedMap26.size();
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) defaultedMap29, (java.lang.Object) 0.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate33);
        boolean b36 = defaultedMap26.containsKey((java.lang.Object) (byte) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils40);
        int i42 = defaultedMap41.size();
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) defaultedMap44, (java.lang.Object) 0.0f);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        boolean b48 = defaultedMap44.equals((java.lang.Object) predicate47);
        boolean b49 = defaultedMap39.containsKey((java.lang.Object) defaultedMap44);
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils50);
        int i52 = defaultedMap51.size();
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils53);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) defaultedMap54, (java.lang.Object) 0.0f);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate57, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate37, predicate57);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate57, predicate63);
        java.lang.Object obj65 = defaultedMap7.get((java.lang.Object) predicate63);
        java.lang.Object obj66 = defaultedMap1.get((java.lang.Object) predicate63);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils7);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap8.values();
        java.util.Set set15 = defaultedMap8.keySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils18);
        defaultedMap8.putAll((java.util.Map) defaultedMap19);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) predicate26);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap19.remove((java.lang.Object) defaultedMap22);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate36);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils39);
        int i41 = defaultedMap40.size();
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils42);
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) defaultedMap43, (java.lang.Object) 0.0f);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate47);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils49);
        int i51 = defaultedMap50.size();
        java.lang.Object obj52 = defaultedMap40.remove((java.lang.Object) i51);
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) "hi!");
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils55);
        int i57 = defaultedMap56.size();
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils58);
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) defaultedMap59, (java.lang.Object) 0.0f);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        boolean b63 = defaultedMap59.equals((java.lang.Object) predicate62);
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils64);
        int i66 = defaultedMap65.size();
        collections.PredicateUtils predicateUtils67 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils67);
        java.lang.Object obj70 = defaultedMap65.put((java.lang.Object) defaultedMap68, (java.lang.Object) 0.0f);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        boolean b72 = defaultedMap68.equals((java.lang.Object) predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate62, predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate62);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        int i29 = defaultedMap28.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        int i33 = defaultedMap32.size();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils34);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) defaultedMap35, (java.lang.Object) 0.0f);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate38, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) map42);
        defaultedMap15.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        int i2 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils3);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.equals((java.lang.Object) '4');
        java.util.Set set10 = defaultedMap7.keySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10L);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        int i8 = defaultedMap7.size();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils9);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) defaultedMap10, (java.lang.Object) 0.0f);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        boolean b14 = defaultedMap10.equals((java.lang.Object) predicate13);
        boolean b15 = defaultedMap5.containsKey((java.lang.Object) defaultedMap10);
        java.lang.Object obj18 = defaultedMap5.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        int i19 = defaultedMap5.size();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils20);
        int i22 = defaultedMap21.size();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        int i25 = defaultedMap24.size();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils26);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) defaultedMap27, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        boolean b34 = defaultedMap24.containsKey((java.lang.Object) (byte) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils38);
        int i40 = defaultedMap39.size();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils41);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) defaultedMap42, (java.lang.Object) 0.0f);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        boolean b46 = defaultedMap42.equals((java.lang.Object) predicate45);
        boolean b47 = defaultedMap37.containsKey((java.lang.Object) defaultedMap42);
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils48);
        int i50 = defaultedMap49.size();
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils51);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) defaultedMap52, (java.lang.Object) 0.0f);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate55, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate35, predicate55);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate55, predicate61);
        java.lang.Object obj63 = defaultedMap5.get((java.lang.Object) predicate61);
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) predicate61, obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) defaultedMap6, (java.lang.Object) 0.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        int i15 = defaultedMap1.size();
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils8);
        int i10 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) defaultedMap12, (java.lang.Object) 0.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.equals((java.lang.Object) predicate15);
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object obj20 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        int i23 = defaultedMap22.size();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) defaultedMap25, (java.lang.Object) 0.0f);
        java.util.Set set28 = defaultedMap22.keySet();
        java.lang.Object obj29 = defaultedMap7.remove((java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) defaultedMap3, obj29);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        int i35 = defaultedMap34.size();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) defaultedMap37, (java.lang.Object) 0.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.equals((java.lang.Object) predicate40);
        boolean b42 = defaultedMap32.containsKey((java.lang.Object) defaultedMap37);
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils43);
        int i45 = defaultedMap44.size();
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils46);
        java.lang.Object obj49 = defaultedMap44.put((java.lang.Object) defaultedMap47, (java.lang.Object) 0.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate50, predicate53);
        java.lang.Object obj55 = defaultedMap3.get((java.lang.Object) map54);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap15.entrySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils23);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 10.0d);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        int i29 = defaultedMap28.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils31);
        int i33 = defaultedMap32.size();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils34);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) defaultedMap35, (java.lang.Object) 0.0f);
        boolean b38 = defaultedMap28.containsKey(obj37);
        java.lang.String str39 = defaultedMap28.toString();
        java.lang.Object obj40 = defaultedMap12.get((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate29);
        java.util.Set set32 = defaultedMap15.keySet();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils33);
        int i35 = defaultedMap34.size();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils36);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) defaultedMap37, (java.lang.Object) 0.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate40, predicate43);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils45);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj51 = defaultedMap46.put((java.lang.Object) "hi!", (java.lang.Object) predicate50);
        java.util.Collection collection52 = defaultedMap46.values();
        java.util.Set set53 = defaultedMap46.keySet();
        java.lang.Object obj55 = defaultedMap46.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils56);
        defaultedMap46.putAll((java.util.Map) defaultedMap57);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils59);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) "hi!", (java.lang.Object) predicate64);
        java.util.Collection collection66 = defaultedMap60.values();
        java.lang.Object obj67 = defaultedMap57.remove((java.lang.Object) defaultedMap60);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.PredicateUtils predicateUtils69 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils69);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj75 = defaultedMap70.put((java.lang.Object) "hi!", (java.lang.Object) predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate68, predicate74);
        collections.PredicateUtils predicateUtils77 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils77);
        int i79 = defaultedMap78.size();
        collections.PredicateUtils predicateUtils80 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils80);
        java.lang.Object obj83 = defaultedMap78.put((java.lang.Object) defaultedMap81, (java.lang.Object) 0.0f);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate84, predicate85);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils87);
        int i89 = defaultedMap88.size();
        java.lang.Object obj90 = defaultedMap78.remove((java.lang.Object) i89);
        boolean b91 = defaultedMap60.containsKey((java.lang.Object) defaultedMap78);
        java.lang.Object obj92 = defaultedMap15.get((java.lang.Object) defaultedMap60);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(obj92);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils11);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap15.values();
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) defaultedMap15);
        java.lang.String str23 = defaultedMap12.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }
}

