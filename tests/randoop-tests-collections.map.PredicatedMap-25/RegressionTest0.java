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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100.0f);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        java.util.Collection collection32 = defaultedMap29.values();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate27, predicate34);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set3);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.keySet();
        java.util.Collection collection12 = defaultedMap9.values();
        java.util.Collection collection13 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap17.entrySet();
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.entrySet();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        java.lang.Object obj26 = defaultedMap9.get((java.lang.Object) defaultedMap21);
        java.lang.String str27 = defaultedMap21.toString();
        java.lang.Object obj28 = defaultedMap5.get((java.lang.Object) defaultedMap21);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Collection collection36 = defaultedMap33.values();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate31, predicate38);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) map40);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Collection collection5 = defaultedMap2.values();
        java.util.Collection collection6 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap2.get((java.lang.Object) defaultedMap14);
        java.lang.String str20 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.keySet();
        java.util.Collection collection25 = defaultedMap22.values();
        java.util.Collection collection26 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set31 = defaultedMap30.entrySet();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) set31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i35 = defaultedMap34.size();
        java.util.Set set36 = defaultedMap34.entrySet();
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        java.lang.Object obj39 = defaultedMap22.get((java.lang.Object) defaultedMap34);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap22);
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) i10, (java.lang.Object) set14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) "{}");
        defaultedMap1.clear();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate25);
        java.lang.Object obj29 = null;
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map28, obj29);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate(map39, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap1.toString();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        boolean b40 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) set52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.entrySet();
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        defaultedMap55.clear();
        java.lang.Object obj60 = defaultedMap45.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj61 = defaultedMap13.remove((java.lang.Object) defaultedMap55);
        int i62 = defaultedMap55.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        java.lang.String str40 = defaultedMap21.toString();
        int i41 = defaultedMap21.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) set23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.entrySet();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) defaultedMap26);
        defaultedMap26.clear();
        java.lang.Object obj31 = defaultedMap14.get((java.lang.Object) defaultedMap26);
        java.lang.String str32 = defaultedMap14.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap4.put((java.lang.Object) map33, (java.lang.Object) predicate35);
        boolean b38 = defaultedMap4.containsValue((java.lang.Object) 10L);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) i14, (java.lang.Object) set18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap5);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) "hi!");
        boolean b23 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        defaultedMap31.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) set23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.entrySet();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) defaultedMap26);
        defaultedMap26.clear();
        java.lang.Object obj31 = defaultedMap14.get((java.lang.Object) defaultedMap26);
        java.lang.String str32 = defaultedMap14.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap14);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.keySet();
        java.util.Collection collection42 = defaultedMap39.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i48 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i51 = defaultedMap50.size();
        java.util.Set set52 = defaultedMap50.keySet();
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) i48, (java.lang.Object) set52);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap39.containsKey((java.lang.Object) predicate55);
        java.lang.Object obj57 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) b56);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap4.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj21 = defaultedMap4.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set7 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap5.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        java.lang.String str40 = defaultedMap21.toString();
        java.util.Set set41 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i44 = defaultedMap43.size();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 10.0f);
        boolean b47 = defaultedMap21.containsValue((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) 1);
        int i27 = defaultedMap17.size();
        java.lang.String str28 = defaultedMap17.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap4.clear();
        java.util.Set set6 = defaultedMap4.entrySet();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        boolean b40 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) set52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.entrySet();
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        defaultedMap55.clear();
        java.lang.Object obj60 = defaultedMap45.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj61 = defaultedMap13.remove((java.lang.Object) defaultedMap55);
        collections.Factory factory62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b11 = defaultedMap1.isEmpty();
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        java.util.Collection collection32 = defaultedMap29.values();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate27, predicate34);
        java.util.Set set37 = defaultedMap17.entrySet();
        java.util.Map map38 = null;
        try {
            defaultedMap17.putAll(map38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap12.clear();
        int i15 = defaultedMap12.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) "");
        java.util.Set set16 = defaultedMap9.keySet();
        java.lang.String str17 = defaultedMap9.toString();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i26 = defaultedMap25.size();
        java.util.Set set27 = defaultedMap25.keySet();
        java.util.Collection collection28 = defaultedMap25.values();
        java.util.Collection collection29 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set34 = defaultedMap33.entrySet();
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.entrySet();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap25.get((java.lang.Object) defaultedMap37);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap25);
        boolean b44 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i50 = defaultedMap49.size();
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b57 = defaultedMap53.containsKey((java.lang.Object) set56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i60 = defaultedMap59.size();
        java.util.Set set61 = defaultedMap59.entrySet();
        java.lang.Object obj62 = defaultedMap53.get((java.lang.Object) defaultedMap59);
        defaultedMap59.clear();
        java.lang.Object obj64 = defaultedMap49.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj65 = defaultedMap17.remove((java.lang.Object) defaultedMap59);
        boolean b66 = defaultedMap1.containsKey(obj65);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 0 + "'", obj62.equals((byte) 0));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i11 = defaultedMap10.size();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Collection collection13 = defaultedMap10.values();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) predicate15);
        java.util.Set set18 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        int i12 = defaultedMap7.size();
        java.util.Map map13 = null;
        try {
            defaultedMap7.putAll(map13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i21 = defaultedMap20.size();
        java.util.Set set22 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.keySet();
        java.util.Collection collection27 = defaultedMap24.values();
        java.util.Collection collection28 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.entrySet();
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap24.get((java.lang.Object) defaultedMap36);
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap20.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj44 = defaultedMap13.remove((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate25);
        boolean b30 = defaultedMap13.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap16.entrySet();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i21 = defaultedMap20.size();
        java.util.Set set22 = defaultedMap20.keySet();
        java.util.Collection collection23 = defaultedMap20.values();
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) set29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i33 = defaultedMap32.size();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        defaultedMap32.clear();
        java.lang.Object obj37 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        java.lang.String str38 = defaultedMap20.toString();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap20);
        java.lang.Object obj40 = defaultedMap14.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i43 = defaultedMap42.size();
        java.util.Set set44 = defaultedMap42.keySet();
        java.lang.Object obj45 = defaultedMap20.get((java.lang.Object) set44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj45);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.keySet();
        java.util.Collection collection7 = defaultedMap4.values();
        java.util.Collection collection8 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) set13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.entrySet();
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap4.get((java.lang.Object) defaultedMap16);
        java.lang.String str22 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.keySet();
        java.util.Collection collection27 = defaultedMap24.values();
        java.util.Collection collection28 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.entrySet();
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap24.get((java.lang.Object) defaultedMap36);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap24);
        boolean b43 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i54 = defaultedMap53.size();
        java.util.Set set55 = defaultedMap53.keySet();
        java.util.Collection collection56 = defaultedMap53.values();
        java.util.Collection collection57 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap61.entrySet();
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) set62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i66 = defaultedMap65.size();
        java.util.Set set67 = defaultedMap65.entrySet();
        java.lang.Object obj68 = defaultedMap59.get((java.lang.Object) defaultedMap65);
        defaultedMap65.clear();
        java.lang.Object obj70 = defaultedMap53.get((java.lang.Object) defaultedMap65);
        java.lang.String str71 = defaultedMap65.toString();
        java.lang.Object obj72 = defaultedMap49.get((java.lang.Object) defaultedMap65);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj74 = defaultedMap65.get((java.lang.Object) predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i78 = defaultedMap77.size();
        java.util.Set set79 = defaultedMap77.keySet();
        java.util.Collection collection80 = defaultedMap77.values();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate75, predicate82);
        java.lang.Object obj85 = defaultedMap45.remove((java.lang.Object) map84);
        java.lang.Object obj86 = defaultedMap16.get(obj85);
        boolean b87 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        collections.Factory factory88 = null;
        try {
            java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (byte) 0 + "'", obj70.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) 0 + "'", obj86.equals((byte) 0));
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap4.remove((java.lang.Object) defaultedMap14);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate25);
        java.util.Collection collection29 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i35 = defaultedMap34.size();
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.entrySet();
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i47 = defaultedMap46.size();
        java.util.Set set48 = defaultedMap46.entrySet();
        java.lang.Object obj49 = defaultedMap40.get((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set54 = defaultedMap53.entrySet();
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) set54);
        java.lang.Object obj56 = defaultedMap40.remove((java.lang.Object) set54);
        java.lang.Object obj57 = defaultedMap34.get(obj56);
        java.lang.Object obj58 = defaultedMap13.get(obj56);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) 0 + "'", obj49.equals((byte) 0));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (byte) 0 + "'", obj57.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        java.util.Collection collection6 = defaultedMap3.values();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.lang.Object obj17 = defaultedMap3.put((java.lang.Object) i12, (java.lang.Object) set16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.keySet();
        java.util.Collection collection29 = defaultedMap26.values();
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) defaultedMap38);
        defaultedMap38.clear();
        java.lang.Object obj43 = defaultedMap26.get((java.lang.Object) defaultedMap38);
        java.lang.String str44 = defaultedMap26.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap26);
        java.lang.Object obj46 = defaultedMap20.remove((java.lang.Object) defaultedMap26);
        defaultedMap3.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap50.clear();
        java.util.Set set52 = defaultedMap50.entrySet();
        java.util.Set set53 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.keySet();
        java.util.Collection collection58 = defaultedMap55.values();
        java.util.Collection collection59 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set64 = defaultedMap63.entrySet();
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) set64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i68 = defaultedMap67.size();
        java.util.Set set69 = defaultedMap67.entrySet();
        java.lang.Object obj70 = defaultedMap61.get((java.lang.Object) defaultedMap67);
        defaultedMap67.clear();
        java.lang.Object obj72 = defaultedMap55.get((java.lang.Object) defaultedMap67);
        java.lang.String str73 = defaultedMap67.toString();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i76 = defaultedMap75.size();
        java.util.Set set77 = defaultedMap75.keySet();
        java.util.Collection collection78 = defaultedMap75.values();
        java.util.Collection collection79 = defaultedMap75.values();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set84 = defaultedMap83.entrySet();
        boolean b85 = defaultedMap81.containsKey((java.lang.Object) set84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i88 = defaultedMap87.size();
        java.util.Set set89 = defaultedMap87.entrySet();
        java.lang.Object obj90 = defaultedMap81.get((java.lang.Object) defaultedMap87);
        defaultedMap87.clear();
        java.lang.Object obj92 = defaultedMap75.get((java.lang.Object) defaultedMap87);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) defaultedMap75);
        boolean b94 = defaultedMap67.isEmpty();
        java.lang.Object obj95 = defaultedMap50.get((java.lang.Object) b94);
        java.lang.Object obj96 = defaultedMap3.put(obj48, obj95);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (byte) 0 + "'", obj70.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (byte) 0 + "'", obj90.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (byte) 0 + "'", obj92.equals((byte) 0));
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + false + "'", obj95.equals(false));
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Collection collection15 = defaultedMap12.values();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i21 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) i21, (java.lang.Object) set25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap12);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap12.containsKey((java.lang.Object) predicate28);
        boolean b30 = defaultedMap6.equals((java.lang.Object) b29);
        boolean b31 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set34 = defaultedMap33.entrySet();
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Collection collection41 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set46 = defaultedMap45.entrySet();
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) set46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.entrySet();
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        defaultedMap49.clear();
        java.lang.Object obj54 = defaultedMap37.get((java.lang.Object) defaultedMap49);
        java.lang.String str55 = defaultedMap37.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap37);
        boolean b57 = defaultedMap6.equals((java.lang.Object) map56);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 0 + "'", obj52.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) collection11);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Collection collection9 = defaultedMap6.values();
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        java.lang.Object obj23 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        java.lang.String str24 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.keySet();
        java.util.Collection collection29 = defaultedMap26.values();
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) defaultedMap38);
        defaultedMap38.clear();
        java.lang.Object obj43 = defaultedMap26.get((java.lang.Object) defaultedMap38);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap26);
        java.lang.String str45 = defaultedMap26.toString();
        java.util.Set set46 = defaultedMap26.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i54 = defaultedMap53.size();
        java.util.Set set55 = defaultedMap53.keySet();
        java.util.Collection collection56 = defaultedMap53.values();
        java.util.Collection collection57 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap61.entrySet();
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) set62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i66 = defaultedMap65.size();
        java.util.Set set67 = defaultedMap65.entrySet();
        java.lang.Object obj68 = defaultedMap59.get((java.lang.Object) defaultedMap65);
        defaultedMap65.clear();
        java.lang.Object obj70 = defaultedMap53.get((java.lang.Object) defaultedMap65);
        java.lang.String str71 = defaultedMap65.toString();
        java.lang.Object obj72 = defaultedMap49.get((java.lang.Object) defaultedMap65);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj74 = defaultedMap65.get((java.lang.Object) predicate73);
        boolean b75 = defaultedMap1.containsKey((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (byte) 0 + "'", obj70.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate25);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.util.Set set8 = defaultedMap5.entrySet();
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap7.clear();
        java.util.Set set9 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.keySet();
        java.util.Collection collection14 = defaultedMap11.values();
        java.util.Collection collection15 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap23);
        java.lang.String str29 = defaultedMap11.toString();
        java.lang.Object obj30 = defaultedMap7.remove((java.lang.Object) str29);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.keySet();
        java.util.Collection collection42 = defaultedMap39.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i48 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i51 = defaultedMap50.size();
        java.util.Set set52 = defaultedMap50.keySet();
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) i48, (java.lang.Object) set52);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap39.containsKey((java.lang.Object) predicate55);
        boolean b57 = defaultedMap33.equals((java.lang.Object) b56);
        boolean b58 = defaultedMap33.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap33);
        java.util.Set set60 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.keySet();
        java.util.Collection collection48 = defaultedMap45.values();
        java.util.Collection collection49 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set54 = defaultedMap53.entrySet();
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) set54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i58 = defaultedMap57.size();
        java.util.Set set59 = defaultedMap57.entrySet();
        java.lang.Object obj60 = defaultedMap51.get((java.lang.Object) defaultedMap57);
        defaultedMap57.clear();
        java.lang.Object obj62 = defaultedMap45.get((java.lang.Object) defaultedMap57);
        java.lang.String str63 = defaultedMap57.toString();
        java.lang.Object obj64 = defaultedMap41.get((java.lang.Object) defaultedMap57);
        boolean b65 = defaultedMap13.containsValue((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 0 + "'", obj60.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 0 + "'", obj62.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (byte) 0 + "'", obj64.equals((byte) 0));
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        java.util.Collection collection6 = defaultedMap3.values();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.lang.Object obj17 = defaultedMap3.put((java.lang.Object) i12, (java.lang.Object) set16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        boolean b20 = defaultedMap3.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.entrySet();
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        defaultedMap3.putAll((java.util.Map) defaultedMap28);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 1);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap5.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) collection11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj22 = defaultedMap14.remove((java.lang.Object) set21);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) set21);
        int i24 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.util.Collection collection16 = defaultedMap13.values();
        java.util.Collection collection17 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i26 = defaultedMap25.size();
        java.util.Set set27 = defaultedMap25.entrySet();
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) defaultedMap25);
        java.lang.String str31 = defaultedMap25.toString();
        java.lang.Object obj32 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.util.Collection collection40 = defaultedMap37.values();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate35, predicate42);
        java.util.Set set45 = defaultedMap25.entrySet();
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) set45);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 0 + "'", obj32.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        java.lang.Object obj38 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        java.lang.String str39 = defaultedMap33.toString();
        java.lang.Object obj40 = defaultedMap17.get((java.lang.Object) defaultedMap33);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap33.get((java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.keySet();
        java.util.Collection collection48 = defaultedMap45.values();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate43, predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i55 = defaultedMap54.size();
        java.util.Set set56 = defaultedMap54.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i59 = defaultedMap58.size();
        java.util.Set set60 = defaultedMap58.keySet();
        java.util.Collection collection61 = defaultedMap58.values();
        java.util.Collection collection62 = defaultedMap58.values();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set67 = defaultedMap66.entrySet();
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) set67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i71 = defaultedMap70.size();
        java.util.Set set72 = defaultedMap70.entrySet();
        java.lang.Object obj73 = defaultedMap64.get((java.lang.Object) defaultedMap70);
        defaultedMap70.clear();
        java.lang.Object obj75 = defaultedMap58.get((java.lang.Object) defaultedMap70);
        java.lang.String str76 = defaultedMap70.toString();
        java.lang.Object obj77 = defaultedMap54.get((java.lang.Object) defaultedMap70);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj79 = defaultedMap70.get((java.lang.Object) predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i83 = defaultedMap82.size();
        java.util.Set set84 = defaultedMap82.keySet();
        java.util.Collection collection85 = defaultedMap82.values();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate86, predicate87);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate80, predicate87);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate43, predicate87);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate87);
        java.lang.Object obj92 = defaultedMap2.remove((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (byte) 0 + "'", obj73.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (byte) 0 + "'", obj75.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (byte) 0 + "'", obj77.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) 0 + "'", obj79.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.String str12 = defaultedMap5.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) str12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Collection collection18 = defaultedMap15.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap24.clear();
        java.lang.String str26 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Collection collection31 = defaultedMap28.values();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        java.lang.String str35 = defaultedMap28.toString();
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) str35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.keySet();
        java.util.Collection collection41 = defaultedMap38.values();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate43);
        boolean b45 = defaultedMap24.containsValue((java.lang.Object) predicate42);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) predicate42);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.lang.Object obj3 = null;
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate25);
        java.util.Collection collection29 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Collection collection36 = defaultedMap33.values();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i42 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) i42, (java.lang.Object) set46);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap52.entrySet();
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.keySet();
        java.util.Collection collection59 = defaultedMap56.values();
        java.util.Collection collection60 = defaultedMap56.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set65 = defaultedMap64.entrySet();
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) set65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i69 = defaultedMap68.size();
        java.util.Set set70 = defaultedMap68.entrySet();
        java.lang.Object obj71 = defaultedMap62.get((java.lang.Object) defaultedMap68);
        defaultedMap68.clear();
        java.lang.Object obj73 = defaultedMap56.get((java.lang.Object) defaultedMap68);
        java.lang.String str74 = defaultedMap56.toString();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap56);
        java.lang.Object obj76 = defaultedMap50.remove((java.lang.Object) defaultedMap56);
        defaultedMap33.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj78 = defaultedMap13.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set83 = defaultedMap82.entrySet();
        boolean b84 = defaultedMap80.containsKey((java.lang.Object) set83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i87 = defaultedMap86.size();
        java.util.Set set88 = defaultedMap86.entrySet();
        java.lang.Object obj89 = defaultedMap80.get((java.lang.Object) defaultedMap86);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, obj89);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (byte) 0 + "'", obj73.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) 0 + "'", obj78.equals((byte) 0));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (byte) 0 + "'", obj89.equals((byte) 0));
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.String str13 = defaultedMap10.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.util.Set set8 = defaultedMap5.entrySet();
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap4.clear();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        boolean b10 = defaultedMap6.equals((java.lang.Object) 1L);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Collection collection18 = defaultedMap15.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i24 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.keySet();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) i24, (java.lang.Object) set28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap15);
        java.lang.Object obj31 = defaultedMap6.put(obj11, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap36.clear();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap33.containsValue((java.lang.Object) defaultedMap36);
        boolean b40 = defaultedMap13.containsKey((java.lang.Object) defaultedMap33);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) b40);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.lang.Object obj3 = null;
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) set9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Collection collection9 = defaultedMap6.values();
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        java.lang.Object obj23 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        java.lang.String str24 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.keySet();
        java.util.Collection collection29 = defaultedMap26.values();
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap34.entrySet();
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) defaultedMap38);
        defaultedMap38.clear();
        java.lang.Object obj43 = defaultedMap26.get((java.lang.Object) defaultedMap38);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap26);
        boolean b45 = defaultedMap18.isEmpty();
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) b45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set49 = defaultedMap48.entrySet();
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i53 = defaultedMap52.size();
        java.util.Set set54 = defaultedMap52.keySet();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Collection collection56 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set61 = defaultedMap60.entrySet();
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) set61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i65 = defaultedMap64.size();
        java.util.Set set66 = defaultedMap64.entrySet();
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) defaultedMap64);
        defaultedMap64.clear();
        java.lang.Object obj69 = defaultedMap52.get((java.lang.Object) defaultedMap64);
        java.lang.String str70 = defaultedMap52.toString();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) map71);
        defaultedMap1.putAll(map71);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (byte) 0 + "'", obj69.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i11 = defaultedMap10.size();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Collection collection13 = defaultedMap10.values();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) predicate15);
        int i18 = defaultedMap4.size();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) collection24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i28 = defaultedMap27.size();
        java.util.Set set29 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Collection collection34 = defaultedMap31.values();
        java.util.Collection collection35 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set40 = defaultedMap39.entrySet();
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) set40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i44 = defaultedMap43.size();
        java.util.Set set45 = defaultedMap43.entrySet();
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) defaultedMap43);
        defaultedMap43.clear();
        java.lang.Object obj48 = defaultedMap31.get((java.lang.Object) defaultedMap43);
        java.lang.String str49 = defaultedMap43.toString();
        java.lang.Object obj50 = defaultedMap27.get((java.lang.Object) defaultedMap43);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) 0 + "'", obj48.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 0 + "'", obj50.equals((byte) 0));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.entrySet();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap5.isEmpty();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        int i17 = defaultedMap1.size();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.String str12 = defaultedMap5.toString();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) str12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        java.util.Collection collection6 = defaultedMap3.values();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.lang.Object obj17 = defaultedMap3.put((java.lang.Object) i12, (java.lang.Object) set16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.keySet();
        java.util.Collection collection20 = defaultedMap17.values();
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) defaultedMap29);
        defaultedMap29.clear();
        java.lang.Object obj34 = defaultedMap17.get((java.lang.Object) defaultedMap29);
        java.lang.String str35 = defaultedMap29.toString();
        java.lang.Object obj36 = defaultedMap13.get((java.lang.Object) defaultedMap29);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Collection collection47 = defaultedMap44.values();
        java.util.Collection collection48 = defaultedMap44.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap52.entrySet();
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) set53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.lang.Object obj59 = defaultedMap50.get((java.lang.Object) defaultedMap56);
        defaultedMap56.clear();
        java.lang.Object obj61 = defaultedMap44.get((java.lang.Object) defaultedMap56);
        java.lang.String str62 = defaultedMap56.toString();
        java.lang.Object obj63 = defaultedMap40.get((java.lang.Object) defaultedMap56);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap56.get((java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate37, predicate64);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 0 + "'", obj32.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (byte) 0 + "'", obj59.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) 0 + "'", obj61.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 0 + "'", obj65.equals((byte) 0));
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.util.Set set25 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.entrySet();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection14 = defaultedMap9.values();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        int i12 = defaultedMap7.size();
        java.util.Set set13 = defaultedMap7.keySet();
        defaultedMap7.clear();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap12.clear();
        int i15 = defaultedMap12.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i15);
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) set23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.entrySet();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) defaultedMap26);
        defaultedMap26.clear();
        java.lang.Object obj31 = defaultedMap14.get((java.lang.Object) defaultedMap26);
        java.lang.String str32 = defaultedMap14.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap14);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        java.util.Set set35 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i42 = defaultedMap41.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set48 = defaultedMap47.entrySet();
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) set48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i52 = defaultedMap51.size();
        java.util.Set set53 = defaultedMap51.entrySet();
        java.lang.Object obj54 = defaultedMap45.get((java.lang.Object) defaultedMap51);
        defaultedMap51.clear();
        java.lang.Object obj56 = defaultedMap41.remove((java.lang.Object) defaultedMap51);
        java.util.Set set57 = defaultedMap41.keySet();
        java.lang.String str58 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 1);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i20 = defaultedMap19.size();
        java.util.Set set21 = defaultedMap19.keySet();
        java.util.Collection collection22 = defaultedMap19.values();
        java.util.Collection collection23 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        defaultedMap31.clear();
        java.lang.Object obj36 = defaultedMap19.get((java.lang.Object) defaultedMap31);
        java.lang.String str37 = defaultedMap31.toString();
        java.lang.Object obj38 = defaultedMap15.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) 1);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i36 = defaultedMap35.size();
        java.util.Set set37 = defaultedMap35.entrySet();
        boolean b38 = defaultedMap21.containsValue((java.lang.Object) defaultedMap35);
        int i39 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Collection collection44 = defaultedMap41.values();
        java.lang.Object obj45 = defaultedMap21.get((java.lang.Object) collection44);
        boolean b46 = defaultedMap1.equals(obj45);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 0 + "'", obj32.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0.0d + "'", obj33.equals(0.0d));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.String str13 = defaultedMap10.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.keySet();
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1L);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) 1L);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap4.remove((java.lang.Object) defaultedMap14);
        java.util.Set set20 = defaultedMap4.keySet();
        java.util.Set set21 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        java.util.Collection collection32 = defaultedMap29.values();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate27, predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap38.clear();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Set set41 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i44 = defaultedMap43.size();
        java.util.Set set45 = defaultedMap43.keySet();
        java.util.Collection collection46 = defaultedMap43.values();
        java.util.Collection collection47 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) set52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.entrySet();
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        defaultedMap55.clear();
        java.lang.Object obj60 = defaultedMap43.get((java.lang.Object) defaultedMap55);
        java.lang.String str61 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i64 = defaultedMap63.size();
        java.util.Set set65 = defaultedMap63.keySet();
        java.util.Collection collection66 = defaultedMap63.values();
        java.util.Collection collection67 = defaultedMap63.values();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set72 = defaultedMap71.entrySet();
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) set72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i76 = defaultedMap75.size();
        java.util.Set set77 = defaultedMap75.entrySet();
        java.lang.Object obj78 = defaultedMap69.get((java.lang.Object) defaultedMap75);
        defaultedMap75.clear();
        java.lang.Object obj80 = defaultedMap63.get((java.lang.Object) defaultedMap75);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) defaultedMap63);
        boolean b82 = defaultedMap55.isEmpty();
        java.lang.Object obj83 = defaultedMap38.get((java.lang.Object) b82);
        java.lang.Object obj84 = defaultedMap17.get((java.lang.Object) b82);
        java.util.Set set85 = defaultedMap17.keySet();
        collections.Factory factory86 = null;
        try {
            java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 0 + "'", obj60.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) 0 + "'", obj78.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (byte) 0 + "'", obj80.equals((byte) 0));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + false + "'", obj83.equals(false));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) 0 + "'", obj84.equals((byte) 0));
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.String str28 = defaultedMap21.toString();
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        boolean b30 = defaultedMap1.isEmpty();
        java.lang.String str31 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap12.clear();
        int i15 = defaultedMap12.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i15);
        java.util.Set set17 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap4.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i28 = defaultedMap27.size();
        java.util.Set set29 = defaultedMap27.keySet();
        java.util.Collection collection30 = defaultedMap27.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i36 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) i36, (java.lang.Object) set40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap27.containsKey((java.lang.Object) predicate43);
        boolean b45 = defaultedMap21.equals((java.lang.Object) b44);
        boolean b46 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set49 = defaultedMap48.entrySet();
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i53 = defaultedMap52.size();
        java.util.Set set54 = defaultedMap52.keySet();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Collection collection56 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set61 = defaultedMap60.entrySet();
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) set61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i65 = defaultedMap64.size();
        java.util.Set set66 = defaultedMap64.entrySet();
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) defaultedMap64);
        defaultedMap64.clear();
        java.lang.Object obj69 = defaultedMap52.get((java.lang.Object) defaultedMap64);
        java.lang.String str70 = defaultedMap52.toString();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap52);
        boolean b72 = defaultedMap21.equals((java.lang.Object) map71);
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = defaultedMap14.put((java.lang.Object) defaultedMap21, obj73);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (byte) 0 + "'", obj69.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Collection collection10 = defaultedMap7.values();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) i16, (java.lang.Object) set20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap7);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap7.containsKey((java.lang.Object) predicate23);
        boolean b25 = defaultedMap1.equals((java.lang.Object) b24);
        boolean b26 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i33 = defaultedMap32.size();
        java.util.Set set34 = defaultedMap32.keySet();
        java.util.Collection collection35 = defaultedMap32.values();
        java.util.Collection collection36 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set41 = defaultedMap40.entrySet();
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) set41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.lang.Object obj47 = defaultedMap38.get((java.lang.Object) defaultedMap44);
        defaultedMap44.clear();
        java.lang.Object obj49 = defaultedMap32.get((java.lang.Object) defaultedMap44);
        java.lang.String str50 = defaultedMap44.toString();
        java.lang.Object obj51 = defaultedMap28.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj53 = defaultedMap28.get((java.lang.Object) 10);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) 10);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) 0 + "'", obj49.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap5.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) map24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i28 = defaultedMap27.size();
        java.util.Set set29 = defaultedMap27.keySet();
        java.util.Collection collection30 = defaultedMap27.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.String str13 = defaultedMap10.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set21 = defaultedMap20.entrySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.keySet();
        java.util.Collection collection27 = defaultedMap24.values();
        java.util.Collection collection28 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.entrySet();
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap24.get((java.lang.Object) defaultedMap36);
        java.lang.String str42 = defaultedMap24.toString();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap24);
        java.lang.Object obj44 = defaultedMap18.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i47 = defaultedMap46.size();
        java.util.Set set48 = defaultedMap46.keySet();
        java.lang.Object obj49 = defaultedMap24.get((java.lang.Object) set48);
        java.lang.Object obj50 = defaultedMap10.get(obj49);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) 0 + "'", obj49.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 0 + "'", obj50.equals((byte) 0));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 1);
        int i13 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i21 = defaultedMap20.size();
        java.util.Set set22 = defaultedMap20.keySet();
        java.util.Collection collection23 = defaultedMap20.values();
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set29 = defaultedMap28.entrySet();
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) set29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i33 = defaultedMap32.size();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        defaultedMap32.clear();
        java.lang.Object obj37 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        java.lang.String str38 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap16.get((java.lang.Object) defaultedMap32);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Collection collection47 = defaultedMap44.values();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate42, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap53.clear();
        java.lang.String str55 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i58 = defaultedMap57.size();
        java.util.Set set59 = defaultedMap57.keySet();
        java.util.Collection collection60 = defaultedMap57.values();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.lang.String str64 = defaultedMap57.toString();
        java.lang.Object obj65 = defaultedMap53.get((java.lang.Object) str64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i68 = defaultedMap67.size();
        java.util.Set set69 = defaultedMap67.keySet();
        java.util.Collection collection70 = defaultedMap67.values();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        boolean b74 = defaultedMap53.containsValue((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap76.clear();
        java.lang.String str78 = defaultedMap76.toString();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i81 = defaultedMap80.size();
        java.util.Set set82 = defaultedMap80.keySet();
        java.util.Collection collection83 = defaultedMap80.values();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate84, predicate85);
        java.lang.String str87 = defaultedMap80.toString();
        java.lang.Object obj88 = defaultedMap76.get((java.lang.Object) str87);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i91 = defaultedMap90.size();
        java.util.Set set92 = defaultedMap90.keySet();
        java.util.Collection collection93 = defaultedMap90.values();
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap90, predicate94, predicate95);
        boolean b97 = defaultedMap76.containsValue((java.lang.Object) predicate94);
        boolean b98 = defaultedMap53.containsKey((java.lang.Object) predicate94);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate94);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + false + "'", obj65.equals(false));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "{}" + "'", str87.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + false + "'", obj88.equals(false));
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) predicate25);
        boolean b27 = defaultedMap17.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Collection collection10 = defaultedMap7.values();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i16 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) i16, (java.lang.Object) set20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap7);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap7.containsKey((java.lang.Object) predicate23);
        boolean b25 = defaultedMap1.equals((java.lang.Object) b24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i5 = defaultedMap4.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i11 = defaultedMap10.size();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Collection collection13 = defaultedMap10.values();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) i19, (java.lang.Object) set23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Collection collection37 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set42 = defaultedMap41.entrySet();
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.entrySet();
        java.lang.Object obj48 = defaultedMap39.get((java.lang.Object) defaultedMap45);
        defaultedMap45.clear();
        java.lang.Object obj50 = defaultedMap33.get((java.lang.Object) defaultedMap45);
        java.lang.String str51 = defaultedMap33.toString();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap33);
        java.lang.Object obj53 = defaultedMap27.remove((java.lang.Object) defaultedMap33);
        defaultedMap10.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i60 = defaultedMap59.size();
        defaultedMap56.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap27.containsValue((java.lang.Object) defaultedMap56);
        int i63 = defaultedMap56.size();
        java.lang.Object obj64 = defaultedMap1.remove((java.lang.Object) i63);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) 0 + "'", obj48.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 0 + "'", obj50.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) i14, (java.lang.Object) set18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap5);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) "hi!");
        java.util.Set set23 = defaultedMap5.keySet();
        java.util.Set set24 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 1);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set16 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i20 = defaultedMap19.size();
        java.util.Set set21 = defaultedMap19.keySet();
        java.util.Collection collection22 = defaultedMap19.values();
        java.util.Collection collection23 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        defaultedMap31.clear();
        java.lang.Object obj36 = defaultedMap19.get((java.lang.Object) defaultedMap31);
        java.lang.String str37 = defaultedMap19.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.keySet();
        java.util.Collection collection43 = defaultedMap40.values();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i49 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i52 = defaultedMap51.size();
        java.util.Set set53 = defaultedMap51.keySet();
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) i49, (java.lang.Object) set53);
        boolean b55 = defaultedMap19.containsKey((java.lang.Object) defaultedMap40);
        boolean b56 = defaultedMap1.equals((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap17.toString();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) 10);
        java.util.Set set27 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate25);
        java.util.Collection collection29 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Collection collection36 = defaultedMap33.values();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i42 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) i42, (java.lang.Object) set46);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap52.entrySet();
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.keySet();
        java.util.Collection collection59 = defaultedMap56.values();
        java.util.Collection collection60 = defaultedMap56.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set65 = defaultedMap64.entrySet();
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) set65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i69 = defaultedMap68.size();
        java.util.Set set70 = defaultedMap68.entrySet();
        java.lang.Object obj71 = defaultedMap62.get((java.lang.Object) defaultedMap68);
        defaultedMap68.clear();
        java.lang.Object obj73 = defaultedMap56.get((java.lang.Object) defaultedMap68);
        java.lang.String str74 = defaultedMap56.toString();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap56);
        java.lang.Object obj76 = defaultedMap50.remove((java.lang.Object) defaultedMap56);
        defaultedMap33.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj78 = defaultedMap13.get((java.lang.Object) defaultedMap33);
        java.lang.String str79 = defaultedMap13.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (byte) 0 + "'", obj73.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) 0 + "'", obj78.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Collection collection9 = defaultedMap6.values();
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        java.lang.Object obj23 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.keySet();
        java.util.Collection collection29 = defaultedMap26.values();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate30);
        java.util.Collection collection34 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.keySet();
        java.util.Collection collection41 = defaultedMap38.values();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i47 = defaultedMap46.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.keySet();
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) i47, (java.lang.Object) set51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set58 = defaultedMap57.entrySet();
        defaultedMap57.clear();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i62 = defaultedMap61.size();
        java.util.Set set63 = defaultedMap61.keySet();
        java.util.Collection collection64 = defaultedMap61.values();
        java.util.Collection collection65 = defaultedMap61.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set70 = defaultedMap69.entrySet();
        boolean b71 = defaultedMap67.containsKey((java.lang.Object) set70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        int i74 = defaultedMap73.size();
        java.util.Set set75 = defaultedMap73.entrySet();
        java.lang.Object obj76 = defaultedMap67.get((java.lang.Object) defaultedMap73);
        defaultedMap73.clear();
        java.lang.Object obj78 = defaultedMap61.get((java.lang.Object) defaultedMap73);
        java.lang.String str79 = defaultedMap61.toString();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) defaultedMap61);
        java.lang.Object obj81 = defaultedMap55.remove((java.lang.Object) defaultedMap61);
        defaultedMap38.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj83 = defaultedMap18.get((java.lang.Object) defaultedMap38);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (byte) 0 + "'", obj76.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) 0 + "'", obj78.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (byte) 0 + "'", obj83.equals((byte) 0));
        org.junit.Assert.assertNotNull(map84);
    }
}

