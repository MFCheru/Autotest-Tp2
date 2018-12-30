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
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator1.setIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) filterIterator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        try {
            java.util.Map map7 = collections.map.PredicatedMap.decorate(map0, predicate2, predicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b6 = defaultedMap5.isEmpty();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        java.lang.String str24 = defaultedMap19.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        boolean b24 = defaultedMap5.isEmpty();
        java.lang.String str25 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        java.util.Set set10 = defaultedMap5.entrySet();
        java.util.Collection collection11 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap20.clear();
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1L));
        boolean b25 = defaultedMap11.containsValue((java.lang.Object) b24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate26, predicate37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap11.putAll((java.util.Map) defaultedMap43);
        java.util.Set set45 = defaultedMap11.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator20.setPredicate(predicate21);
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        defaultedMap16.putAll((java.util.Map) defaultedMap30);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator36);
        collections.Predicate predicate41 = filterIterator36.getPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        filterIterator45.setIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate41, predicate56);
        boolean b60 = defaultedMap5.containsValue((java.lang.Object) map59);
        boolean b62 = defaultedMap5.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap5.get(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate38, predicate49);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        filterIterator60.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate38, predicate63);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap5.get(obj68);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = null;
        java.lang.Object obj17 = defaultedMap11.put(obj15, (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        java.util.Iterator iterator14 = filterIterator10.getIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        filterIterator30.setIterator((java.util.Iterator) filterIterator31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate46);
        java.util.Iterator iterator48 = filterIterator44.getIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator44);
        java.lang.Object obj50 = defaultedMap35.get((java.lang.Object) filterIterator44);
        boolean b51 = defaultedMap22.equals((java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        filterIterator52.setIterator((java.util.Iterator) filterIterator53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        filterIterator58.setIterator((java.util.Iterator) filterIterator59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) filterIterator59);
        java.lang.String str64 = defaultedMap63.toString();
        defaultedMap63.clear();
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        filterIterator67.setIterator((java.util.Iterator) filterIterator68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) filterIterator68);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        filterIterator73.setIterator((java.util.Iterator) filterIterator74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate76, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        filterIterator80.setIterator((java.util.Iterator) filterIterator81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) filterIterator81);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        filterIterator86.setIterator((java.util.Iterator) filterIterator87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87, predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate89, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate78, predicate89);
        filterIterator44.setPredicate(predicate78);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate78);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        int i26 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) filterIterator23);
        java.lang.Object obj29 = defaultedMap5.get((java.lang.Object) filterIterator23);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 'a');
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) '#');
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 100.0f);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.lang.String str34 = defaultedMap33.toString();
        defaultedMap33.clear();
        boolean b36 = defaultedMap19.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        collections.Predicate predicate26 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        java.util.Iterator iterator38 = filterIterator34.getIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate54);
        filterIterator27.setPredicate(predicate54);
        filterIterator15.setPredicate(predicate54);
        java.lang.Object obj60 = defaultedMap5.remove((java.lang.Object) predicate54);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj18 = defaultedMap5.get((java.lang.Object) filterIterator13);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator15, predicate20);
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) iterator15);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator20.setPredicate(predicate21);
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        defaultedMap16.putAll((java.util.Map) defaultedMap30);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator36);
        collections.Predicate predicate41 = filterIterator36.getPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        filterIterator45.setIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate41, predicate56);
        boolean b60 = defaultedMap5.containsValue((java.lang.Object) map59);
        java.util.Set set61 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.Predicate predicate30 = filterIterator25.getPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate30, predicate45);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) filterIterator50);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap54.get((java.lang.Object) predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        filterIterator65.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        boolean b70 = defaultedMap54.containsValue((java.lang.Object) predicate68);
        boolean b71 = defaultedMap19.containsKey((java.lang.Object) defaultedMap54);
        collections.Factory factory72 = null;
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator0, predicate5);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        try {
            java.lang.Object obj9 = filterIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj18 = defaultedMap5.get((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Iterator iterator33 = filterIterator29.getIterator();
        filterIterator23.setIterator((java.util.Iterator) filterIterator29);
        filterIterator19.setIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) filterIterator19);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        boolean b29 = defaultedMap20.containsKey((java.lang.Object) "hi!");
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator30, predicate35);
        java.lang.Object obj38 = defaultedMap20.get((java.lang.Object) iterator30);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj38);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap11.containsKey(obj40);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b6 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) collection20);
        java.util.Collection collection22 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        filterIterator23.setIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj29 = defaultedMap5.remove((java.lang.Object) defaultedMap28);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate23);
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) "hi!");
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator27, predicate32);
        java.lang.Object obj35 = defaultedMap17.get((java.lang.Object) iterator27);
        boolean b36 = defaultedMap10.equals((java.lang.Object) iterator27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate26, predicate37);
        defaultedMap11.clear();
        java.util.Collection collection43 = defaultedMap11.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) predicate19);
        java.util.Set set22 = defaultedMap5.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap5.get(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate38, predicate49);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        filterIterator60.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate38, predicate63);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate71);
        java.util.Iterator iterator73 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        filterIterator74.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        filterIterator69.setIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        filterIterator80.setIterator((java.util.Iterator) filterIterator81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) filterIterator81);
        collections.Predicate predicate86 = filterIterator81.getPredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj88 = defaultedMap5.put((java.lang.Object) filterIterator79, (java.lang.Object) filterIterator81);
        collections.Factory factory89 = null;
        try {
            java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = filterIterator1.getIterator();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(iterator6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        boolean b6 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) collection20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap19.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.String str35 = defaultedMap34.toString();
        defaultedMap34.clear();
        java.lang.String str37 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b40 = defaultedMap34.containsKey((java.lang.Object) defaultedMap39);
        defaultedMap19.putAll((java.util.Map) defaultedMap39);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate43);
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj50 = defaultedMap5.get((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap5.get(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate38, predicate49);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        filterIterator60.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate38, predicate63);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate71);
        java.util.Iterator iterator73 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        filterIterator74.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        filterIterator69.setIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        filterIterator80.setIterator((java.util.Iterator) filterIterator81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) filterIterator81);
        collections.Predicate predicate86 = filterIterator81.getPredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj88 = defaultedMap5.put((java.lang.Object) filterIterator79, (java.lang.Object) filterIterator81);
        java.util.Iterator iterator89 = filterIterator81.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(iterator89);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        java.util.Collection collection28 = defaultedMap20.values();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) predicate29);
        boolean b31 = defaultedMap11.containsKey((java.lang.Object) defaultedMap20);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        filterIterator44.setIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate49);
        boolean b52 = defaultedMap43.containsKey((java.lang.Object) "hi!");
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator53, predicate58);
        java.lang.Object obj61 = defaultedMap43.get((java.lang.Object) iterator53);
        defaultedMap20.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate43);
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        java.util.Set set49 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        filterIterator50.setIterator((java.util.Iterator) filterIterator51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        java.lang.String str56 = defaultedMap55.toString();
        defaultedMap55.clear();
        java.lang.String str58 = defaultedMap55.toString();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        filterIterator59.setIterator((java.util.Iterator) filterIterator60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) filterIterator60);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        filterIterator65.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate68, predicate70);
        boolean b73 = defaultedMap64.containsKey((java.lang.Object) "hi!");
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        filterIterator76.setIterator((java.util.Iterator) filterIterator77);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator74, predicate79);
        java.lang.Object obj82 = defaultedMap64.get((java.lang.Object) iterator74);
        java.lang.Object obj83 = defaultedMap55.get(obj82);
        java.lang.Object obj84 = defaultedMap5.remove(obj82);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b2 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap5.get(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate38, predicate49);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        filterIterator60.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate38, predicate63);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate71);
        java.util.Iterator iterator73 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        filterIterator74.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        filterIterator69.setIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        filterIterator80.setIterator((java.util.Iterator) filterIterator81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) filterIterator81);
        collections.Predicate predicate86 = filterIterator81.getPredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj88 = defaultedMap5.put((java.lang.Object) filterIterator79, (java.lang.Object) filterIterator81);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        filterIterator90.setPredicate(predicate91);
        filterIterator89.setIterator((java.util.Iterator) filterIterator90);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) filterIterator90);
        collections.Predicate predicate95 = filterIterator90.getPredicate();
        collections.iterators.FilterIterator filterIterator96 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator90);
        filterIterator79.setIterator((java.util.Iterator) filterIterator90);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate95);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        boolean b24 = defaultedMap5.isEmpty();
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.lang.Object obj30 = defaultedMap19.get((java.lang.Object) filterIterator27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1L));
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.Predicate predicate30 = filterIterator25.getPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        java.util.Iterator iterator42 = filterIterator38.getIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        filterIterator44.setIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        filterIterator47.setIterator((java.util.Iterator) filterIterator48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        filterIterator53.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate58);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate58);
        filterIterator31.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        filterIterator63.setIterator((java.util.Iterator) filterIterator64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) filterIterator64);
        collections.Predicate predicate69 = filterIterator64.getPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate58, predicate69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.util.Collection collection8 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        java.util.Iterator iterator5 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        java.util.Iterator iterator17 = filterIterator13.getIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate33);
        filterIterator1.setPredicate(predicate33);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.Predicate predicate30 = filterIterator25.getPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate30, predicate45);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        filterIterator49.setIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) filterIterator50);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap54.get((java.lang.Object) predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        filterIterator65.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        boolean b70 = defaultedMap54.containsValue((java.lang.Object) predicate68);
        boolean b71 = defaultedMap19.containsKey((java.lang.Object) defaultedMap54);
        boolean b72 = defaultedMap54.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate26, predicate37);
        defaultedMap11.clear();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        filterIterator57.setIterator((java.util.Iterator) filterIterator58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        java.lang.String str63 = defaultedMap62.toString();
        defaultedMap62.clear();
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        defaultedMap48.putAll((java.util.Map) defaultedMap62);
        defaultedMap11.putAll((java.util.Map) defaultedMap48);
        boolean b68 = defaultedMap11.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        filterIterator70.setIterator((java.util.Iterator) filterIterator71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) filterIterator71);
        collections.Predicate predicate76 = filterIterator71.getPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate69, predicate76);
        java.util.Map map79 = collections.map.DefaultedMap.decorate(map77, (java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        java.util.Iterator iterator31 = filterIterator27.getIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator27);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) filterIterator27);
        boolean b34 = defaultedMap5.equals((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap40.get((java.lang.Object) predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        filterIterator56.setIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate59);
        java.util.Iterator iterator61 = filterIterator57.getIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        filterIterator63.setIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        filterIterator66.setIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) filterIterator67);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate77);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate77);
        boolean b82 = defaultedMap5.containsKey((java.lang.Object) map81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        collections.Predicate predicate85 = filterIterator84.getPredicate();
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator84);
        collections.Predicate predicate87 = filterIterator84.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(predicate87);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        java.util.Iterator iterator31 = filterIterator27.getIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator27);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) filterIterator27);
        boolean b34 = defaultedMap5.equals((java.lang.Object) filterIterator27);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        filterIterator35.setIterator((java.util.Iterator) filterIterator36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap40.get((java.lang.Object) predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        filterIterator56.setIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate59);
        java.util.Iterator iterator61 = filterIterator57.getIterator();
        filterIterator51.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        filterIterator63.setIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        filterIterator66.setIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) filterIterator67);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator72.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate77);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate77);
        boolean b82 = defaultedMap5.containsKey((java.lang.Object) map81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap84);
        int i86 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) 1L, (java.lang.Object) (short) 1);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap5.get(obj10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate38, predicate49);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        filterIterator60.setIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate38, predicate63);
        java.util.Collection collection68 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate26, predicate37);
        defaultedMap11.clear();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        filterIterator43.setIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        filterIterator57.setIterator((java.util.Iterator) filterIterator58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        java.lang.String str63 = defaultedMap62.toString();
        defaultedMap62.clear();
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        defaultedMap48.putAll((java.util.Map) defaultedMap62);
        defaultedMap11.putAll((java.util.Map) defaultedMap48);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        boolean b72 = defaultedMap48.containsValue((java.lang.Object) filterIterator68);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        java.util.Iterator iterator26 = filterIterator22.getIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate42);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicate42);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        java.util.Iterator iterator5 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        filterIterator1.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate11);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        filterIterator9.setIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate15 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        java.util.Iterator iterator27 = filterIterator23.getIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate43);
        filterIterator16.setPredicate(predicate43);
        filterIterator4.setPredicate(predicate43);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1L));
        java.util.Set set24 = defaultedMap19.entrySet();
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap31);
        boolean b33 = defaultedMap31.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate7);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.Predicate predicate10 = filterIterator6.getPredicate();
        filterIterator1.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator18);
        collections.Predicate predicate23 = filterIterator18.getPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        filterIterator25.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        filterIterator30.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        java.util.Iterator iterator35 = filterIterator31.getIterator();
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        filterIterator40.setIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate49, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate51);
        filterIterator24.setPredicate(predicate51);
        filterIterator12.setPredicate(predicate51);
        filterIterator1.setPredicate(predicate51);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        java.util.Iterator iterator18 = filterIterator14.getIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj20 = defaultedMap5.get((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        java.util.Iterator iterator26 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        filterIterator22.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator14.setIterator((java.util.Iterator) filterIterator30);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        java.util.Iterator iterator26 = filterIterator22.getIterator();
        filterIterator16.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate42);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicate42);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        filterIterator47.setIterator((java.util.Iterator) filterIterator48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        filterIterator53.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate58);
        java.util.Collection collection60 = defaultedMap52.values();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        filterIterator61.setIterator((java.util.Iterator) filterIterator62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator62);
        java.lang.String str67 = defaultedMap66.toString();
        defaultedMap66.clear();
        boolean b70 = defaultedMap66.equals((java.lang.Object) (-1L));
        java.util.Set set71 = defaultedMap66.entrySet();
        java.lang.Object obj72 = defaultedMap52.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj74 = defaultedMap66.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap(obj74);
        defaultedMap5.putAll((java.util.Map) defaultedMap75);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj74);
    }
}

